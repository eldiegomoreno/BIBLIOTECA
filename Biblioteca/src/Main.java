import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        GestorUsuarios gestorUsuarios = new GestorUsuarios();
        GestorPrestamos gestorPrestamos = new GestorPrestamos();

        Libro libro1 = new Libro("Cálculo: Trascendentes tempranas", "James Stewart", "Cengage Learning", 2008, 1328);
        Libro libro2 = new Libro("Cálculo: Un enfoque de funciones y modelos", "Ron Larson", "McGraw-Hill", 2006, 1184);
        Libro libro3 = new Libro("Cálculo con geometría analítica", "Louis Leithold", "Oxford University Press", 1996, 1192);
        Libro libro4 = new Libro("Cálculo", "Michael Spivak", "Cambridge University Press", 2006, 670);
        Libro libro5 = new Libro("Cálculo infinitesimal", "Richard Courant", "Springer", 1989, 661);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);

        Usuario usuario1 = new Usuario("Diego", "Moreno", "diego.moreno@example.com", "111111");
        Usuario usuario2 = new Usuario("Juan Carlos", "Fuentes", "juan.carlos.fuentes@example.com", "222222");
        Usuario usuario3 = new Usuario("Arely", "Merida", "arely.merida@example.com", "333333");
        Usuario usuario4 = new Usuario("Alberto", "de León", "alberto.deleon@example.com", "444444");
        Usuario usuario5 = new Usuario("Kenet", "Merida", "kenet.merida@example.com", "555555");

        gestorUsuarios.registrarUsuario(usuario1);
        gestorUsuarios.registrarUsuario(usuario2);
        gestorUsuarios.registrarUsuario(usuario3);
        gestorUsuarios.registrarUsuario(usuario4);
        gestorUsuarios.registrarUsuario(usuario5);

        gestorPrestamos.realizarPrestamo(libro1, usuario1, LocalDate.now());
        gestorPrestamos.realizarPrestamo(libro2, usuario2, LocalDate.now());

        System.out.println("Préstamos activos:");
        gestorPrestamos.consultarPrestamosActivos();

        gestorPrestamos.devolverLibro(libro1, usuario1, LocalDate.now().plusDays(7));

        System.out.println("Préstamos activos después de la devolución:");
        gestorPrestamos.consultarPrestamosActivos();

        System.out.println("Informe de todos los préstamos:");
        gestorPrestamos.generarInformePrestamos();
    }
}
