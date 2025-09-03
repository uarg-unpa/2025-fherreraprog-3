package tp2;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int paginas;

    public Libro(String titulo, String autor, int anioPublicacion, int paginas) {
      if (titulo != null && !titulo.trim().isEmpty())
          this.titulo = titulo;
      else
          this.titulo="Sin Titulo";
      if(autor != null && !autor.trim().isEmpty())
        this.autor=autor;
      else
        this.autor="Desconocido";
      if (anioPublicacion > 0)
        this.anioPublicacion=anioPublicacion;
      if (paginas > 0)
        this.paginas=paginas;
    }
     public Libro(String titulo, String autor) {
      if (titulo != null && !titulo.trim().isEmpty())
          this.titulo = titulo;
      else
          this.titulo="Sin Titulo";
      if(autor != null && !autor.trim().isEmpty())
        this.autor=autor;
     }

    public boolean esReciente() {
        return anioPublicacion > 2010;
    }

    public void actualizarAnio(int nuevoAnio) {
        if (nuevoAnio > 0) this.anioPublicacion = nuevoAnio;
    }

    
    public String toString() {
        return "Libro: " + titulo + " de " + autor + ", " + anioPublicacion + ", " + paginas + " páginas";
    }

    // Main para prueba
    public static void main(String[] args) {
        Libro l1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, 417);
        Libro l2 = new Libro("El código da Vinci", "Dan Brown", 2003, 689);
        Libro l3 = new Libro("JAVA 2", "Francisco Javier Ceballos Sierra");
        System.out.println(l1 + ", ¿Reciente? " + l1.esReciente());
        System.out.println(l2 + ", ¿Reciente? " + l2.esReciente());
        System.out.println(l3 + ", ¿Reciente? " + l3.esReciente());
        l1.actualizarAnio(2020);
        System.out.println("Actualizado: " + l1);
    }
}
