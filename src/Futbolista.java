public class Futbolista extends Deportista {
    private String posicion;
    private int goles;
    private double velPromedio;
    private boolean esCapitan;

    public Futbolista(String nombre, int edad) {
        this(nombre, edad, true, 0.0, "Sin definir", 0, 0.0, false);
    }

    public Futbolista(String nombre, int edad, String posicion, int goles) {
        this(nombre, edad, true, 0.0, posicion, goles, 0.0, false);
    }


    public Futbolista(String nombre, int edad, boolean activo, double peso, String posicion, int goles, double velPromedio, boolean esCapitan){
        super(nombre, edad, activo, peso);
        this.posicion=posicion;
        this.goles=goles;
        this.velPromedio=velPromedio;
        this.esCapitan=esCapitan;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public double getVelPromedio() {
        return velPromedio;
    }

    public void setVelPromedio(double velPromedio) {
        this.velPromedio = velPromedio;
    }

    public boolean getEsCapitan() {
        return esCapitan;
    }

    public void setEsCapitan(boolean esCapitan) {
        this.esCapitan = esCapitan;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "nombre = " + getNombre() +
                ", edad = " + getEdad() +
                ", activo = " + getActivo() +
                ", peso = " + getPeso() +
                ", posicion = " + posicion +
                ", goles = " + goles +
                ", velPromedio = " + velPromedio +
                ", esCapitan = " + esCapitan +
                '}';
    }
}
