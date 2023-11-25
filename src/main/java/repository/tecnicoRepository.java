package repository;

import org.example.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface tecnicoRepository extends JpaRepository<Tecnico, Long> {
}
