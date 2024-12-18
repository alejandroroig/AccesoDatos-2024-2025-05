package org.accesodatos.spring.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "perfiles")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_perfil")
    private Long id;

    @Column(name = "nombre_completo")
    private String nombreCompleto;

    //@Column(name = "telefono")
    private String telefono;

    //@Column(name = "direccion")
    private String direccion;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    @JsonBackReference
    private Usuario usuario;
}
