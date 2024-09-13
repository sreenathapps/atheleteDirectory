package com.example.athletedirectory.repository;

import com.example.athletedirectory.model.Athlete;
import com.example.athletedirectory.model.Country;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public interface AthleteRepository {
    ArrayList<Athlete> getAthletes();
    Athlete getAthleteById(int athleteId);
    Athlete addAthlete(Athlete athlete);
    Athlete updateAthlete(int athleteId, Athlete athlete);
    void deleteAthlete(int athleteId);
    Country getAthleteCountry(int athleteId);
}
