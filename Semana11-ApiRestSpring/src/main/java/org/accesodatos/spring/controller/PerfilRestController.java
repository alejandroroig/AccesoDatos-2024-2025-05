package org.accesodatos.spring.controller;

import org.accesodatos.spring.model.Perfil;
import org.accesodatos.spring.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/perfiles")
public class PerfilRestController {
    private final PerfilService perfilService;

    @Autowired
    public PerfilRestController(PerfilService perfilService) {
        this.perfilService = perfilService;
    }

    @GetMapping
    public ResponseEntity<List<Perfil>> obtenerTodosLosPerfiles() {
        List<Perfil> perfiles = perfilService.obtenerTodosLosPerfiles();
        if (perfiles.isEmpty()) {
            return ResponseEntity.noContent().build(); // 204 No Content
        }
        return ResponseEntity.ok(perfiles); // 200 OK
    }

    @GetMapping("/{id}")
    public ResponseEntity<Perfil> obtenerPerfilPorId(@PathVariable Long id) {
        Perfil perfil = perfilService.obtenerPerfilPorId(id);
        if (perfil == null) {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
        return ResponseEntity.ok(perfil); // 200 OK
    }
}
