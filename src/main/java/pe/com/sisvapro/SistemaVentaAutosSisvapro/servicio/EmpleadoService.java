package pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio;

import java.util.List;

import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Empleado;

public interface EmpleadoService {
	
	 public List<Empleado> listarEmpleado();
	 public Empleado obtenerEmpleado(int id);
	 public Empleado agregarEmpleado(Empleado empleado); 
	 public Empleado actualizarEmpleado(Empleado empleado); 
	 public void eliminarEmpleado(int id);
	 
}
