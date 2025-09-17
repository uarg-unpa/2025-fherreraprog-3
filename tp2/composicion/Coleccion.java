package tp2.composicion;

public class Coleccion {

    private int[] elementos;     // Array para almacenar los elementos
    private int actual;          // Cantidad actual de elementos
    private final int MAXCAPA = 20; // Capacidad máxima de la colección

    // Constructor
    public Coleccion() {
        elementos = new int[MAXCAPA];
        actual = 0;
    }

    // Retorna la cantidad de elementos almacenados
    public int cantidadElementos() {
        return actual;
    }

    // Agregar un nuevo elemento al final de la colección
    public boolean agregarElemento(int nuevo) {
        if (actual < MAXCAPA) {
            elementos[actual] = nuevo;
            actual++;
            return true;
        }
        return false; // no hay espacio
    }

    // Elimina la primera ocurrencia de un elemento y mueve los posteriores
    public boolean eliminarElemento(int elementoAEliminar) {
        for (int i = 0; i < actual; i++) {
            if (elementos[i] == elementoAEliminar) {
                for (int j = i; j < actual - 1; j++) {
                    elementos[j] = elementos[j + 1];
                }
                elementos[actual - 1] = 0;
                actual--;
                return true;
            }
        }
        return false; // no encontrado
    }

    // Vaciar completamente la colección
    public void vaciarColeccion() {
        elementos = new int[MAXCAPA];
        actual = 0;
    }

    // Retorna un nuevo array con solo los elementos cargados
    public int[] getElementos() {
        int[] copia = new int[actual];
        for (int i = 0; i < actual; i++) {
            copia[i] = elementos[i];
        }
        return copia;
    }

    // Representación en texto de la colección
    @Override
    public String toString() {
        String texto = "Colección (" + actual + " elementos): ";
        for (int i = 0; i < actual; i++) {
            texto += elementos[i] + " ";
        }
        return texto.trim();
    }
}
