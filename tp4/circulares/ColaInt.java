package tp4.circulares;

public class ColaInt {
    private int[] elementos;
    private int frente;
    private int fin;
    private int cantidad;
    private final int MAX = 10;

    public ColaInt() {
        elementos = new int[MAX];
        frente = 0;
        fin = 0;
        cantidad = 0;
    }

    public boolean estaVacia() {
        return cantidad == 0;
    }

    public boolean estaLlena() {
        return cantidad == MAX;
    }

    public void encolar(int elem) {
        
            elementos[fin] = elem;
            fin = (fin + 1) % MAX;
            cantidad++;
        
    }

    public int desencolar() {
      
            int aux = elementos[frente];
            frente = (frente + 1) % MAX;
            cantidad--;
            return aux;
        
    }

    public int getCantidad() {
        return cantidad;
    }

    public int peek() {
        return elementos[frente];
    }


}
