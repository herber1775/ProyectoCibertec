package pe.com.sisvapro.SistemaVentaAutosSisvapro.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tb_carro")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carro")
    private int id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "modelo")
    private String modelo;
    
    @Column(name = "origen")
    private String origen;

    @Column(name = "combustible")
    private String Combustible;

    @Column(name = "precio")
    private double precio;

    @Column(name = "stock")
    private int stock;
    
    @Column(name = "anio")
    private int anio;
    
    @Column(name = "nrSerie")
    private String nroSerie;
    
    @ManyToOne
    @JoinColumn(name = "id_marca")
    Marca objMarca;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getCombustible() {
		return Combustible;
	}

	public void setCombustible(String combustible) {
		Combustible = combustible;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getNroSerie() {
		return nroSerie;
	}

	public void setNroSerie(String nroSerie) {
		this.nroSerie = nroSerie;
	}

	public Marca getObjMarca() {
		return objMarca;
	}

	public void setObjMarca(Marca objMarca) {
		this.objMarca = objMarca;
	}
    
    

}
