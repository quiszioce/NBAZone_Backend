package com.nbazone.backend.dto;

public class PlayerSeasonDto {
    private Long playerId;
    private Integer season;
    private Long gamesPlayed;

    private Double mpg;
    private Double ppg;
    private Double rpg;
    private Double apg;
    private Double spg;
    private Double bpg;
    private Double tpg;

    private Long fgm;
    private Long fga;
    private Double fgPct;

    private Long fg3m;
    private Long fg3a;
    private Double fg3Pct;

    private Long ftm;
    private Long fta;
    private Double ftPct;

    public PlayerSeasonDto() {}

    public PlayerSeasonDto(Long playerId, Integer season, Long gamesPlayed, Double mpg, Double ppg, Double rpg, Double apg, Double spg, Double bpg, Double tpg, Long fgm, Long fga, Double fgPct, Long fg3m, Long fg3a, Double fg3Pct, Long ftm, Long fta, Double ftPct) {
        this.playerId = playerId;
        this.season = season;
        this.gamesPlayed = gamesPlayed;
        this.mpg = mpg;
        this.ppg = ppg;
        this.rpg = rpg;
        this.apg = apg;
        this.spg = spg;
        this.bpg = bpg;
        this.tpg = tpg;
        this.fgm = fgm;
        this.fga = fga;
        this.fgPct = fgPct;
        this.fg3m = fg3m;
        this.fg3a = fg3a;
        this.fg3Pct = fg3Pct;
        this.ftm = ftm;
        this.fta = fta;
        this.ftPct = ftPct;
    }

    // Getters

    public Long getPlayerId() {
        return playerId;
    }
    public Integer getSeason() {
        return season;
    }
    public Long getGamesPlayed() {
        return gamesPlayed;
    }
    public Double getMpg() {
        return mpg;
    }
    public Double getPpg() {
        return ppg;
    }
    public Double getRpg() {
        return rpg;
    }
    public Double getApg() {
        return apg;
    }
    public Double getSpg() {
        return spg;
    }
    public Double getBpg() {
        return bpg;
    }
    public Double getTpg() {
        return tpg;
    }
    public Long getFgm() {
        return fgm;
    }
    public Long getFga() {
        return fga;
    }
    public Double getFgPct() {
        return fgPct;
    }
    public Long getFg3m() {
        return fg3m;
    }
    public Long getFg3a() {
        return fg3a;
    }
    public Double getFg3Pct() {
        return fg3Pct;
    }
    public Long getFtm() {
        return ftm;
    }
    public Long getFta() {
        return fta;
    }
    public Double getFtPct() {
        return ftPct;
    }


}
