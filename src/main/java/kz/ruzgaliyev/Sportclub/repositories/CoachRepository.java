package kz.ruzgaliyev.Sportclub.repositories;

import kz.ruzgaliyev.Sportclub.entities.Coach;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoachRepository extends JpaRepository<Coach, Long> {
    Coach findAllById(Long id);
}
