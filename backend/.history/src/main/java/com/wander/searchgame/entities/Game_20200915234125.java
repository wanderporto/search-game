package com.wander.searchgame.entities;

import java.io.Serializable;

import com.wander.searchgame.enums.Platform;

public class Game implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String title;
    private Platform platform;
}
