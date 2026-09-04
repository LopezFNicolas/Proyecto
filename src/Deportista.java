public class Deportista {
    private String nombre;
    private int edad;
    private boolean activo;
    private double peso;

//constructores
    public Deportista() {
        this.("Desconocido");
    }

    public Deportista(String nombre, int edad, boolean activo, double peso){
        this.nombre=nombre;
        this.edad=edad;
        this.activo=activo;
        this.peso=peso;
    }


///////getters y setters//////////
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/////////////
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    ////////////
    public boolean getActivo() {
           return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    ///
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}