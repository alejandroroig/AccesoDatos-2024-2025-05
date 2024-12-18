package org.accesodatos.spring.repository;

import org.accesodatos.spring.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<Perfil, Long> {
}
