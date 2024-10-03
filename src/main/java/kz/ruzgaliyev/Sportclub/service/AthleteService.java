package kz.ruzgaliyev.Sportclub.service;

import kz.ruzgaliyev.Sportclub.dtos.AthleteDTO;
import kz.ruzgaliyev.Sportclub.entities.Athlete;

import java.util.List;

public interface AthleteService {
    List<AthleteDTO> getAllAthletes();
    AthleteDTO getAllAthletesById(Long id);
    void createAthlete(AthleteDTO athleteDTO);
    void updateAthlete(AthleteDTO athleteDTO);
    void deleteAthlete(Long id);
}
