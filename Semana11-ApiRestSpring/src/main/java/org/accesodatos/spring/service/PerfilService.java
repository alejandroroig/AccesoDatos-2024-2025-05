package org.accesodatos.spring.service;

import org.accesodatos.spring.model.Perfil;

import java.util.List;

public interface PerfilService {
    List<Perfil> obtenerTodosLosPerfiles();

    Perfil obtenerPerfilPorId(Long id);
}
