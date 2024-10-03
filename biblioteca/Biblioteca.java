package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private List<Usuario> usuarios;

   
    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

  
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }


    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario registrado: " + usuario.getNombre());
    }


    public void prestarLibro(String isbn, Usuario usuario) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn) && libro.isDisponible()) {
                libro.setDisponible(false);
                System.out.println("Libro " + libro.getTitulo() + " prestado a " + usuario.getNombre());
                return;
            }
        }
        System.out.println("El libro no está disponible o no existe.");
    }

    public void devolverLibro(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn) && !libro.isDisponible()) {
                libro.setDisponible(true);
                System.out.println("Libro " + libro.getTitulo() + " devuelto.");
                return;
            }
        }
        System.out.println("El libro no estaba prestado o no existe.");
    }


    public void mostrarLibros() {
        System.out.println("Libros en la biblioteca:");
        for (Libro libro : libros) {
            libro.mostrarInformacion();
        }
    }
}
