package pe.com.sisvapro.SistemaVentaAutosSisvapro.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Empleado;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.EmpleadoService;

@RestController
@RequestMapping("")
@AllArgsConstructor
public class LoginController {
    private EmpleadoService servicioEmpleado;

    @GetMapping("/validar/{user}/{clave}")
    public Empleado validar(@PathVariable String user,@PathVariable String clave){
        return servicioEmpleado.validar(user, clave);
    }
}
