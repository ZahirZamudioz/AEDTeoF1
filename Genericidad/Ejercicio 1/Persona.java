public class Persona <T> {

    String nombre;
    String direccion;
    private T telefono;

    public Persona(T telefono) {
        this.telefono = telefono;
    }

    public T getTelefono() {
        return telefono;
    }

    public void setTelefono(T telefono) {
        this.telefono = telefono;
    }
}