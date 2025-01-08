package org.accesodatos.spring.services;

import org.accesodatos.spring.dtos.response.UsuarioDTO;
import org.accesodatos.spring.models.Usuario;

import java.util.List;

public interface UsuarioService {
    List<UsuarioDTO> obtenerTodosLosUsuarios();

    UsuarioDTO obtenerUsuarioPorId(Long id);
}
