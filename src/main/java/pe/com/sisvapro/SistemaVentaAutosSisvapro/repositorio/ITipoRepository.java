package pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.TipoEmpleado;

//@Repository (?)
public interface ITipoRepository extends JpaRepository<TipoEmpleado, Integer> {
}
