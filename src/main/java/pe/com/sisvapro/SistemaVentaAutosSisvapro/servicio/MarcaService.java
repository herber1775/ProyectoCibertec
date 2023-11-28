package pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Marca;

import java.util.List;

public interface MarcaService {
    public List<Marca>buscarMarca();
}
