package org.accesodatos.spring.services.impl;

import org.accesodatos.spring.dtos.response.PerfilDTO;
import org.accesodatos.spring.mappers.PerfilMapper;
import org.accesodatos.spring.repositories.PerfilRepository;
import org.accesodatos.spring.services.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilServiceImpl implements PerfilService {
    private final PerfilRepository perfilRepository;
    private final PerfilMapper perfilMapper;

    @Autowired
    public PerfilServiceImpl(PerfilRepository perfilRepository, PerfilMapper perfilMapper) {
        this.perfilRepository = perfilRepository;
        this.perfilMapper = perfilMapper;
    }

    @Override
    public List<PerfilDTO> obtenerTodosLosPerfiles() {
        return perfilRepository.findAll().stream()
                .map(perfilMapper::toDto)
                .toList();
    }

    @Override
    public PerfilDTO obtenerPerfilPorId(Long id) {
        return perfilRepository.findById(id)
                .map(perfilMapper::toDto)
                .orElse(null);
    }

    @Override
    public List<PerfilDTO> obtenerPerfilPorNombre(String nombre) {
        return perfilRepository.findByNombreCompletoContainingIgnoreCase(nombre).stream()
                .map(perfilMapper::toDto)
                .toList();
    }
}
