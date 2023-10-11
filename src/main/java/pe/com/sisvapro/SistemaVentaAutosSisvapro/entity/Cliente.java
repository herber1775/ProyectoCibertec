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
    private String tel;
    
    
    public int getId_cli() {
    	return idCli;
    }
    
    public void setId_cli(int id_cli) {
    	this.idCli = id_cli;
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
    
    public String getApe(){
    	return ape;
    }
    
    public void setDir(String dir) {
    	this.dir = dir;
    }
    
    public String getCorreo() {
    	return correo;
    }
    
    public void setCorreo(String correo) {
    	this.correo = correo;
    }
    
    public String getTelefono() {
    	return tel;
    }
    
    public void setTel(String tel) {
    	this.tel = tel;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
