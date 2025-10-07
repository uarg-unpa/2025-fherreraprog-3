public class ColaInt {
    // [Resto de la clase como antes]

    public int peek() {
        if (estaVacia()) return -1; // Asumimos validación externa, pero un check básico

        ColaInt auxiliar = new ColaInt(); // Estructura auxiliar
        int frente = desencolar(); // Extraemos el frente (altera la cola)

        // Guardamos el resto en auxiliar
        while (!estaVacia()) {
            auxiliar.encolar(desencolar());
        }

        // Restauramos la cola original
        encolar(frente); // Reinsertamos el frente primero
        while (!auxiliar.estaVacia()) {
            encolar(auxiliar.desencolar()); // Reinsertamos el resto
        }

        return frente; // Retornamos el valor peeked
    }
}