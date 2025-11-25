package tp2.compo;

import java.util.Scanner;

public class TestEquipoFutbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Se crean datos iniciales en la "UI"
        System.out.print("Ingrese el nombre del equipo: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el nombre del entrenador: ");
        String entrenador = sc.nextLine();

        EquipoFutbol equipo = new EquipoFutbol(nombre, entrenador);

        int opcion;
        do {
            System.out.println("\n=== MENU EQUIPO FUTBOL ===");
            System.out.println("1. Agregar jugador");
            System.out.println("2. Eliminar jugador (por posición)");
            System.out.println("3. Mostrar equipo");
            System.out.println("4. Cantidad de jugadores");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del jugador: ");
                    String jugador = sc.nextLine();
                    if (equipo.agregarJugador(jugador)) {
                        System.out.println("Jugador agregado.");
                    } else {
                        System.out.println("El equipo está completo.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese la posición del jugador a eliminar: ");
                    int pos = sc.nextInt();
                    if (equipo.eliminarJugador(pos)) {
                        System.out.println("Jugador eliminado.");
                    } else {
                        System.out.println("Posición inválida.");
                    }
                    break;
                case 3:
                    System.out.println(equipo);
                    break;
                case 4:
                    System.out.println("Cantidad de jugadores: " + equipo.getCantidadActual());
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

