package biblioteca;

public class Usuario {
    private String nombre;
    private int id;

    // Constructor
    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Método para mostrar información del usuario
    public void mostrarInformacion() {
        System.out.println("Usuario: " + nombre + ", ID: " + id);
    }
}
