package com.wander.searchgame.services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.wander.searchgame.dto.GameDTO;
import com.wander.searchgame.entities.Game;
import com.wander.searchgame.repositories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameDTO> findAll() {
        List<Game> games = gameRepository.findAll();
        return games.stream().map(x -> new GameDTO(x)).collect(Collectors.toList());
    }
}
