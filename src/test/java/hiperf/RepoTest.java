package hiperf;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RepoTest {
    @Autowired
    Repo repo;

    @Test
    public void carregarTest() {
        repo.carregar();
    }
}