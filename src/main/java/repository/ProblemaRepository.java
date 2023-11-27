package repository;

import org.example.Problema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProblemaRepository extends JpaRepository<Problema, Long> {
    List<Problema> findAll();
}
