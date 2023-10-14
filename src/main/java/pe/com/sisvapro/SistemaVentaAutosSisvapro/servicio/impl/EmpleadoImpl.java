package pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Empleado;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio.IEmpleadoRepository;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.EmpleadoService;

@Service
public class EmpleadoImpl implements EmpleadoService {
	
	@Autowired
    private IEmpleadoRepository empleadoRepository;

	@Override
	public List<Empleado> listar() {
		return empleadoRepository.findAll();
	}
	
	@Override
    public Empleado listarPorId(String id) {
        return empleadoRepository.findById(id).orElse(null);
    }

	@Override
	public Empleado guardar(Empleado empleado) {
		 return empleadoRepository.save(empleado);
	}

	@Override
	public Empleado actualizar(Empleado empleado) {
		
		Empleado empleadoEntity = listarPorId(empleado.getIdEmpleado());
        if(empleadoEntity != null){
        	empleadoEntity.setDni(empleado.getDni());
        	empleadoEntity.setNom(empleado.getNom());
        	empleadoEntity.setApe(empleado.getApe());
        	empleadoEntity.setTel(empleado.getTel());
        	empleadoEntity.setUser(empleado.getUser());
        	empleadoEntity.setClave(empleado.getClave());
        	empleadoEntity.setImg(empleado.getImg());
        	empleadoEntity.setObjTipo(empleado.getObjTipo());
            return guardar(empleadoEntity);
        }

        return null;
    }
	

	@Override
	public void eliminar(String id) {
		empleadoRepository.deleteById(id);
		
	}

}
