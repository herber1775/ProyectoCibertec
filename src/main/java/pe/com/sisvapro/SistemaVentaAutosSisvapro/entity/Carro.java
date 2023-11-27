package pe.com.sisvapro.SistemaVentaAutosSisvapro.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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

    @NotBlank
    @Column(name = "descripcion")
    private String descripcion;
    
    @NotBlank
    @Column(name = "modelo")
    private String modelo;
    
    @NotBlank
    @Column(name = "origen")
    private String origen;

    @NotNull(message = "El precio no puede ser nulo")
    @DecimalMin(value = "0.0", inclusive = false, message = "El precio debe ser mayor que cero")
    @Column(name = "precio")
    private double precio;
    
    @NotNull(message = "El stock no puede ser nulo")
    @Column(name = "stock")
    private int stock;
    
    @NotNull(message = "El anio no puede ser nulo")
    @Digits(integer = 4, fraction = 0, message = "El año debe ser un número de 4 dígitos")
    @Column(name = "anio")
    private int anio;
    
    @NotBlank
    @Column(name = "nrSerie")
    private String nroSerie;
    
    @ManyToOne
    @JoinColumn(name = "id_marca")
    Marca objMarca;
    
    @NotBlank
    @Column(name = "combustible")
    private String Combustible;


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
