package org.accesodatos.spring.model;

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

    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "nombre_completo")
    private String nombreCompleto;

    //@Column(name = "telefono")
    private String telefono;

    //@Column(name = "direccion")
    private String direccion;
}
