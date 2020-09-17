package com.wander.searchgame.resources;

import java.util.List;

import com.wander.searchgame.dto.GameDTO;
import com.wander.searchgame.entities.Game;
import com.wander.searchgame.repositories.GameRepository;
import com.wander.searchgame.services.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/games")
public class GameResource {

    @Autowired
    GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameDTO>> findAll() {
        List<GameDTO> games = gameService.findAll();
        return ResponseEntity.ok().body(games);

    }
}
