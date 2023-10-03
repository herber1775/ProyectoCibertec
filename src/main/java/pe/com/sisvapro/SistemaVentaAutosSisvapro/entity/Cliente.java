package pe.com.sisvapro.SistemaVentaAutosSisvapro.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private int idCli ;

    @Column(name = "dni")
    private String dni;

    @Column(name = "nombre")
    private String nom;

    @Column(name = "apellido")
    private String ape;

    @Column(name = "direccion")
    private String dir;

    @Column(name = "correo")
    private String correo;

    @Column(name = "telefono")
    private int tel;
}
