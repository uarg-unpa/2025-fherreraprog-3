package tp2.actividad;

import java.util.Scanner;

public class Vehiculo {
    private String marca;
    private String modelo;
    private Motor motor;

    // Constructor completo
    public Vehiculo(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    // Método esPotente (condición definida por el grupo: cilindrada > 1500)
    public boolean esPotente() {
        return motor.getCilindrada() > 1500;
    }

    // Método actualizarTipoMotor
    public void actualizarTipoMotor(String nuevoTipo) {
        motor.setTipo(nuevoTipo);
    }

    // Método calcularConsumo (ejemplo: consumo estimado en L/100km basado en cilindrada)
    public double calcularConsumo() {
        return motor.getCilindrada() * 0.0005; // Ejemplo simple: 0.0005 L/100km por unidad de cilindrada
    }

    // toString
    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + "]";
    }

    // Main para pruebas
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear el primer vehículo leyendo datos con Scanner
        System.out.println("Ingrese marca del primer vehículo:");
        String marca1 = scanner.nextLine();
        System.out.println("Ingrese modelo del primer vehículo:");
        String modelo1 = scanner.nextLine();
        System.out.println("Ingrese cilindrada del motor:");
        int cilindrada1 = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        System.out.println("Ingrese tipo de motor:");
        String tipo1 = scanner.nextLine();
        Motor motor1 = new Motor(cilindrada1, tipo1);
        Vehiculo vehiculo1 = new Vehiculo(marca1, modelo1, motor1);

        // Crear el segundo vehículo con datos fijos
        Motor motor2 = new Motor(1800, "Diésel");
        Vehiculo vehiculo2 = new Vehiculo("Toyota", "Corolla", motor2);

        // Invocar métodos
        System.out.println("\nInformación del vehículo 1: " + vehiculo1);
        System.out.println("¿Es potente? " + vehiculo1.esPotente());
        vehiculo1.actualizarTipoMotor("Eléctrico");
        System.out.println("Después de actualizar tipo: " + vehiculo1);
        System.out.println("Consumo estimado: " + vehiculo1.calcularConsumo() + " L/100km");

        System.out.println("\nInformación del vehículo 2: " + vehiculo2);
        System.out.println("¿Es potente? " + vehiculo2.esPotente());
        vehiculo2.actualizarTipoMotor("Híbrido");
        System.out.println("Después de actualizar tipo: " + vehiculo2);
        System.out.println("Consumo estimado: " + vehiculo2.calcularConsumo() + " L/100km");

        scanner.close();
    }
}
