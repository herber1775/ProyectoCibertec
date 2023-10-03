package pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio;

import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {
    Cliente findByDni(String dni);
}
