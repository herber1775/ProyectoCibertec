package pe.com.sisvapro.SistemaVentaAutosSisvapro.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.dto.LoginDto;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Empleado;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.EmpleadoService;

@RestController
@AllArgsConstructor
public class LoginController {
    private EmpleadoService servicioEmpleado;

    //post
    /*@GetMapping("/validar/{user}/{clave}")
    public Empleado validar(@PathVariable String user,@PathVariable String clave){
        return servicioEmpleado.validar(user, clave);
    }*/


    //@PreAuthorize("permitAll()")//permite a todos
    @PostMapping("/validar")
    public Empleado validar(@RequestBody LoginDto loginDto){
        return servicioEmpleado.validar(loginDto.getUser(), loginDto.getClave());
    }
}
