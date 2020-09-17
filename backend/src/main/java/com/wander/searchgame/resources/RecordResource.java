package com.wander.searchgame.resources;

import java.time.Instant;
import java.util.List;

import com.wander.searchgame.dto.RecordDTO;
import com.wander.searchgame.dto.RecordInsertDTO;
import com.wander.searchgame.services.RecordService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/records")
public class RecordResource {

    @Autowired
    RecordService recordService;

    @PostMapping
    public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO dto) {
        RecordDTO recordDto = recordService.saveRecord(dto);

        return ResponseEntity.ok().body(recordDto);
    }

    @GetMapping
    public ResponseEntity<Page<RecordDTO>> findAll(@RequestParam(value = "min", defaultValue = "") String min,
            @RequestParam(value = "max", defaultValue = "") String max,
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "linesPerPage", defaultValue = "0") Integer linesPerPage,
            @RequestParam(value = "orderBy", defaultValue = "moment") String orderBy,
            @RequestParam(value = "direction", defaultValue = "DESC") String direction) {

        Instant minDate = min.equals("") ? null : Instant.parse(min);
        Instant maxDate = max.equals("") ? null : Instant.parse(max);

        if (linesPerPage == 0) {
            linesPerPage = Integer.MAX_VALUE;
        }

        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
        Page<RecordDTO> records = recordService.findByMoments(minDate, maxDate, pageRequest);
        return ResponseEntity.ok().body(records);

    }

}
