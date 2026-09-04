public class Main {
    public static void main(String[] args) {

        // ============ OBJETOS DE LA SUPERCLASE (Deportista) ============

        // Se usa el constructor de dos atributos porque en este caso se registra un
        // deportista genérico del que todavía se conoce solo el nombre y la edad.
        Deportista d1 = new Deportista("Roberto Carlos", 32);

        // Se usa el constructor de 4 parámetros porque ya se cuenta con
        // toda la información completa de este deportista.
        Deportista d2 = new Deportista("Ricardo Peña", 30, true, 78.5);



}