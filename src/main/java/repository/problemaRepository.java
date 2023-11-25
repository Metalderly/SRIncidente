package repository;

import org.example.Problema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface problemaRepository extends JpaRepository<Problema, Long> {
}
