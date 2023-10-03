package pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio;

import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;


//@Repository (?)
public interface IEmpleadoRepository extends JpaRepository<Empleado, Integer> {
    Empleado findByUserAndClave(String user, String clave); //Pregunta
}
