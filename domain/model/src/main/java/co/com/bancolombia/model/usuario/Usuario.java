package co.com.bancolombia.model.usuario;
import co.com.bancolombia.model.usuario.valuesobjects.*;
import com.sun.org.apache.xpath.internal.operations.String;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Usuario {
    private String id;
    private Nombre nombre;
    private Apellido apellido;
    private Telefono telefono;
    private Profesion profesion;
    private Correo correo;

    public Usuario() {
    }

    public Usuario(String id, Nombre nombre, Apellido apellido, Telefono telefono, Profesion profesion, Correo correo) {
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

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public Apellido getApellido() {
        return apellido;
    }

    public void setApellido(Apellido apellido) {
        this.apellido = apellido;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public Profesion getProfesion() {
        return profesion;
    }

    public void setProfesion(Profesion profesion) {
        this.profesion = profesion;
    }

    public Correo getCorreo() {
        return correo;
    }

    public void setCorreo(Correo correo) {
        this.correo = correo;
    }
}