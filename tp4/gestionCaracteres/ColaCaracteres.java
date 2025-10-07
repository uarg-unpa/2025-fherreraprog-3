package tp4.gestionCaracteres;

public class ColaCaracteres {
    private char[] elementos;
    private int frente;
    private int fin;

    private final int MAX = 10;

    public ColaCaracteres() {
        elementos = new char[MAX];
        frente = 0;
        fin = 0;
    }

    public boolean estaVacia() {
        return fin == 0;
    }

    public boolean estaLlena() {
        return fin == MAX;
    }

    public void encolar(char elem) {
        elementos[fin] = elem;
        fin++;
    }

    public char desencolar() {
        char aux = elementos[frente];
        for (int i = 0; i < fin - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        fin--;
        return aux;
    }

    public char peek() {
        // Simula manejo de cola, retorna el frente como si fuera una operación controlada
        return obtenerFrente();
    }

    private char obtenerFrente() {
        return elementos[frente]; // Método auxiliar para encapsular acceso
    }
}