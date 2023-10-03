package pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio;

import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
//@Repository
public interface IDetalleVentaRepository extends JpaRepository<DetalleVenta, Integer> {
    List<DetalleVenta> findByVentaId(int id);
}
