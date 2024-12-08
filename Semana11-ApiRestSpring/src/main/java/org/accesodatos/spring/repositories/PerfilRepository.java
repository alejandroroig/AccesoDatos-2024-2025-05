package org.accesodatos.spring.repositories;

import org.accesodatos.spring.models.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<Perfil, Long> {
}
