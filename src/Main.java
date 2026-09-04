public class Main {
    public static void main(String[] args) {

        // ============ OBJETOS DE LA SUPERCLASE (Deportista) ============

        // Se usa el constructor de dos atributos porque en este caso se registra un
        // deportista genérico del que todavía se conoce solo el nombre y la edad.
        Deportista d1 = new Deportista("Roberto Carlos", 32);

        // Se usa el constructor de 4 parámetros porque ya se cuenta con
        // toda la información completa de este deportista.
        Deportista d2 = new Deportista("Ricardo Peña", 30, true, 78.5);


        // ============ OBJETOS DE LA SUBCLASE Futbolista ============

        // Se usa el constructor de 2 parámetros porque en este escenario
        // solo se conocen el nombre y la edad del jugador (recién fichado,
        // aún sin evaluación física ni posición asignada).
        Futbolista f1 = new Futbolista("Kevin Gómez", 23);

        // Se usa el constructor de 4 parámetros porque ya se conoce la
        // posición y los goles del jugador, además de nombre y edad.
        Futbolista f2 = new Futbolista("Andrés Ruiz", 27, "Defensa", 2);

        // Se usa el constructor de 8 parámetros (completo) porque se cuenta
        // con toda la información física y deportiva del jugador.
        Futbolista f3 = new Futbolista("Luis Torres", 24, true, 72.0, "Delantero", 15, 28.5, true);

// ============ OBJETOS DE LA SUBCLASE Tenista ============

        // Se usa el constructor de 2 parámetros porque de este tenista
        // solo se tienen el nombre y la edad al momento de registrarlo.
        Tenista t1 = new Tenista("Valentina Rojas", 24);

        // Se usa el constructor de 8 parámetros (completo) porque ya se
        // conocen todos los datos físicos y deportivos de la tenista.
        Tenista t2 = new Tenista("Camila Duarte", 26, true, 61.0, "Zurda", 15, 68.4, true);




}