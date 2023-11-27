package pe.com.sisvapro.SistemaVentaAutosSisvapro.dto;

import lombok.Getter;
import lombok.Setter;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.DetalleVenta;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Venta;

import java.util.List;

@Getter
@Setter
public class VentaTransactionDto {

    public Venta venta;
    public List<DetalleVenta> detalleVenta;

}
