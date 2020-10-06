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
@Immutable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Zona {
    @Id
    String id;

    int numero;

    @ManyToMany(fetch = FetchType.LAZY)
    List<Municipio> municipios;
}