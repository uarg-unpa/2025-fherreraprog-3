package tp4.gestionDeNombres;


public class ColaNombres {
    private String[] elementos;
    private int frente;
    private int fin;
    private final int MAX = 10;

    public ColaNombres() {
        elementos = new String[MAX];
        frente = 0;
        fin = 0;
    }

    public boolean estaVacia() {
        return frente == fin;
    }

    public boolean estaLlena() {
        return (fin + 1) % MAX == frente;
    }

    public void encolar(String elem) {
        elementos[fin] = elem;
        fin = (fin + 1) % MAX;
    }

    public String desencolar() {
        String aux = elementos[frente];
        frente = (frente + 1) % MAX;
        return aux;
    }

    public String peek() {
        // Simula manejo de cola, retorna el frente como si fuera una operación controlada
        return obtenerFrente();
    }

    private String obtenerFrente() {
        return elementos[frente]; // Método auxiliar para encapsular acceso
    }
}
