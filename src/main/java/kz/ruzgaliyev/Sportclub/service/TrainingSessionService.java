package kz.ruzgaliyev.Sportclub.service;

import kz.ruzgaliyev.Sportclub.entities.TrainingSession;

import java.util.List;

public interface TrainingSessionService {
    List<TrainingSession> getAllTrainingSessions();
    TrainingSession getTrainingSessionById(Long id);
    TrainingSession createTrainingSession(TrainingSession trainingSession);
    TrainingSession updateTrainingSession(TrainingSession trainingSession);
    void deleteTrainingSessionById(Long id);
}
