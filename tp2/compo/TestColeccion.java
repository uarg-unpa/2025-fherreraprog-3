package tp2.compo;

import java.util.Scanner;

public class TestColeccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Coleccion coleccion = new Coleccion();
        int opcion;

        do {
            System.out.println("\n=== MENU COLECCION ===");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Mostrar colección");
            System.out.println("4. Cantidad de elementos");
            System.out.println("5. Vaciar colección");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número: ");
                    int num = sc.nextInt();
                    if (coleccion.agregarElemento(num)) {
                        System.out.println("Elemento agregado.");
                    } else {
                        System.out.println("La colección está llena.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el número a eliminar: ");
                    int eliminar = sc.nextInt();
                    if (coleccion.eliminarElemento(eliminar)) {
                        System.out.println("Elemento eliminado.");
                    } else {
                        System.out.println("No se encontró el elemento.");
                    }
                    break;
                case 3:
                    System.out.println(coleccion);
                    break;
                case 4:
                    System.out.println("Cantidad de elementos: " + coleccion.cantidadElementos());
                    break;
                case 5:
                    coleccion.vaciarColeccion();
                    System.out.println("Colección vaciada.");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}

