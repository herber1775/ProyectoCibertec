package pe.com.sisvapro.SistemaVentaAutosSisvapro.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Carro;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio.ICarroRepository;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.CarroService;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/carros")
public class CarroController {
	
	private CarroService carroService;
	ICarroRepository carroRepository;
	
	@GetMapping("")
	public List<Carro> finAll(String modelo) {
		if (modelo != null) {
            return carroRepository.buscarModeloPorCarro(modelo);
        }
		return carroService.listarCarro();
	}
	
	@GetMapping("/{id}")
	public Carro obtenerCarro(@PathVariable int id) {
		return carroService.obtenerCarro(id);
	}

	// Registrar Carro
	@PostMapping
	@ResponseBody
	public ResponseEntity<Integer> agregarCarro(@RequestBody @Valid Carro carro) {
		Carro nuevoCarro = carroService.agregarCarro(carro);
		return ResponseEntity.status(HttpStatus.CREATED).body(nuevoCarro.getId());
	}
	
	// Actualizar Carro
	@PutMapping
	@ResponseBody
	public ResponseEntity<Integer> actualizarCarro(@RequestBody @Valid Carro carro) {
		Carro actCarro = carroService.actualizarCarro(carro);
		if (actCarro != null) {
			return ResponseEntity.status(HttpStatus.CREATED).body(actCarro.getId());
		} else {
			// Manejar el caso en que la actualización no fue exitosa
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@DeleteMapping("/{id}")
	public void eliminarCarro(@PathVariable int id) {
		carroService.eliminarCarro(id);
	}

	@GetMapping("/marca/{marca}")
	public List<Carro> listarPorMarca(@PathVariable int marca) {
		return carroService.listarPorMarca(marca);
	}
	

}
