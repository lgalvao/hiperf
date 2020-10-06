package hiperf.modelo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.*;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@OptimisticLocking(type = OptimisticLockType.ALL)
@DynamicUpdate
@Cacheable
@Immutable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Municipio {
    @Id
    @GeneratedValue
    String id;

    String nome;

    int codIbge;

    @ManyToOne
    Regiao regiao;

    @ManyToOne
    Uf uf;

    @ManyToMany(mappedBy = "municipios", fetch = FetchType.LAZY)
    List<Zona> zonas;
}