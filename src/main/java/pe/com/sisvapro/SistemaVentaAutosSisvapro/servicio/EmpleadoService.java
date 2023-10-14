package pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio;

import java.util.List;

import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Empleado;

public interface EmpleadoService {
	
	 List<Empleado> listar();
	 Empleado listarPorId(String id);
	 Empleado guardar(Empleado empleado); 
	 Empleado actualizar(Empleado empleado); 
	 void eliminar(String id);
	 
}
