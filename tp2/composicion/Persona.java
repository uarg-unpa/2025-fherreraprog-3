package tp2.composicion;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;
    private Domicilio domicilio; 
    
    
    public Persona(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
        this.domicilio = new Domicilio("", 0); // Inicializa el objeto complejo con valores por defecto
    }

    // Constructor completo
    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura, Domicilio domicilio) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }

        if (edad >= 0) {
            this.edad = edad;
        }

        if (dni != null && !dni.trim().isEmpty()) {
            this.dni = dni;
        }

        if (comprobarSexo(sexo)) {
            this.sexo = sexo;
        }

        if (peso >= 0) {
            this.peso = peso;
        }

        if (altura >= 0) {
            this.altura = altura;
        }

        this.domicilio = domicilio; // Asigna el objeto complejo
    }

    // Método esMayorDeEdad
    public boolean esMayorDeEdad() {
        if (edad >= 18)
            return true;
        else    
            return false; //avanzado pero lo dejo para que sus cerebros se activen 
    }

    // Método privado para validar sexo
    private boolean comprobarSexo(char sexo) {
         if (sexo == 'H' || sexo == 'M')
            return true;
         else
            return false;

    }

    // toString
    
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + dni +
               ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + ", domicilio=" + domicilio + "]";
    }

   
    public String infoDomicilio() {
        return "Domicilio de " + nombre + ": " + domicilio + ". ¿Completo? " + domicilio.esCompleto();
    }

    // Método que compara si dos domicilios tienen la misma calle
    public boolean vivenEnLaMismaCalle(Domicilio otroDomicilio) {
    // Obtenemos la calle del domicilio de la persona (this.domicilio)
    String callePersona = this.domicilio.getCalle();

    // Obtenemos la calle del domicilio que recibimos como parámetro
    String calleOtraPersona = otroDomicilio.getCalle();

    // Comparamos si las dos calles son iguales
    if (callePersona.equals(calleOtraPersona)) {
        // Si son iguales, significa que viven en la misma calle
        return true;
    } else {
        // Si no son iguales, viven en calles distintas
        return false;
    }
}

}