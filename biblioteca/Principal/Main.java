package biblioteca.Principal;

import biblioteca.Biblioteca;
import biblioteca.Libro;
import biblioteca.Usuario;

public class Main {
    public static void main(String[] args) {
      
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "123456");
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "789101");

        
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

       
        Usuario usuario1 = new Usuario("Juan", 1);
        Usuario usuario2 = new Usuario("Ana", 2);

       
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        
        biblioteca.prestarLibro("123456", usuario1);

      
        biblioteca.mostrarLibros();

      
        biblioteca.devolverLibro("123456");

        biblioteca.mostrarLibros();
    }
}
