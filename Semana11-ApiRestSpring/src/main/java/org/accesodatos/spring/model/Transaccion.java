package org.accesodatos.spring.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "transacciones")
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transaccion")
    private Long id;

    @Column(name = "id_cuenta")
    private Long idCuenta;

    //@Column(name = "monto")
    private Double monto;

    //@Column(name = "fecha")
    private LocalDateTime fecha;

    @Column(name = "tipo_transaccion")
    private String tipoTransaccion;
}
