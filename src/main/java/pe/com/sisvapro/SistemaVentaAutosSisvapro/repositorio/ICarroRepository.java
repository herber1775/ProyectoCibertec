package pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio;

import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Carro;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ICarroRepository extends JpaRepository<Carro, Integer> {
	public List<Carro> findByid (int idcarro);
	

    @Query("select c from Carro as c where modelo like CONCAT('%', :modelo, '%')")
    List<Carro> buscarModeloPorCarro(String modelo);
}
