package hiperf.modelo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import hiperf.modelo.TipoPendencia;

@Repository
public interface TipoPendenciaRepo extends JpaRepository<TipoPendencia, Long> {
}
