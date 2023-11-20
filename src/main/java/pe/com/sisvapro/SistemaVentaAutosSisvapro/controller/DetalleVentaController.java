package pe.com.sisvapro.SistemaVentaAutosSisvapro.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.DetalleVenta;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Venta;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio.IDetalleVentaRepository;

import java.util.List;

@RestController
@RequestMapping("detalleventas")
@AllArgsConstructor
public class DetalleVentaController {

    IDetalleVentaRepository repoDetalle;

    @GetMapping("")
    public List<DetalleVenta> obtenerDetalle(){
        return repoDetalle.findAll();
    }
}
