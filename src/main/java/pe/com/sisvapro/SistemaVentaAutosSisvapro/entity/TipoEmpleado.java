package pe.com.sisvapro.SistemaVentaAutosSisvapro.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "tb_tipo_empleado")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoEmpleado {
    @Id
    @Column(name = "id_tipo")
    private int idTipo;

    @Column(name = "descripcion")
    private String descrip;

    @OneToMany(mappedBy = "objTipo")
    @JsonIgnore
    Set<Empleado> empleado;
}
