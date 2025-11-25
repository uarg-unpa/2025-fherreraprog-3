package tp2;

public class Drone {
    private String modelo;
    private int alturaMaxima;
    private int nivelBateria;
    private double pesoMaximo;

    public Drone(String modelo, int alturaMaxima, int nivelBateria, double pesoMaximo) {
        this.modelo = (modelo != null && !modelo.trim().isEmpty()) ? modelo : "";
        this.alturaMaxima = (alturaMaxima > 0) ? alturaMaxima : 0;
        this.nivelBateria = (nivelBateria >= 0 && nivelBateria <= 100) ? nivelBateria : 0;
        this.pesoMaximo = (pesoMaximo > 0) ? pesoMaximo : 0.0;
    }

    public boolean puedeDespegar() {
        return nivelBateria > 20;
    }

    public int calcularViajesPosibles(double pesoActual) {
        if (pesoActual > 0 && pesoMaximo > 0) {
            return (int) (pesoMaximo / pesoActual);
        }
        return 0;
    }

    public String toString() {
        return "Drone " + modelo + ", Altura Máx " + alturaMaxima + "m, Batería " + nivelBateria + "%, Peso Máx " + pesoMaximo + "kg";
    }
}
