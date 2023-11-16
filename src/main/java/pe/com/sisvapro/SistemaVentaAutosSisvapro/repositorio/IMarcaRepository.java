package pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Marca;

public interface IMarcaRepository extends JpaRepository<Marca, Integer> {

}
