package org.accesodatos.spring.repository;

import org.accesodatos.spring.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
