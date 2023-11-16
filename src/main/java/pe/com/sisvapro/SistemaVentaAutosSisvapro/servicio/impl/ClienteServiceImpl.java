package pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Cliente;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio.IClienteRepository;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	
	@Autowired
	private IClienteRepository cliRepo;
	
	
	@Override
	public Cliente insertCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return cliRepo.save(cliente);
	}

	@Override
	public Cliente updateClient(Cliente cliente) {
		// TODO Auto-generated method stub
		Cliente objClientes = cliRepo.findById(cliente.getIdCli()).orElse(null);
		objClientes.setNombre(cliente.getNombre());
		objClientes.setCorreo(cliente.getCorreo());
		objClientes.setDireccion(cliente.getDireccion());
		objClientes.setDni(cliente.getDni());
		objClientes.setTelefono(cliente.getTelefono());		
		return cliRepo.save(cliente);
	}

	@Override
	public void deleteClient(int idcli) {
		cliRepo.deleteById(idcli);
	}

	@Override
	public List<Cliente> listarCliente() {
		// TODO Auto-generated method stub
		return cliRepo.findAll();
	}


	
	
	

}
