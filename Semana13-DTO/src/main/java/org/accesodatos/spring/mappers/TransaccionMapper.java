package org.accesodatos.spring.mappers;

import org.accesodatos.spring.dtos.response.TransaccionDTO;
import org.accesodatos.spring.models.Transaccion;
import org.springframework.stereotype.Component;

@Component
public class TransaccionMapper {
    public TransaccionDTO toDto(Transaccion transaccion) {
        if (transaccion == null) {
            return null;
        }
        TransaccionDTO dto = new TransaccionDTO();
        dto.setId(transaccion.getId());
        dto.setMonto(transaccion.getMonto());
        dto.setFecha(transaccion.getFecha());
        dto.setTipoTransaccion(transaccion.getTipoTransaccion());
        return dto;
    }
}