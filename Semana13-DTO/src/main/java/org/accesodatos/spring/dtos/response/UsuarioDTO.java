package org.accesodatos.spring.dtos.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UsuarioDTO {
    private Long id;
    private String username;
    private String email;
    private LocalDate fechaRegistro;
    private PerfilDTO perfil;
}
