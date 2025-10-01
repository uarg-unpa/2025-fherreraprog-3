import java.util.Scanner;

public class EjemploScanner03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Ingresa un número entero: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Ingresa solo un número entero válido. Intenta de nuevo.");
            scanner.next(); // Limpia la entrada inválida
            System.out.print("Ingresa un número entero positivo: ");
        }
        numero = scanner.nextInt();

        System.out.println("¡Número válido ingresado! El número es: " + numero);
        scanner.close();
    }
}