package repository;

import org.example.TipoProblema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoProblemaRepository extends JpaRepository<TipoProblema, Long> {
    List<TipoProblema> findAll();
}
