package com.wander.searchgame.repositories;

import com.wander.searchgame.entities.Game;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
