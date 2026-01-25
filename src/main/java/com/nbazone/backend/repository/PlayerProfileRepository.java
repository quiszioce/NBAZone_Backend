package com.nbazone.backend.repository;

import com.nbazone.backend.dto.PlayerProfileDto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class PlayerProfileRepository {

    private final JdbcTemplate jdbcTemplate;

    public PlayerProfileRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Optional<PlayerProfileDto> findById(long playerId) {
        String sql = """
            SELECT personid, firstname, lastname,
                   birthdate, lastattend, country,
                   height_in, height_cm, bodyweight_lbs,
                   position,
                   draftyear, draftround, draftnumber
            FROM players
            WHERE personid = ?
        """;

        return jdbcTemplate.query(sql, rs -> {
            if (!rs.next()) return Optional.empty();

            return Optional.of(new PlayerProfileDto(
                    rs.getLong("personid"),
                    rs.getString("firstname"),
                    rs.getString("lastname"),

                    rs.getObject("birthdate", java.time.LocalDate.class),
                    rs.getString("lastattend"),
                    rs.getString("country"),

                    rs.getObject("height_in", Integer.class),
                    rs.getObject("height_cm", Integer.class),
                    rs.getObject("bodyweight_lbs", Integer.class),

                    rs.getString("position"),

                    rs.getObject("draftyear", Integer.class),
                    rs.getObject("draftround", Integer.class),
                    rs.getObject("draftnumber", Integer.class)
            ));
        }, playerId);
    }
}
