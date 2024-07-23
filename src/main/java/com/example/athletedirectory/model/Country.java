package com.example.athletedirectory.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int countryId;

    @Column(name = "name")
    private String countryName;

    @Column(name = "flagimageurl")
    private String flagImageUrl;

    @OneToMany(mappedBy = "country")
    @JsonIgnoreProperties("country")
    private List<Athlete> athletes;

    public Country() {
    }

    public Country(int countryId, String countryName, String flagImageUrl, List<Athlete> atheletes) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.flagImageUrl = flagImageUrl;
        this.athletes = atheletes;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getFlagImageUrl() {
        return flagImageUrl;
    }

    public void setFlagImageUrl(String flagImageUrl) {
        this.flagImageUrl = flagImageUrl;
    }

    public List<Athlete> getAthletes() {
        return athletes;
    }

    public void setAthletes(List<Athlete> atheletes) {
        this.athletes = atheletes;
    }

}