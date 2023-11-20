package pe.com.sisvapro.SistemaVentaAutosSisvapro.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.dto.VentaTransactionDto;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Venta;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.VentaService;

import java.util.List;

@RestController
@RequestMapping("/ventas")
@AllArgsConstructor
public class VentaController {

    private VentaService servicioVenta;

    @GetMapping("")
    public List<Venta> listarVenta(){
        return servicioVenta.listarVentas();
    }

    @GetMapping("/{id}")
    public Venta obtenerVenta(@PathVariable int id){
        return servicioVenta.obtenerVenta(id);
    }

    @PostMapping("")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    public Venta agregarVenta(@RequestBody VentaTransactionDto venta) throws Exception{
        return servicioVenta.agregarVenta(venta);
    }

    @PutMapping("")
    @ResponseBody
    public Venta actualizarVenta(@RequestBody Venta venta){
        return servicioVenta.actualizarVenta(venta);
    }

    @DeleteMapping("/{id}")
    public void eliminarVenta(@PathVariable int id){
        servicioVenta.eliminarVenta(id);
    }
}
