package org.accesodatos.spring.repository;

import org.accesodatos.spring.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
}