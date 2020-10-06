package hiperf.modelo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.OptimisticLockType;
import org.hibernate.annotations.OptimisticLocking;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Cacheable
@OptimisticLocking(type = OptimisticLockType.ALL)
@DynamicUpdate
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Pendencia {
    @Id
    @GeneratedValue
    String id;

    @ManyToOne(fetch = FetchType.LAZY)
    TipoPendencia tipo;

    int numero;

    @Lob
    String detalhamento;
}