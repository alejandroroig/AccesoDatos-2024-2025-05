package org.accesodatos.spring.services;

import org.accesodatos.spring.dtos.response.PerfilDTO;
import org.accesodatos.spring.models.Perfil;

import java.util.List;

public interface PerfilService {
    List<PerfilDTO> obtenerTodosLosPerfiles();

    PerfilDTO obtenerPerfilPorId(Long id);

    List<PerfilDTO> obtenerPerfilPorNombre(String nombre);
}
