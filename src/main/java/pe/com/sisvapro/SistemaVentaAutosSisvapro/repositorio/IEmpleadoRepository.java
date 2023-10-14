package pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio;

import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Empleado;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


//@Repository (?)
public interface IEmpleadoRepository extends JpaRepository<Empleado, Integer> {
	Empleado findByUserAndClave(String user, String clave);

	Optional<Empleado> findById(String id);

	void deleteById(String id); 

}
