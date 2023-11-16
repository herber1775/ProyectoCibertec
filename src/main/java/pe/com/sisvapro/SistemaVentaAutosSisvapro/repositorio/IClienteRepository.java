package pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio;

import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Cliente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {
	
    public Cliente findByDni(String dni);
    
    public List<Cliente> findByNombre(String nombre);
    
    public List<Cliente> findByApellido(String apellido);
    
   
    
    
    
    
    
}
