
public class Usuario {
    private String nombre;
    private String apellidos;
    private String email;

    public Usuario(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return nombre + " " + apellidos + "\tE-mail: " + email;
    }

}