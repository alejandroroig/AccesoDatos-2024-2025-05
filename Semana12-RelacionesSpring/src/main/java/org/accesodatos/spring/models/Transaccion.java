package org.accesodatos.spring.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

    //@Column(name = "monto")
    private Double monto;

    //@Column(name = "fecha")
    private LocalDateTime fecha;

    @Column(name = "tipo_transaccion")
    private String tipoTransaccion;

    @ManyToOne
    @JoinColumn(name = "id_cuenta")
    @JsonBackReference
    private Cuenta cuenta;
}