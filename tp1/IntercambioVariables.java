package tp1;

public class IntercambioVariables {
    public static void main(String[] args) {
        int primerValor = 1, segundoValor = 2, tercerValor = 3, auxiliar;

        System.out.println("Antes: primerValor = " + primerValor + 
                           ", segundoValor = " + segundoValor + 
                           ", tercerValor = " + tercerValor);

        auxiliar = primerValor;    
        segundoValor = auxiliar;   
        tercerValor = auxiliar;    
        primerValor = tercerValor; 

        System.out.println("Después: primerValor = " + primerValor + 
                           ", segundoValor = " + segundoValor + 
                           ", tercerValor = " + tercerValor);
    }
}
