package hiperf.modelo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import hiperf.modelo.Regiao;

@Repository
public interface RegiaoRepo extends JpaRepository<Regiao, Long> {
}
