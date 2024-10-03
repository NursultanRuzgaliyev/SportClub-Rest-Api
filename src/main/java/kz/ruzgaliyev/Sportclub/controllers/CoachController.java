package kz.ruzgaliyev.Sportclub.controllers;

import kz.ruzgaliyev.Sportclub.entities.Coach;
import kz.ruzgaliyev.Sportclub.service.CoachService;
import kz.ruzgaliyev.Sportclub.service.impl.CoachServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/coach")
public class CoachController {
    @Autowired
    private CoachService coachService;

    @GetMapping
    public List<Coach> getAllCoaches() {
        return coachService.getAllCoaches();
    }
    @GetMapping("/{id}")
    public Coach getCoachById(@PathVariable Long id) {
        return coachService.getCoachById(id);
    }
    @PostMapping
    public Coach addCoach(@RequestBody Coach coach) {
        return coachService.addCoach(coach);
    }
    @PutMapping("/{id}")
    public Coach updateCoach(@PathVariable Long id, @RequestBody Coach coach) {
        return coachService.updateCoach(id, coach);
    }

    @DeleteMapping("/{id}")
    public void deleteCoach(@PathVariable Long id) {
        coachService.deleteCoach(id);
    }
}
