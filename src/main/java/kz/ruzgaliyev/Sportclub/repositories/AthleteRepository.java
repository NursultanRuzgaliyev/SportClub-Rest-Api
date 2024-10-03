package kz.ruzgaliyev.Sportclub.repositories;

import kz.ruzgaliyev.Sportclub.entities.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AthleteRepository extends JpaRepository<Athlete,Long> {
    Athlete findAllById(Long id);
    Athlete findAllByEmailContainsIgnoreCase(String email);
}
