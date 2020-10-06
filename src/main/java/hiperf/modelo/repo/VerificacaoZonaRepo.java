package hiperf.modelo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import hiperf.modelo.VerificacaoZona;

@Repository
public interface VerificacaoZonaRepo extends JpaRepository<VerificacaoZona, Long> {
}
