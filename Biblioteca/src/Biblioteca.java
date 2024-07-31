import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(String titulo, String autor) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equals(titulo) && libros.get(i).getAutor().equals(autor)) {
                libros.remove(i);
                break;
            }
        }
    }

    public Libro buscarLibro(String titulo, String autor) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo) && libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    public void listarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
