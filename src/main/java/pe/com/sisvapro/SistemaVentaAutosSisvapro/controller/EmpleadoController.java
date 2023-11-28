package pe.com.sisvapro.SistemaVentaAutosSisvapro.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Empleado;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.EmpleadoService;

@RestController
@CrossOrigin("http://localhost:4200")
@AllArgsConstructor
@RequestMapping("/empleados")

public class EmpleadoController {
	
    private EmpleadoService empleadoService;
	
	@GetMapping("")
    public List<Empleado> listarEmpleado(){
        return empleadoService.listarEmpleado();
    }
	
	 @GetMapping("/{id}")
	    public Empleado obtenerEmpleado(@PathVariable int id){
	        return empleadoService.obtenerEmpleado(id);
	    }
	 
	 @PostMapping
	 @ResponseBody
	 public Empleado agregarEmpleado(@RequestBody @Valid Empleado empleado) {
	   return empleadoService.agregarEmpleado(empleado);
	 }
	 
	 @PutMapping
		@ResponseBody
		public Empleado actualizarEmpleado(@RequestBody @Valid Empleado empleado) {
			return empleadoService.actualizarEmpleado(empleado);
		}
	 

	 @DeleteMapping("/{id}")
		public void eliminarEmpleado(@PathVariable int id) {
		 empleadoService.eliminarEmpleado(id);
		}

}