package pe.com.sisvapro.SistemaVentaAutosSisvapro.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Marca;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.MarcaService;

import java.util.List;

@RestController
@RequestMapping("/marcas")
@AllArgsConstructor
public class MarcaController {
    private MarcaService servicioMarca;

    @GetMapping("/list")
    public ResponseEntity<List<Marca>> list() {
        List<Marca> list = servicioMarca.buscarMarca();
        return new ResponseEntity<List<Marca>>(list, HttpStatus.OK);
    }
}
