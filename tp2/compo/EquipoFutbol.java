package tp2.compo;

public class EquipoFutbol {

    private String nombreEquipo;
    private String entrenador;
    private String[] jugadores;
    private int cantidadActual;
    private final int MAX_JUGADORES = 25;

    // Constructor (sin validaciones)
    public EquipoFutbol(String nombreEquipo, String entrenador) {
        this.nombreEquipo = nombreEquipo;
        this.entrenador = entrenador;
        this.jugadores = new String[MAX_JUGADORES];
        this.cantidadActual = 0;
    }

    // Getters y setters básicos
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public int getCapacidadMaxima() {
        return MAX_JUGADORES;
    }

    // Operaciones sobre jugadores
    public boolean agregarJugador(String nombreJugador) {
        if (cantidadActual < MAX_JUGADORES) {
            jugadores[cantidadActual] = nombreJugador;
            cantidadActual++;
            return true;
        }
        return false;
    }

    public boolean eliminarJugador(int posicion) {
        if (posicion < 0 || posicion >= cantidadActual) {
            return false;
        }
        for (int i = posicion; i < cantidadActual - 1; i++) {
            jugadores[i] = jugadores[i + 1];
        }
        jugadores[cantidadActual - 1] = null;
        cantidadActual--;
        return true;
    }

    public String[] getJugadores() {
        String[] copia = new String[cantidadActual];
        for (int i = 0; i < cantidadActual; i++) {
            copia[i] = jugadores[i];
        }
        return copia;
    }

    // Representación en texto del equipo
    @Override
    public String toString() {
        String texto = "Equipo: " + nombreEquipo + " | Entrenador: " + entrenador
                     + "\nJugadores (" + cantidadActual + "):\n";
        for (int i = 0; i < cantidadActual; i++) {
            texto += i + ") " + jugadores[i] + "\n";
        }
        return texto;
    }
}

