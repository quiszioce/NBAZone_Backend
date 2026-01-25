package com.nbazone.backend.controller;

import org.springframework.web.bind.annotation.*;
import com.nbazone.backend.service.PlayerSeasonService;
import com.nbazone.backend.dto.PlayerSeasonDto;

import java.util.List;

@RestController
public class PlayerSeasonController {
    private final PlayerSeasonService playerSeasonService;

    public PlayerSeasonController(PlayerSeasonService playerSeasonService) {
        this.playerSeasonService = playerSeasonService;
    }

    @GetMapping("/players/{id}/seasons")
    public List<PlayerSeasonDto> getPlayerSeasons(@PathVariable("id") long playerId) {
        return playerSeasonService.getSeasonsByPlayerId(playerId);
    }
}
