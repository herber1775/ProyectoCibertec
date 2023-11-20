package pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio.IEmpleadoRepository;

@AllArgsConstructor
public class MiUserDetailService implements UserDetailsService {
    IEmpleadoRepository repositoryEmpleado;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repositoryEmpleado.findByUser(username).orElseThrow(() -> new UsernameNotFoundException("No se encontro usuario") );
    }
}
