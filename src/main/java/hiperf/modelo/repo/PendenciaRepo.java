package hiperf.modelo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import hiperf.modelo.Pendencia;

@Repository
public interface PendenciaRepo extends JpaRepository<Pendencia, Long> {
}
