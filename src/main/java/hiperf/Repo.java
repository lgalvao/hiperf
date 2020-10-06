package hiperf;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import hiperf.modelo.repo.MunicipioRepo;

@RequiredArgsConstructor
@Service
public class Repo {
    final MunicipioRepo municipioRepo;

    public void carregar() {
        municipioRepo.findAll();
    }
}
