package hiperf.modelo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import hiperf.modelo.VerificacaoMunicipio;

@Repository
public interface VerificacaoMunicipioRepo extends JpaRepository<VerificacaoMunicipio, Long> {
}
