package pe.com.sisvapro.SistemaVentaAutosSisvapro.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_detalle_venta")
public class DetalleVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalleVenta")
    private int id;
    private double precio;
    private int cantidad;
    private String descripcionC;
    private double subtotal;
    @ManyToOne
    @JoinColumn(name = "id_venta")
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "id_carro")
    private Carro carro;


}
