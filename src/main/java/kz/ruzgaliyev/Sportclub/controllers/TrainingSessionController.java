package kz.ruzgaliyev.Sportclub.controllers;

import kz.ruzgaliyev.Sportclub.entities.TrainingSession;
import kz.ruzgaliyev.Sportclub.repositories.TrainingSessionRepository;
import kz.ruzgaliyev.Sportclub.service.TrainingSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trainingsessions")
public class TrainingSessionController {
    @Autowired
    private TrainingSessionService trainingSessionService;
    @GetMapping
    public List<TrainingSession> getAllTrainingSessions() {
        return trainingSessionService.getAllTrainingSessions();
    }
    @GetMapping("/{id}")
    public TrainingSession getTrainingSession(@PathVariable Long id) {
        return trainingSessionService.getTrainingSessionById(id);
    }
    @PostMapping
    public TrainingSession createTrainingSession(@RequestBody TrainingSession trainingSession) {
        return trainingSessionService.createTrainingSession(trainingSession);
    }
    @PutMapping("/{id}")
    public TrainingSession updateTrainingSession(@RequestBody TrainingSession trainingSession, @PathVariable Long id) {
        return trainingSessionService.updateTrainingSession(trainingSession);
    }
    @DeleteMapping("/{id}")
    public void deleteTrainingSession(@PathVariable Long id) {
        trainingSessionService.deleteTrainingSessionById(id);
    }
}
