package pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio;

import org.springframework.security.core.userdetails.UserDetails;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Empleado;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



public interface IEmpleadoRepository extends JpaRepository<Empleado, Integer> {
	 Empleado findByUserAndClave(String user, String clave); //Pregunta

    Optional<Empleado> findByUser(String username);
}
