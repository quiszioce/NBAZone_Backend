package com.nbazone.backend.controller;

import com.nbazone.backend.dto.PlayerProfileDto;
import com.nbazone.backend.service.PlayerProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class PlayerProfileController {

    private final PlayerProfileService service;

    public PlayerProfileController(PlayerProfileService service) {
        this.service = service;
    }

    @GetMapping("/players/{id}")
    public PlayerProfileDto getPlayer(@PathVariable("id") long playerId) {
        try {
            return service.getPlayerProfile(playerId);
        } catch (IllegalArgumentException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Player not found");
        }
    }
}


