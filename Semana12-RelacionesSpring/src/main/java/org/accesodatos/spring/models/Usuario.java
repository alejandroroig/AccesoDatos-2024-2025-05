package org.accesodatos.spring.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

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

    @OneToOne(mappedBy = "usuario")
    @JsonManagedReference
    private Perfil perfil;

    @OneToMany(mappedBy = "usuario")
    @JsonManagedReference
    private List<Cuenta> cuentas;
}
