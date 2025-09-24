package tp3;

public class Historial {
    private String[] paginas;
    private int cima;
    private final int MAX = 5;

    public Historial() {
        paginas = new String[MAX];
        cima = -1;
    }

    public boolean estaVacia() { 
        if (cima == -1)
            return true;
        return false;
     }
    public boolean estaLlena() { return cima == MAX - 1; }
    public void meter(String pagina) {
        cima++;    
        paginas[cima] = pagina;
    }
    public String sacar() {
            return paginas[cima--];
    }

    public String toString() {
    if (estaVacia()) return "Historial vacío";
    String s = "Historial: ";
    for (int i = 0; i <= cima; i++) s += paginas[i] + " ";
        return s.trim();
    }
}
  
