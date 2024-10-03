package kz.ruzgaliyev.Sportclub.service;

import kz.ruzgaliyev.Sportclub.entities.Coach;

import java.util.List;

public interface CoachService {
    List<Coach> getAllCoaches();
    Coach getCoachById(Long id);
    Coach addCoach(Coach coach);
    Coach updateCoach(Long id, Coach coach);
    void deleteCoach(Long id);

}
