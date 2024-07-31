import java.time.LocalDate;
import java.util.LinkedList;

public class GestorPrestamos {
    private LinkedList<Prestamo> prestamos = new LinkedList<>();

    public void realizarPrestamo(Libro libro, Usuario usuario, LocalDate fechaPrestamo) {
        Prestamo prestamo = new Prestamo(libro, usuario, fechaPrestamo);
        prestamos.add(prestamo);
    }

    public void devolverLibro(Libro libro, Usuario usuario, LocalDate fechaDevolucion) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.libro.equals(libro) && prestamo.usuario.equals(usuario) && prestamo.getFechaDevolucion() == null) {
                prestamo.devolverLibro(fechaDevolucion);
                break;
            }
        }
    }

    public void consultarPrestamosActivos() {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getFechaDevolucion() == null) {
                System.out.println(prestamo);
            }
        }
    }

    public void generarInformePrestamos() {
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
        }
    }
}
