package pe.com.sisvapro.SistemaVentaAutosSisvapro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Cliente;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.ClienteService;

@RestController
public class ClienteController {
	
	
	@Autowired
	private ClienteService clienteservice;
	
	@GetMapping("/cliente")
	public List<Cliente> lisClient() {
		return clienteservice.listarCliente();
	}
	
	@PostMapping("/insertCliente")
	@ResponseBody
	public Cliente insertCliente(@RequestBody Cliente cliente) {
		return clienteservice.insertCliente(cliente);
	}
	
	@PutMapping("/updateCliente")
	@ResponseBody
	public Cliente updateClient(@RequestBody Cliente cliente) {
		return clienteservice.updateClient(cliente);
	}
	
	 @DeleteMapping("/{idcli}")
	 public void deleteClient(@PathVariable int idcli){
		 clienteservice.deleteClient(idcli);
	    }
		
	
}
