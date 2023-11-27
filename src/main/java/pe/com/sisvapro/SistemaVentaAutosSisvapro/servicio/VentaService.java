package pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio;

import ch.qos.logback.core.encoder.EchoEncoder;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.dto.VentaTransactionDto;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Venta;

import java.util.List;

public interface VentaService {

    List<Venta> listarVentas();
    Venta obtenerVenta(int id);
    Venta agregarVenta(VentaTransactionDto venta) throws Exception;

    Venta actualizarVenta(Venta venta);

    void eliminarVenta(int id);

    Venta obtenerUltimaVenta();
}
