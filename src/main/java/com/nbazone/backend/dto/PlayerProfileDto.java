package com.nbazone.backend.dto;

import java.time.LocalDate;

public class PlayerProfileDto {
    private Long id;
    private String firstName;
    private String lastName;

    private LocalDate birthDate;
    private String lastAttend;
    private String country;

    private Integer heightIn;
    private Integer heightCm;
    private Integer bodyweightLbs;

    private String position;

    private Integer draftYear;
    private Integer draftRound;
    private Integer draftNumber;

    public PlayerProfileDto(
            Long id, String firstName, String lastName,
            LocalDate birthDate, String lastAttend, String country,
            Integer heightIn, Integer heightCm, Integer bodyweightLbs,
            String position,
            Integer draftYear, Integer draftRound, Integer draftNumber
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.lastAttend = lastAttend;
        this.country = country;
        this.heightIn = heightIn;
        this.heightCm = heightCm;
        this.bodyweightLbs = bodyweightLbs;
        this.position = position;
        this.draftYear = draftYear;
        this.draftRound = draftRound;
        this.draftNumber = draftNumber;
    }

    public Long getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    public LocalDate getBirthDate() { return birthDate; }
    public String getLastAttend() { return lastAttend; }
    public String getCountry() { return country; }

    public Integer getHeightIn() { return heightIn; }
    public Integer getHeightCm() { return heightCm; }
    public Integer getBodyweightLbs() { return bodyweightLbs; }

    public String getPosition() { return position; }

    public Integer getDraftYear() { return draftYear; }
    public Integer getDraftRound() { return draftRound; }
    public Integer getDraftNumber() { return draftNumber; }
}
