package pe.com.sisvapro.SistemaVentaAutosSisvapro.controller;
import org.springframework.web.bind.annotation.CrossOrigin;

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

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Cliente;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio.IClienteRepository;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.ClienteService;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/clientes")
public class ClienteController {
	
	private ClienteService clienteservice;
	IClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> lisClient() {
		return clienteservice.listarCliente();
	}
	
	@PostMapping
	@ResponseBody
	public Cliente insertCliente(@RequestBody @Valid Cliente cliente) {
		return clienteservice.insertCliente(cliente);
	}
	
	@PutMapping
	@ResponseBody
	public Cliente updateClient(@RequestBody @Valid Cliente cliente) {
		return clienteservice.updateClient(cliente);
	}
	
	 @DeleteMapping("/{idcli}")
	 public void deleteClient(@PathVariable int idcli){
		 clienteservice.deleteClient(idcli);
	    }
		//http://localhost:8080/
}
