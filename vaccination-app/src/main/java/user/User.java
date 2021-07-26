package user;

public class User {
    String dni;
    String nombre;
    String password;

    public User(String dni, String nombre, String password) {
        setDni(dni);
        setNombre(nombre);
        setpassword(password);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }
}
