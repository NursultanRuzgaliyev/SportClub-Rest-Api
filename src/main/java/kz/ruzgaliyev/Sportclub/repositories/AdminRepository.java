package kz.ruzgaliyev.Sportclub.repositories;

import kz.ruzgaliyev.Sportclub.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {
    Admin findAllById(long id);
}
