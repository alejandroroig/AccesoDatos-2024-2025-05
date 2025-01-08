package org.accesodatos.spring.mappers;

import org.accesodatos.spring.dtos.response.PerfilDTO;
import org.accesodatos.spring.models.Perfil;
import org.springframework.stereotype.Component;

@Component
public class PerfilMapper {
    public PerfilDTO toDto(Perfil perfil) {
        if (perfil == null) {
            return null;
        }
        PerfilDTO dto = new PerfilDTO();
        dto.setId(perfil.getId());
        dto.setNombreCompleto(perfil.getNombreCompleto());
        dto.setTelefono(perfil.getTelefono());
        dto.setDireccion(perfil.getDireccion());
        return dto;
    }
}