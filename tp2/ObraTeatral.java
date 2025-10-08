package tp2;

public class ObraTeatral {
    private String nombre;
    private double precio;

    // Constructor
    public ObraTeatral(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ObraTeatral [nombre=" + nombre + ", precio=" + precio + "]";
    }

    
}
