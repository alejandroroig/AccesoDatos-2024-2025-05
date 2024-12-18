package org.accesodatos.spring.services.impl;

import org.accesodatos.spring.models.Perfil;
import org.accesodatos.spring.repositories.PerfilRepository;
import org.accesodatos.spring.services.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilServiceImpl implements PerfilService {
    private final PerfilRepository perfilRepository;

    @Autowired
    public PerfilServiceImpl(PerfilRepository perfilRepository) {
        this.perfilRepository = perfilRepository;
    }

    @Override
    public List<Perfil> obtenerTodosLosPerfiles() {
        return perfilRepository.findAll();
    }

    @Override
    public Perfil obtenerPerfilPorId(Long id) {
        return perfilRepository.findById(id).orElse(null);
    }

    @Override
    public List<Perfil> obtenerPerfilPorNombre(String nombre) {
        return perfilRepository.findByNombreCompletoContainingIgnoreCase(nombre);
    }
}
