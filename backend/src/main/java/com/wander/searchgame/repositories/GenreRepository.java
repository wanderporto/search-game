package com.wander.searchgame.repositories;

import com.wander.searchgame.entities.Genre;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre,Long>{
    
}
