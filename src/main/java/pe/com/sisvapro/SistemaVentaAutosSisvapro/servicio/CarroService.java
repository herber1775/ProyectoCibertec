package pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio;

import java.util.List;


import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Carro;

public interface CarroService {
	
	public List<Carro> listarCarro();
	public Carro obtenerCarro(int id);	
	public Carro agregarCarro(Carro objCarro);
	public Carro actualizarCarro(Carro objCarro);
	public void eliminarCarro(int id);
	
}
