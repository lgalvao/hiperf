package hiperf.modelo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.*;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Cacheable
@OptimisticLocking(type = OptimisticLockType.ALL)
@DynamicUpdate
@Immutable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class TipoPendencia {
    @Id
    String id;

    int numero;

    String descricao;

    @OneToMany(mappedBy = "tipo")
    List<Pendencia> pendencias;

}