package kz.ruzgaliyev.Sportclub.service;

import kz.ruzgaliyev.Sportclub.entities.SportType;

import java.util.List;

public interface SportTypeService {
    List<SportType> getAllSportTypes();
    SportType getAllSportTypesById(Long id);
    SportType addSportType(SportType sportType);
    SportType updateSportType(SportType sportType);
    void deleteSportType(Long id);
}
