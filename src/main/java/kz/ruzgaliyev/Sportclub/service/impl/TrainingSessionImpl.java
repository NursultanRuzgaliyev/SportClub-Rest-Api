package kz.ruzgaliyev.Sportclub.service.impl;

import kz.ruzgaliyev.Sportclub.entities.TrainingSession;
import kz.ruzgaliyev.Sportclub.repositories.TrainingSessionRepository;
import kz.ruzgaliyev.Sportclub.service.TrainingSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrainingSessionImpl implements TrainingSessionService {
   @Autowired
   private TrainingSessionRepository trainingSessionRepository;
    @Override
    public List<TrainingSession> getAllTrainingSessions() {
        return trainingSessionRepository.findAll();
    }

    @Override
    public TrainingSession getTrainingSessionById(Long id) {
        return trainingSessionRepository.findAllById(id);
    }

    @Override
    public TrainingSession createTrainingSession(TrainingSession trainingSession) {
        return trainingSessionRepository.save(trainingSession);
    }

    @Override
    public TrainingSession updateTrainingSession(TrainingSession trainingSession) {
        return trainingSessionRepository.save(trainingSession);
    }

    @Override
    public void deleteTrainingSessionById(Long id) {
        trainingSessionRepository.deleteById(id);
    }
}
