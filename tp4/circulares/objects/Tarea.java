package tp4.circulares.objects;



public class Tarea {
    private String descripcion;
    private int prioridad;

    public Tarea(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public String getDescripcion() { return descripcion; }
    public int getPrioridad() { return prioridad; }

    @Override
    public String toString() {
        return "Tarea{descripcion='" + descripcion + "', prioridad=" + prioridad + "}";
    }
}
