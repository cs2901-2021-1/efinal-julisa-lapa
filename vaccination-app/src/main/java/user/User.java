package user;

public class User {
    String dni;
    String nombre;
    String destino;
    int dinero;

    public User(String dni, String nombre, String destino, int dinero) {
        setDni(dni);
        setNombre(nombre);
        setDestino(destino);
        setDinero(dinero);
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

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }






}
