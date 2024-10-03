package kz.ruzgaliyev.Sportclub.repositories;

import kz.ruzgaliyev.Sportclub.entities.SportType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportTypeRepository extends JpaRepository<SportType, Long> {
    SportType findAllById(Long id);
}
