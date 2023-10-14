package pe.com.sisvapro.SistemaVentaAutosSisvapro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Empleado;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.EmpleadoService;

@RestController
@RequestMapping("")
public class LoginController {
    @Autowired
    private EmpleadoService servicioEmpleado;

    @GetMapping("/empleadouserclave/{user}/{clave}")
    public Empleado obtenerEmpleadoUserClave(@PathVariable String user,@PathVariable String clave){
        return servicioEmpleado.obtenerEmpleadoUseryClave(user, clave);
    }
}
