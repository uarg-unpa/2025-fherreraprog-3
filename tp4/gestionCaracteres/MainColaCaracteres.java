package tp4.gestionCaracteres;

import java.util.Scanner;

public class MainColaCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaCaracteres cola = new ColaCaracteres();
        int opcion;

        do {
            System.out.println("\n=== MENÚ COLA DE COMANDOS DE TECLADO ===");
            System.out.println("1. Encolar comando (agregar carácter)");
            System.out.println("2. Desencolar comando más antiguo");
            System.out.println("3. Ver comando en frente (peek)");
            System.out.println("4. Mostrar estado (vacía, llena o cantidad)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el comando (carácter): ");
                    char comando = sc.next().charAt(0);
                    if (cola.estaLlena()) {
                        System.out.println("Error: La cola está llena (máximo 10 comandos).");
                    } else {
                        cola.encolar(comando);
                        System.out.println("Comando '" + comando + "' encolado con éxito.");
                    }
                    break;
                case 2:
                    if (cola.estaVacia()) {
                        System.out.println("Error: La cola está vacía. No se puede desencolar.");
                    } else {
                        char desencolado = cola.desencolar();
                        System.out.println("Comando desencolado: '" + desencolado + "'");
                    }
                    break;
                case 3:
                    if (cola.estaVacia()) {
                        System.out.println("Error: La cola está vacía. No hay comando en el frente.");
                    } else {
                        char frente = cola.peek();
                        System.out.println("Comando en frente: '" + frente + "'");
                    }
                    break;
                case 4:
                    if (cola.estaVacia()) {
                        System.out.println("Estado: La cola está vacía.");
                    } else if (cola.estaLlena()) {
                        System.out.println("Estado: La cola está llena.");
                    } else {
                        System.out.println("Estado: La cola tiene " + cola.getFin() + " comando(s).");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
