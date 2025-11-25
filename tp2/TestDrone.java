package tp2;

public class TestDrone {
    public static void main(String[] args) {
        Drone d1 = new Drone("DJI Mini", 500, 80, 2.0);
        Drone d2 = new Drone("Parrot", 300, 15, 1.5);
        System.out.println(d1 + ", ¿Puede despegar? " + d1.puedeDespegar() + 
                          ", Viajes posibles: " + d1.calcularViajesPosibles(0.5));
        System.out.println(d2 + ", ¿Puede despegar? " + d2.puedeDespegar());
    }
}
