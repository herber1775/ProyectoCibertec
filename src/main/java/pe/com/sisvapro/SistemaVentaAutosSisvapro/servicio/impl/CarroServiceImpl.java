package pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Carro;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio.ICarroRepository;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.CarroService;

@Service
@AllArgsConstructor
public class CarroServiceImpl implements CarroService {

	private ICarroRepository repoCarro;

	@Override
	public List<Carro> listarCarro() {
		return repoCarro.findAll();
	}
	
	@Override
	public Carro obtenerCarro(int id) {
		return repoCarro.findById(id).orElse(null);
	}
	
	public static boolean validarDes(String texto) {
		boolean valido = true;
		if (texto.isEmpty()) {
			valido = false;
		} else if (!texto.substring(0, texto.length()).matches("^[a-zA-Z0-9 ]*$")) {
			valido = false;
		}
		return valido;
	}
	
	public static boolean validarModelo(String texto) {
		boolean valido = true;
		if (texto.isEmpty()) {
			valido = false;
		} else if (!texto.substring(0, texto.length()).matches("^[a-zA-Z0-9 ]*$")) {
			valido = false;
		}
		return valido;
	}


	public static boolean validarOrigen(String texto) {
		boolean valorg = true;
		if (texto.isEmpty()) {
			valorg = false;
		} else if (!texto.substring(0, texto.length()).matches("^[a-zA-Z ]*$")) {
			valorg = false;
		}
		return valorg;
	}

	public static boolean validarCombustible(String texto) {
		boolean valcomb = true;
		if (texto.isEmpty()) {
			valcomb = false;
		} else if (!texto.substring(0, texto.length()).matches("^[a-zA-Z ]*$")) {
			valcomb = false;
		}
		return valcomb;
	}

	public static boolean validarPrecio(double precio) {
		String prec = String.valueOf(precio);
		boolean validaPrecio = !prec.trim().isEmpty();

		if (!prec.matches("[0-9]*+([.][0-9]{1,2})?")) {
			validaPrecio = false;
		}

		return validaPrecio;
	}

	public static boolean validarStock(int stock) {
		
			String stk = String.valueOf(stock);
			boolean validarStock = true;

			if (stk.trim().isEmpty()) {
				validarStock = false;
			}

			else if (!stk.matches("[1-9]+[0-9]*")) {
				validarStock = false;
			}

			return validarStock;
		
	}
	
	public static boolean validarAnio(int anio) {
		
		String aniio = String.valueOf(anio);
		boolean validarAnio = true;

		if (aniio.trim().isEmpty()) {
			validarAnio = false;
		}

		else if (!aniio.matches("[0-9]{4}")) {
			validarAnio = false;
		}

		return validarAnio;
	}
	
	public static boolean validarNroSerie(String nroserie) {
		boolean valnroserie = true;
		if (nroserie.isEmpty()) {
			valnroserie = false;
		} else if (!nroserie.substring(0, nroserie.length()).matches("^[A-Z0-9]{17}$")) {
			valnroserie = false;
		}
		return valnroserie;
	}
	
	@Override
	public Carro agregarCarro(Carro objCarro) {
	    try {
	        if (validarDes(objCarro.getDescripcion())) {
	            objCarro.setDescripcion(objCarro.getDescripcion());
	        } else {
	            System.out.println("Registrar un texto válido en la descripción: " + objCarro.getDescripcion());
	        }
	        
	        if (validarModelo(objCarro.getModelo())) {
	            objCarro.setModelo(objCarro.getModelo());
	        } else {
	            System.out.println("Registrar un texto válido en el modelo: " + objCarro.getModelo());
	        }
	        
	        if (objCarro.getObjMarca().getIdmarca() != -1) {
	        	objCarro.getObjMarca().setIdmarca(objCarro.getObjMarca().getIdmarca());
			} else {
	            System.out.println("Registrar un texto válido en la marca: " + objCarro.getDescripcion());
			}

			if (validarOrigen(objCarro.getOrigen())) {
				objCarro.setOrigen(objCarro.getOrigen());
			} else {
				System.out.println("Registrar un texto válido en el origen: "+ objCarro.getOrigen());
			}

			if (validarCombustible(objCarro.getCombustible())) {
				objCarro.setCombustible(objCarro.getCombustible());
			} else {
				System.out.println("Registrar un texto válido en el combustible: " + objCarro.getCombustible());

			}

			if (validarPrecio(objCarro.getPrecio())) {
				objCarro.setPrecio(objCarro.getPrecio());
			} else {
				System.out.println("Ingrese un precio válido: " + objCarro.getPrecio());
			}

			if (validarStock(objCarro.getStock())) {
				objCarro.setStock(objCarro.getStock());
			} else {
				System.out.println("Ingrese un stock válido: " + objCarro.getStock());
			}
			
			if (validarAnio(objCarro.getAnio())) {
				objCarro.setAnio(objCarro.getAnio());
			} else {
				System.out.println("Ingrese un año válido: " + objCarro.getAnio());
			}
			
			if (validarNroSerie(objCarro.getNroSerie())) {
				objCarro.setNroSerie(objCarro.getNroSerie());
			} else {
				System.out.println("Ingrese un Nro Serie válido: " + objCarro.getNroSerie());
			}
			
			          
	    } catch (Exception e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	    return repoCarro.save(objCarro);  	    
	}
	
	@Override
	public Carro actualizarCarro(Carro objCarro) {
		Carro objCarroAct = null;
	    try {
	        objCarroAct = repoCarro.findById(objCarro.getId()).orElse(null);

	        if (objCarroAct != null) {
	            objCarroAct.setDescripcion(objCarro.getDescripcion());
	            objCarroAct.setModelo(objCarro.getModelo());
	            objCarroAct.setOrigen(objCarro.getOrigen());
	            objCarroAct.setCombustible(objCarro.getCombustible());
	            objCarroAct.setPrecio(objCarro.getPrecio());
	            objCarroAct.setStock(objCarro.getStock());
	            objCarroAct.setAnio(objCarro.getAnio());
	            objCarroAct.setNroSerie(objCarro.getNroSerie());
	            objCarroAct.getObjMarca().setIdmarca(objCarro.getObjMarca().getIdmarca());
	        } else {
	            System.out.println("Carro no encontrado con ID: " + objCarro.getId());
	        }
	    } catch (Exception e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	    return repoCarro.save(objCarroAct);
	}

	@Override
	public void eliminarCarro(int id) {
		try {
			repoCarro.deleteById(id);	
		}catch (Exception e) {
	        System.out.println("Error: " + e.getMessage());
	    }
		
	}
	
	
}