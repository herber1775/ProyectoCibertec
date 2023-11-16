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

	public int getIdmarca() {
		return idmarca;
	}

	public void setIdmarca(int idmarca) {
		this.idmarca = idmarca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Carro> getCarro() {
		return carro;
	}

	public void setCarro(Set<Carro> carro) {
		this.carro = carro;
	}
    
    

}
