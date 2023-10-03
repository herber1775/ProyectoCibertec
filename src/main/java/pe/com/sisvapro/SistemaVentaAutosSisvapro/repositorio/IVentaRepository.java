package pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Venta;

//@Repository
public interface IVentaRepository extends JpaRepository<Venta, Integer> {
    public Optional<Venta> findFirstByOrderByIdDesc(); 
    List<Venta> findVentaByFechaBetween(Date fechaInicio, Date fechaFin);
    //List<Venta> findVentaByFechaBetween(String fechaInicio, String fechaFin);

}
