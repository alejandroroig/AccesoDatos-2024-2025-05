package org.accesodatos.spring.services;

import org.accesodatos.spring.models.Perfil;

import java.util.List;

public interface PerfilService {
    List<Perfil> obtenerTodosLosPerfiles();

    Perfil obtenerPerfilPorId(Long id);

    List<Perfil> obtenerPerfilPorNombre(String nombre);
}
