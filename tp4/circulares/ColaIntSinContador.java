package tp4.circulares;


public class ColaIntSinContador {
    private int[] elementos;
    private int frente;
    private int fin;
    private final int MAX = 10;

    public ColaIntSinContador() {
        elementos = new int[MAX];
        frente = 0;
        fin = 0;
    }

    public boolean estaVacia() {
        return frente == fin; // Vacía si ambos punteros coinciden
    }

    public boolean estaLlena() {
        return (fin + 1) % MAX == frente; // Llena si el siguiente de fin es frente
    }

    public void encolar(int elem) {
        elementos[fin] = elem;
        fin = (fin + 1) % MAX; // Avanza circularmente
    }

    public int desencolar() {
        int aux = elementos[frente];
        frente = (frente + 1) % MAX; // Avanza circularmente
        return aux;
    }

    public int peek() {
        return elementos[frente];
    }
}
