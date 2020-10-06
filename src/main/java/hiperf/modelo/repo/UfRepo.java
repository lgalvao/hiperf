package hiperf.modelo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import hiperf.modelo.Uf;

@Repository
public interface UfRepo extends JpaRepository<Uf, Long> {
}
