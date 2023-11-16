package pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Empleado;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio.IEmpleadoRepository;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.EmpleadoService;

@Service
@AllArgsConstructor
public class EmpleadoImpl implements EmpleadoService {
	
	private IEmpleadoRepository repoEmpleado;

	@Override
	public List<Empleado> listarEmpleado() {
		return repoEmpleado.findAll();
	}

	@Override
	public Empleado obtenerEmpleado(int id) {
		return repoEmpleado.findById(id).orElse(null);
	}

	@Override
	public Empleado agregarEmpleado(Empleado empleado) {
		 return repoEmpleado.save(empleado);
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		Empleado empleadoAct = null;
	try {
		empleadoAct = repoEmpleado.findById(empleado.getIdEmpleado()).orElse(null);
		
		if(empleadoAct != null){
        	empleadoAct.setDni(empleado.getDni());
        	empleadoAct.setNom(empleado.getNom());
        	empleadoAct.setApe(empleado.getApe());
        	empleadoAct.setTel(empleado.getTel());
        	empleadoAct.setUser(empleado.getUser());
        	empleadoAct.setClave(empleado.getClave());
        	empleadoAct.setImg(empleado.getImg());
        	empleadoAct.setObjTipo(empleado.getObjTipo());
		 } else {
	            System.out.println("Empleado no encontrado con ID: " + empleado.getIdEmpleado());
	        }
	    } catch (Exception e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	    return repoEmpleado.save(empleadoAct);
	}	

	@Override
	public void eliminarEmpleado(int id) {
		try {
			repoEmpleado.deleteById(id);	
		}catch (Exception e) {
	        System.out.println("Error: " + e.getMessage());
	    }
		
	}

	@Override
	 public Empleado validar(String user, String clave) {
        return repoEmpleado.findByUserAndClave(user, clave);
	}
	
}
	
	
   
