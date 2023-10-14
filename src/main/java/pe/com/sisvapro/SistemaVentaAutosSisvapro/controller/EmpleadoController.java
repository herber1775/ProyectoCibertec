package pe.com.sisvapro.SistemaVentaAutosSisvapro.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Empleado;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.EmpleadoService;

@RestController
@RequestMapping("/empleado")

public class EmpleadoController {
	
	@Autowired
    private EmpleadoService empleadoService;
	
	@GetMapping("")
    public List<Empleado> listarEmpleados(){
        return empleadoService.listar();
    }
	
	 @GetMapping("/{id}")
	    public Empleado obtenerVendedorPorId(@PathVariable String id){
	        return empleadoService.listarPorId(id);
	    }

}