package com.wander.searchgame.services;

import java.time.Instant;

import com.wander.searchgame.dto.RecordDTO;
import com.wander.searchgame.dto.RecordInsertDTO;
import com.wander.searchgame.entities.Game;
import com.wander.searchgame.entities.Record;
import com.wander.searchgame.repositories.GameRepository;
import com.wander.searchgame.repositories.RecordRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RecordService {

    @Autowired
    RecordRepository recordRepository;

    @Autowired
    GameRepository gameRepository;

    @Transactional
    public RecordDTO saveRecord(RecordInsertDTO recordInsert) {

        Record record = new Record();
        record.setName(recordInsert.getName());
        record.setAge(recordInsert.getAge());
        record.setMoment(Instant.now());

        Game game = gameRepository.getOne(recordInsert.getGameId());
        record.setGame(game);

        record = recordRepository.save(record);

        return new RecordDTO(record);
    }
}
