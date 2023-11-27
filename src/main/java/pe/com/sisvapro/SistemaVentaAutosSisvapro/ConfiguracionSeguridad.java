package pe.com.sisvapro.SistemaVentaAutosSisvapro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio.IEmpleadoRepository;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.MiUserDetailService;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class ConfiguracionSeguridad {
    //password
    @Bean
    public PasswordEncoder obtenerPasswordenCoder(){
        //return PasswordEncoderFactories.createDelegatingPasswordEncoder();
        return NoOpPasswordEncoder.getInstance();
    }
    //obtener el usuario

    @Bean
    public UserDetailsService obtenerUserService(IEmpleadoRepository empleadoRepository){
        return new MiUserDetailService(empleadoRepository);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(x -> x
                        //.requestMatchers("/validar").permitAll() //todos permitidos
                        .requestMatchers("/**").permitAll()).csrf(AbstractHttpConfigurer::disable)
                .httpBasic(withDefaults())
                .formLogin(withDefaults()); //autenticar

        return http.build();

       /* http.authorizeRequests(authorizeRequests -> authorizeRequests.anyRequest()
                        .authenticated())
                .httpBasic(withDefaults())
                .formLogin(withDefaults())
                .csrf(AbstractHttpConfigurer::disable);*/
    }
    //
}
