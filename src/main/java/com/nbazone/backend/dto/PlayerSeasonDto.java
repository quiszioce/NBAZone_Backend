package com.nbazone.backend.dto;

public class PlayerSeasonDto {
    private Long playerId;
    private Integer season;
    private Integer gamesPlayed;

    private Double mpg;
    private Double ppg;
    private Double rpg;
    private Double apg;
    private Double spg;
    private Double bpg;
    private Double tpg;

    private Integer fgm;
    private Integer fga;
    private Double fgPct;

    private Integer fg3m;
    private Integer fg3a;
    private Double fg3Pct;

    private Integer ftm;
    private Integer fta;
    private Double ftPct;

    public PlayerSeasonDto() {}

    public PlayerSeasonDto(Long playerId, Integer season, Integer gamesPlayed, Double mpg, Double ppg, Double rpg, Double apg, Double spg, Double bpg, Double tpg, Integer fgm, Integer fga, Double fgPct, Integer fg3m, Integer fg3a, Double fg3Pct, Integer ftm, Integer fta, Double ftPct) {
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
    public Integer getGamesPlayed() {
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
    public Integer getFgm() {
        return fgm;
    }
    public Integer getFga() {
        return fga;
    }
    public Double getFgPct() {
        return fgPct;
    }
    public Integer getFg3m() {
        return fg3m;
    }
    public Integer getFg3a() {
        return fg3a;
    }
    public Double getFg3Pct() {
        return fg3Pct;
    }
    public Integer getFtm() {
        return ftm;
    }
    public Integer getFta() {
        return fta;
    }
    public Double getFtPct() {
        return ftPct;
    }


}
