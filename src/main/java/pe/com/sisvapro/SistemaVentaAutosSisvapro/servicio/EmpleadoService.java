package pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio;

import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Empleado;

public interface EmpleadoService {
    Empleado obtenerEmpleadoUseryClave(String user, String clave);
}
