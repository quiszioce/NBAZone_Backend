package com.nbazone.backend.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import com.nbazone.backend.dto.PlayerDto;
import com.nbazone.backend.service.PlayerService;

import java.util.List;

@RestController
public class PlayerController {
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/players")
    public List<PlayerDto> searchPlayers(@RequestParam String search) {
        return playerService.searchPlayers(search);
    }
}