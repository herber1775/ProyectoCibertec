package pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Marca;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio.IMarcaRepository;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.MarcaService;

import java.util.List;

@Service
@AllArgsConstructor
public class MarcaServiceImpl implements MarcaService {
    IMarcaRepository marcaRepo;

    public List<Marca> buscarMarca() {
        return marcaRepo.findAll();
    }
}
