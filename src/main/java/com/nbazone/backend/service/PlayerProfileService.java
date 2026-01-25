package com.nbazone.backend.service;

import com.nbazone.backend.dto.PlayerProfileDto;
import com.nbazone.backend.repository.PlayerProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class PlayerProfileService {

    private final PlayerProfileRepository repo;

    public PlayerProfileService(PlayerProfileRepository repo) {
        this.repo = repo;
    }

    public PlayerProfileDto getPlayerProfile(long playerId) {
        return repo.findById(playerId)
                .orElseThrow(() -> new IllegalArgumentException("Player not found"));
    }
}
