package kz.ruzgaliyev.Sportclub.service.impl;

import kz.ruzgaliyev.Sportclub.entities.SportType;
import kz.ruzgaliyev.Sportclub.repositories.SportTypeRepository;
import kz.ruzgaliyev.Sportclub.service.SportTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SportTypeServiceImpl implements SportTypeService {
    @Autowired
    private SportTypeRepository sportTypeRepository;
    @Override
    public List<SportType> getAllSportTypes() {
        return sportTypeRepository.findAll();
    }

    @Override
    public SportType getAllSportTypesById(Long id) {
        return sportTypeRepository.findAllById(id);
    }

    @Override
    public SportType addSportType(SportType sportType) {
        return sportTypeRepository.save(sportType);
    }

    @Override
    public SportType updateSportType(SportType sportType) {
        return sportTypeRepository.save(sportType);
    }

    @Override
    public void deleteSportType(Long id) {
        sportTypeRepository.deleteById(id);
    }
}
