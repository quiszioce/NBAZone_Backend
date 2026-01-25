package com.nbazone.backend.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import com.nbazone.backend.dto.PlayerDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlayerRepository {
    private final JdbcTemplate jdbcTemplate;

    public PlayerRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Repository methods would go here

    public List<PlayerDto> searchPlayers(String query) {
        String sql = """
                SELECT personid, firstname, lastname
                FROM players
                WHERE firstname ILIKE '%' || ? || '%'
                   OR lastname ILIKE '%' || ? || '%'
                ORDER BY lastname
                LIMIT 20
                """;
        
        return jdbcTemplate.query(
            sql,
            (rs, rownum) -> new PlayerDto(
                rs.getLong("personid"),
                rs.getString("firstname"),
                rs.getString("lastname")
            ),
            query, query
        );
    }
}
