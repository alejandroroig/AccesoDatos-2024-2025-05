package org.accesodatos.spring.service.impl;

import org.accesodatos.spring.model.Perfil;
import org.accesodatos.spring.repository.PerfilRepository;
import org.accesodatos.spring.service.PerfilService;
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
}
