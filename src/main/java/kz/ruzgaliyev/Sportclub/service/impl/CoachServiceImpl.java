package kz.ruzgaliyev.Sportclub.service.impl;

import kz.ruzgaliyev.Sportclub.entities.Coach;
import kz.ruzgaliyev.Sportclub.repositories.CoachRepository;
import kz.ruzgaliyev.Sportclub.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CoachServiceImpl implements CoachService {
    @Autowired
    private CoachRepository coachRepository;
    @Override
    public List<Coach> getAllCoaches() {
        return coachRepository.findAll();
    }

    @Override
    public Coach getCoachById(Long id) {
        return coachRepository.findAllById(id);
    }

    @Override
    public Coach addCoach(Coach coach) {
        return coachRepository.save(coach);
    }

    @Override
    public Coach updateCoach(Long id, Coach coach) {
        return coachRepository.save(coach);
    }

    @Override
    public void deleteCoach(Long id) {
        coachRepository.deleteById(id);
    }
}
