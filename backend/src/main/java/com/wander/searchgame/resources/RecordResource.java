package com.wander.searchgame.resources;

import com.wander.searchgame.dto.RecordDTO;
import com.wander.searchgame.dto.RecordInsertDTO;
import com.wander.searchgame.services.RecordService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
