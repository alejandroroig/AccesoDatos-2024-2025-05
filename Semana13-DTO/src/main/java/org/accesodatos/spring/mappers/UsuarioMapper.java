package org.accesodatos.spring.mappers;

import org.accesodatos.spring.dtos.response.UsuarioDTO;
import org.accesodatos.spring.models.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {

    private final PerfilMapper perfilMapper;

    // Inyección de dependencia de PerfilMapper
    public UsuarioMapper(PerfilMapper perfilMapper) {
        this.perfilMapper = perfilMapper;
    }

    public UsuarioDTO toDto(Usuario usuario) {
        if (usuario == null) {
            return null;
        }
        UsuarioDTO dto = new UsuarioDTO();
        dto.setId(usuario.getId());
        dto.setUsername(usuario.getUsername());
        dto.setEmail(usuario.getEmail());
        dto.setFechaRegistro(usuario.getFechaRegistro());
        dto.setPerfil(perfilMapper.toDto(usuario.getPerfil())); // Usar la instancia inyectada
        return dto;
    }
}
