package pe.com.sisvapro.SistemaVentaAutosSisvapro.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tb_empleado")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private int idEmpleado;

    @NotBlank(message = "El DNI no puede estar en blanco")
    @Size(min = 8, max = 8, message = "El DNI debe tener exactamente 8 dígitos")
    @Column(name = "dni")
    private String dni;

    @NotBlank(message = "El nombre no puede estar en blanco")
    @Column(name = "nombre")
    private String nom;

    @NotBlank(message = "El apellido no puede estar en blanco")
    @Column(name = "apellido")
    private String ape;

    @NotBlank(message = "El telefono no puede estar en blanco")
    @Pattern(regexp = "\\d{7,9}", message = "El número de teléfono debe tener un formato de 7 a 9 dígitos")
    @Column(name = "telefono")
    private String tel;

    @NotBlank
    @Column(name = "user")
    private String user;
    
    @NotBlank
    @Column(name = "clave")
    private String clave;

    @Column(name = "img_empleado")
    private String img;

    @ManyToOne()
    @JoinColumn(name = "id_tipo")
    TipoEmpleado objTipo;

    
	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getApe() {
		return ape;
	}

	public void setApe(String ape) {
		this.ape = ape;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public TipoEmpleado getObjTipo() {
		return objTipo;
	}

	public void setObjTipo(TipoEmpleado objTipo) {
		this.objTipo = objTipo;
	}
      
}
