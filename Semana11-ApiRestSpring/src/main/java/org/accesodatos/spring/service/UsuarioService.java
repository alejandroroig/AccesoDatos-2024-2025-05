package org.accesodatos.spring.service;

import org.accesodatos.spring.model.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> obtenerTodosLosUsuarios();

    Usuario obtenerUsuarioPorId(Long id);
}
