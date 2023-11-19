package pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio;

import java.util.List;


import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Cliente;

public interface ClienteService {
	
	public Cliente insertCliente(Cliente cliente);
	public Cliente updateClient(Cliente cliente);
	public void deleteClient(int idcli);
	public List<Cliente> listarCliente();
	

}
