package hiperf.modelo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Cacheable
@OptimisticLocking(type = OptimisticLockType.ALL)
@DynamicUpdate
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class VerificacaoZona {
    @Id
    String id;

    @ManyToOne(fetch = FetchType.LAZY)
    Zona zona;

    @OneToMany(fetch = FetchType.LAZY)
    List<Pendencia> pendencias;
}
