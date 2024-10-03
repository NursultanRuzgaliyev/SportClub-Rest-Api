package kz.ruzgaliyev.Sportclub.repositories;

import kz.ruzgaliyev.Sportclub.entities.TrainingSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingSessionRepository extends JpaRepository<TrainingSession,Long> {
    TrainingSession findAllById(Long id);
}
