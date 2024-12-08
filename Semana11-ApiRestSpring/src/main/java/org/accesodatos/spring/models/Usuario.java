package org.accesodatos.spring.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;

    //@Column(name = "username")
    private String username;

    //@Column(name = "password")
    private String password;

    //@Column(name = "email")
    private String email;

    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;
}
