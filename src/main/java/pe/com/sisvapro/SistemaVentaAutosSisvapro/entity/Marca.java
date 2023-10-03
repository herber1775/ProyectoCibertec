package pe.com.sisvapro.SistemaVentaAutosSisvapro.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "tb_marca")
@Data
public class Marca {
    @Id
    @Column(name = "id_marca")
    private int idmarca;

    @Column(name = "nomMarca")
    private String descripcion;

    @OneToMany(mappedBy = "objMarca")
    @JsonIgnore
    Set<Carro> carro;

}
