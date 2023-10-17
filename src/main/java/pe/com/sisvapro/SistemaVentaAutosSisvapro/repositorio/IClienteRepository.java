package pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio;

import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {
    public Cliente findByDni(String dni);
    
    public Cliente findByNom(String nom);
    
    public Cliente findByApe(String ape);
    
    
    
    
    
}
