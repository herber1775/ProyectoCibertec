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

    @Column(name = "nom_marca")
    private String nomMarca;

    @OneToMany(mappedBy = "objMarca")
    @JsonIgnore
    Set<Carro> carro;

	public int getIdmarca() {
		return idmarca;
	}

	public void setIdmarca(int idmarca) {
		this.idmarca = idmarca;
	}

	public String getnomMarca() {
		return nomMarca;
	}

	public void setnomMarca(String nomMarca) {
		this.nomMarca = nomMarca;
	}

	public Set<Carro> getCarro() {
		return carro;
	}

	public void setCarro(Set<Carro> carro) {
		this.carro = carro;
	}
    
    

}
