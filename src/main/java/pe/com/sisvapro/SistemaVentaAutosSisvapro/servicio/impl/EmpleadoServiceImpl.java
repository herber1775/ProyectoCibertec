package pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Empleado;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio.IEmpleadoRepository;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private IEmpleadoRepository repoEmpleado;
    @Override
    public Empleado obtenerEmpleadoUseryClave(String user, String clave) {
        return repoEmpleado.findByUserAndClave(user, clave);

    }
}
