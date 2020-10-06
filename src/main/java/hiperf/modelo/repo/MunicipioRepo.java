package hiperf.modelo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import hiperf.modelo.Municipio;

@Repository
public interface MunicipioRepo extends JpaRepository<Municipio, Long> {
}
