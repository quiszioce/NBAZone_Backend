package com.nbazone.backend.service;

import com.nbazone.backend.dto.PlayerDto;
import com.nbazone.backend.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<PlayerDto> searchPlayers(String query) {
        return playerRepository.searchPlayers(query);
    }
}
