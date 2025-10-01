package tp3;
public class PilaEnteros {
    private int[] elementos; // Array para almacenar los elementos
    private int cima;       // Índice del último elemento insertado (-1 si vacía)
    private final int MAX = 10; // Capacidad máxima de la pila

    // Constructor: inicializa el array y la cima
    public PilaEnteros() {
        elementos = new int[MAX];
        cima = -1;
    }

    // Verifica si la pila está vacía
    public boolean estaVacia() {
        return cima == -1;
    }

    // Verifica si la pila está llena
    public boolean estaLlena() {
        return cima == MAX - 1;
    }

    // Agrega un elemento en la cima (push)
    public void meter(int elem) {
 
            cima++;
            elementos[cima] = elem;
        
    }

    // Saca y devuelve el elemento de la cima (pop)
    public int sacar() {
      
            int aux = elementos[cima];
            cima--;
            return aux;
        }

}