package pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Cliente;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio.IClienteRepository;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.ClienteService;

@Service
public class ClienteImpl implements ClienteService{
	
	
	@Autowired
	private IClienteRepository clienteRepo;
	
	public List<Cliente> listarClientes(){
		return clienteRepo.findAll();
	}
	
	
	
	

}
