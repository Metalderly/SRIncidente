package repository;

import org.example.Incidente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface incidenteRepository extends JpaRepository<Incidente, Long> {
}
