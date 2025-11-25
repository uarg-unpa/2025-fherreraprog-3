package tp5;

public class Recursividad {
  
  public static void main (String args[]){

  //System.out.println(puzzle(4,7));
  //System.out.println(concurso(0,3);
   // System.out.println(factorial(4));
   int [] a={1,2,3,4,5};
    System.out.println(ocurrencias(a,5,0));
  }

  public static int puzzle(int base, int limite){
    if (base > limite){
      return -1;
    } 
    else {
      if (base == limite){
        return 1;
      }
      else
        return (base * puzzle(base + 1, limite));
    }
  }

  public static int concurso(int base, int limite){
    if(base == limite)
      return 1;
    else
      if (base > limite)
        return 0;
      else
        return (base + concurso(base + 1, limite));

  }

  public static int potencia(int m, int n){
    if (n == 0)
      return 1;
    else
      return (m * potencia(m, n - 1));
  }

  public static int factorial (int n){
    if (n > 0)
      return (n * factorial(n - 1));
    else
      if (n==0)
        return 1;
      else
        return -1;
  }

  public static int suma (int n){
    if (n==1)
      return 1;
    else
      return (n + suma(n - 1));

  }

  public static int sumaPares(int n){
    if (n <= 0)
      return 0;
    else
      if (n % 2 == 0)
        return (n + sumaPares(n - 1));
      else
        return sumaPares(n - 1);
  }

  public static int funcionG(int x, int y){
    if (x <= y )
      return 1;
    else
      return 1+funcionG(x, y + 1);
  }

  public static int cuentaVocales(String cadena){
    if (cadena.length() == 0)
      return 0;
    else {
      char primeraLetra = cadena.charAt(0);
      if (primeraLetra == 'a' || primeraLetra == 'e' || primeraLetra == 'i' || primeraLetra == 'o' || primeraLetra == 'u' ||
          primeraLetra == 'A' || primeraLetra == 'E' || primeraLetra == 'I' || primeraLetra == 'O' || primeraLetra == 'U')
        return 1 + cuentaVocales(cadena.substring(1););
      else
        return cuentaVocales(cadena.substring(1););
    }
  }

  public static int sumaPrimeros(int n){
    if (n ==0)
      return 0;
    else
      return n + sumaPrimeros(n - 1);
  }

  public static boolean presente(int[] arr, int n, int indice){
    if (indice >= arr.length)
      return false;
    else
      if (arr[indice] == n)
        return true;
      else
        return presente(arr, n, indice + 1);
  }

  public static int valorMinimo(int[] arr, int indice){
    if (indice == arr.length - 1)
      return arr[indice];
    else {
      int minResto = valorMinimo(arr, indice + 1);
      if (arr[indice] < minResto)
        return arr[indice];
      else
        return minResto;
    }
  }

  public static int ocurrencias(int[] arr, int n, int indice){
    if (indice >= arr.length)
      return 0;
    else {
      if (arr[indice] == n)
        return 1 + ocurrencias(arr, n, indice + 1);
      else
        return ocurrencias(arr, n, indice + 1);
    }
  }
}
