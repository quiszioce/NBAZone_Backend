package com.nbazone.backend.repository;

import com.nbazone.backend.dto.PlayerSeasonDto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

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
                rs.getInt("games_played"),

                rs.getObject("mpg", Double.class),
                rs.getObject("ppg", Double.class),
                rs.getObject("rpg", Double.class),
                rs.getObject("apg", Double.class),
                rs.getObject("spg", Double.class),
                rs.getObject("bpg", Double.class),
                rs.getObject("tpg", Double.class),

                rs.getObject("fgm", Integer.class),
                rs.getObject("fga", Integer.class),
                rs.getObject("fg_pct", Double.class),

                rs.getObject("fg3m", Integer.class),
                rs.getObject("fg3a", Integer.class),
                rs.getObject("fg3_pct", Double.class),

                rs.getObject("ftm", Integer.class),
                rs.getObject("fta", Integer.class),
                rs.getObject("ft_pct", Double.class)
            ),
            playerId
        );
    }
}
