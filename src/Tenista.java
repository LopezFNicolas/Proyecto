public class Tenista extends Deportista {
    private String manoHabil;
    private int rankingATP;
    private double porcentajeSaquesGanados;
    private boolean juegaDobles;

    public Tenista(String nombre, int edad) {
        this(nombre, edad, true, 0.0, "Diestra", 0, 0.0, false);
    }

    public Tenista(String nombre, int edad, String manoHabil, int rankingATP) {
        this(nombre, edad, true, 0.0, manoHabil, rankingATP, 0.0, false);
    }

    public Tenista(String nombre, int edad, boolean activo, double peso, String manoHabil, int rankingATP, double porcentajeSaquesGanados, boolean juegaDobles) {
        super(nombre, edad, activo, peso);
        this.manoHabil = manoHabil;
        this.rankingATP = rankingATP;
        this.porcentajeSaquesGanados = porcentajeSaquesGanados;
        this.juegaDobles = juegaDobles;
    }

    public String getManoHabil() {
        return manoHabil;
    }

    public void setManoHabil(String manoHabil) {
        this.manoHabil = manoHabil;
    }

    public int getRankingATP() {
        return rankingATP;
    }

    public void setRankingATP(int rankingATP) {
        this.rankingATP = rankingATP;
    }

    public double getPorcentajeSaquesGanados() {
        return porcentajeSaquesGanados;
    }

    public void setPorcentajeSaquesGanados(double porcentajeSaquesGanados) {
        this.porcentajeSaquesGanados = porcentajeSaquesGanados;
    }

    public boolean getJuegaDobles() {
        return juegaDobles;
    }

    public void setJuegaDobles(boolean juegaDobles) {
        this.juegaDobles = juegaDobles;
    }
}