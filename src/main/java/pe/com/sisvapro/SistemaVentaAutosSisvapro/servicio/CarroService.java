package pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio;

import java.util.List;

import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Carro;

public interface CarroService {
	
	public Carro agregarCarro(Carro objCarro);
	public List<Carro> listarCarro();
	public Carro actualizarCarro(Carro objCarro);
	public void eliminarCarro(int id);
	public Carro obtenerCarro(int id);	

}
