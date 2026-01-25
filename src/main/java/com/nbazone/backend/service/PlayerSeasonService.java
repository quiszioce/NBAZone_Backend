package com.nbazone.backend.service;

import org.springframework.stereotype.Service;
import com.nbazone.backend.repository.PlayerSeasonRepository;
import com.nbazone.backend.dto.PlayerSeasonDto;

import java.util.List;

@Service
public class PlayerSeasonService {
    private final PlayerSeasonRepository playerSeasonRepository;

    public PlayerSeasonService(PlayerSeasonRepository playerSeasonRepository) {
        this.playerSeasonRepository = playerSeasonRepository;
    }

    public List<PlayerSeasonDto> getSeasonsByPlayerId(long playerId) {
        return playerSeasonRepository.findSeasonsByPlayerId(playerId);
    }

}
