package tp4.gestionDeNombres;


import java.util.Scanner;

public class MainColaNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaNombres cola = new ColaNombres();
        int opcion;

        do {
            System.out.println("\n=== MENÚ COLA DE ESTUDIANTES ===");
            System.out.println("1. Encolar nombre (agregar estudiante)");
            System.out.println("2. Desencolar nombre del estudiante más antiguo");
            System.out.println("3. Ver nombre en frente (peek)");
            System.out.println("4. Mostrar estado (vacía, llena o aproximada)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = sc.nextLine();
                    String 
                    if (cola.estaLlena()) {
                        System.out.println("Error: La cola está llena (máximo 9 estudiantes).");
                    } else {
                        cola.encolar(nombre);
                        System.out.println("Nombre '" + nombre + "' encolado con éxito.");
                    }
                    break;
                case 2:
                    if (cola.estaVacia()) {
                        System.out.println("Error: La cola está vacía. No se puede desencolar.");
                    } else {
                        String desencolado = cola.desencolar();
                        System.out.println("Nombre desencolado: '" + desencolado + "'");
                    }
                    break;
                case 3:
                    if (cola.estaVacia()) {
                        System.out.println("Error: La cola está vacía. No hay nombre en el frente.");
                    } else {
                        String frente = cola.peek();
                        System.out.println("Nombre en frente: '" + frente + "'");
                    }
                    break;
                case 4:
                    if (cola.estaVacia()) {
                        System.out.println("Estado: La cola está vacía.");
                    } else if (cola.estaLlena()) {
                        System.out.println("Estado: La cola está llena.");
                    } //else {
                       // System.out.println("Estado: La cola tiene aproximadamente " + (cola.estaLlena() ? 9 : (cola.fin - cola.frente + (cola.fin < cola.frente ? 10 : 0)) % 10) + " estudiante(s).");
                    //}
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
