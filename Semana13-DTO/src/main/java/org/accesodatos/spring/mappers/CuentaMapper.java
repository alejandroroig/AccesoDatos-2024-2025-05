package org.accesodatos.spring.mappers;

import org.accesodatos.spring.dtos.response.CuentaDTO;
import org.accesodatos.spring.models.Cuenta;
import org.springframework.stereotype.Component;

@Component
public class CuentaMapper {
    public CuentaDTO toDto(Cuenta cuenta) {
        if (cuenta == null) {
            return null;
        }
        CuentaDTO dto = new CuentaDTO();
        dto.setId(cuenta.getId());
        dto.setSaldo(cuenta.getSaldo());
        dto.setFechaCreacion(cuenta.getFechaCreacion());
        dto.setTipoCuenta(cuenta.getTipoCuenta());
        dto.setTransacciones(
                cuenta.getTransacciones() != null
                        ? cuenta.getTransacciones().stream()
                        .map(t -> "ID: " + t.getId() + ", Monto: " + t.getMonto())
                        .toList()
                        : null);
        return dto;
    }
}
