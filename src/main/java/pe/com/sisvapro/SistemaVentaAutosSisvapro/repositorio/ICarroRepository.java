package pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio;

import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Carro;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarroRepository extends JpaRepository<Carro, Integer> {
	public List<Carro> findByid (int idcarro);
}
