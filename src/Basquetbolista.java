public class Basquetbolista extends Deportista {
    private String posicion;
    private int numeroCamiseta;
    private double estatura;
    private boolean esTitular;

    public Basquetbolista(String nombre, int edad) {
        this(nombre, edad, true, 0.0, "Base", 0, 0.0, false);
    }

    public Basquetbolista(String nombre, int edad, String posicion, int numeroCamiseta) {
        this(nombre, edad, true, 0.0, posicion, numeroCamiseta, 0.0, false);
    }

    public Basquetbolista(String nombre, int edad, boolean activo, double peso, String posicion, int numeroCamiseta, double estatura, boolean esTitular) {
        super(nombre, edad, activo, peso);
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
        this.estatura = estatura;
        this.esTitular = esTitular;
    }
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public boolean getEsTitular() {
        return esTitular;
    }

    public void setEsTitular(boolean esTitular) {
        this.esTitular = esTitular;
    }

    @Override
    public String toString() {
        return "Basquetbolista{" +
                "nombre = " + getNombre() +
                ", edad = " + getEdad() +
                ", activo = " + getActivo() +
                ", peso = " + getPeso() +
                ", posicion = " + posicion +
                ", numeroCamiseta = " + numeroCamiseta +
                ", estatura = " + estatura +
                ", esTitular = " + esTitular +
                '}';
    }
}
