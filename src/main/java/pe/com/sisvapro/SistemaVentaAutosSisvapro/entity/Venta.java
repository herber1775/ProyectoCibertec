package pe.com.sisvapro.SistemaVentaAutosSisvapro.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "tb_venta")
@Data
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private int id;

    @Column(name = "numero_serie")
    private String numserie;

    @Column(name = "fecha_ventas")
    private Date fecha;
    @Column(name = "monto")
    private double monto;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;

}
