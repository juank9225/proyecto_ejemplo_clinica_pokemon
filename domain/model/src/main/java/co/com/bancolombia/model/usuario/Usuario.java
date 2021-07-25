package co.com.bancolombia.model.usuario;
import com.sun.org.apache.xpath.internal.operations.String;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Usuario {
    private String id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String profesion;
    private String correo;

    public Usuario() {
    }

    public Usuario(String id, String nombre, String apellido, String telefono, String profesion, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.profesion = profesion;
        this.correo = correo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
