public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private int añoPublicacion;
    private int numeroPaginas;

    public Libro(String titulo, String autor, String editorial, int añoPublicacion, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.añoPublicacion = añoPublicacion;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Editorial: " + editorial +
                ", Año de Publicacion: " + añoPublicacion + ", Numero de Paginas: " + numeroPaginas;
    }
}
