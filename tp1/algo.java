package tp1;
import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, numero3;

        System.out.print("Ingresa el primer número: ");
        numero1 = entrada.nextInt();
        System.out.print("Ingresa el segundo número: ");
        numero2 = entrada.nextInt();
        System.out.print("Ingresa el tercer número: ");
        numero3 = entrada.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El mayor es: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El mayor es: " + numero2);
        } else {
            System.out.println("El mayor es: " + numero3);
        }

        entrada.close();
    }
}