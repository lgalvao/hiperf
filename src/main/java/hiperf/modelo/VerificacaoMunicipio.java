package hiperf.modelo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.OptimisticLockType;
import org.hibernate.annotations.OptimisticLocking;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Cacheable
@OptimisticLocking(type = OptimisticLockType.ALL)
@DynamicUpdate
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class VerificacaoMunicipio {
    @Id
    String id;

    @ManyToOne(fetch = FetchType.LAZY)
    Municipio municipio;

    @OneToMany(fetch = FetchType.LAZY)
    List<Pendencia> pendencias;
}