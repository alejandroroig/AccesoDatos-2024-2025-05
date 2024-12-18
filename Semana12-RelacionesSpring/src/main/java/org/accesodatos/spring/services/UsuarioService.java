package org.accesodatos.spring.services;

import org.accesodatos.spring.models.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> obtenerTodosLosUsuarios();

    Usuario obtenerUsuarioPorId(Long id);
}
