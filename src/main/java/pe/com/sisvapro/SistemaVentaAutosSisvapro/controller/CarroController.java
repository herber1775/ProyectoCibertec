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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Carro;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.CarroService;

@RestController
@AllArgsConstructor
@RequestMapping("/carros")
public class CarroController {
	
	private CarroService carroService;
	
	@GetMapping("")
	public List<Carro> listarCarro() {
		return carroService.listarCarro();
	}
	
	@GetMapping("/{id}")
	public Carro obtenerCarro(@PathVariable int id) {
		return carroService.obtenerCarro(id);
	}

	// Registrar Carro
	@PostMapping("/insertar")
	@ResponseBody
	public Carro agregarCarro(@RequestBody Carro carro) {
		return carroService.agregarCarro(carro);
	}

	// Actualizar Carro
	@PutMapping("/actualizar")
	@ResponseBody
	public Carro actualizarCarro(@RequestBody Carro carro) {
		return carroService.actualizarCarro(carro);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminarCarro(@PathVariable int id) {
		carroService.eliminarCarro(id);
	}
	
}
