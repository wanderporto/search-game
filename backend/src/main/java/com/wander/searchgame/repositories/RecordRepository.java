package com.wander.searchgame.repositories;

import com.wander.searchgame.entities.Record;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
