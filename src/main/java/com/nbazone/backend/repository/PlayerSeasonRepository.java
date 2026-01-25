package com.nbazone.backend.repository;

import com.nbazone.backend.dto.PlayerSeasonDto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.math.BigDecimal;

@Repository
public class PlayerSeasonRepository {
    private final JdbcTemplate jdbcTemplate;
    public PlayerSeasonRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<PlayerSeasonDto> findSeasonsByPlayerId(long playerId) {
        String sql = """
            SELECT
                player_id,
                season,
                games_played,
                mpg, ppg, rpg, apg, spg, bpg, tpg,
                fgm, fga, fg_pct,
                fg3m, fg3a, fg3_pct,
                ftm, fta, ft_pct
            FROM mv_player_season_summary
            WHERE player_id = ?
            ORDER BY season DESC
                """;

        return jdbcTemplate.query(
            sql,
            (rs, rownum) -> new PlayerSeasonDto(
                rs.getLong("player_id"),
                rs.getInt("season"),
                rs.getObject("games_played", Long.class),

                bdTDouble(rs.getBigDecimal("mpg")),
                bdTDouble(rs.getBigDecimal("ppg")),
                bdTDouble(rs.getBigDecimal("rpg")),
                bdTDouble(rs.getBigDecimal("apg")),
                bdTDouble(rs.getBigDecimal("spg")),
                bdTDouble(rs.getBigDecimal("bpg")),
                bdTDouble(rs.getBigDecimal("tpg")),

                rs.getObject("fgm", Long.class),
                rs.getObject("fga", Long.class),
                bdTDouble(rs.getBigDecimal("fg_pct")),

                rs.getObject("fg3m", Long.class),
                rs.getObject("fg3a", Long.class),
                bdTDouble(rs.getBigDecimal("fg3_pct")),   
                rs.getObject("ftm", Long.class),
                rs.getObject("fta", Long.class),
                bdTDouble(rs.getBigDecimal("ft_pct"))
            ),
            playerId
        );
    }
    private static Double bdTDouble(BigDecimal bd) {
        return bd != null ? bd.doubleValue() : null;
    }
}
