package hiperf.modelo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import hiperf.modelo.Zona;

@Repository
public interface ZonaRepo extends JpaRepository<Zona, Long> {
}
