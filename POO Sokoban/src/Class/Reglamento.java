package Class;

public class Reglamento {

    private int moviAnterior;

    private int cajasPorMover;

    public Reglamento(int moviAnterior, int cajasPorMover) {
        this.moviAnterior = moviAnterior;
        this.cajasPorMover = cajasPorMover;
    }

    public Reglamento() {
    }
    
    

    public int getMoviAnterior() {
        return moviAnterior;
    }

    public void setMoviAnterior(int moviAnterior) {
        this.moviAnterior = moviAnterior;
    }

    public int getCajasPorMover() {
        return cajasPorMover;
    }

    public void setCajasPorMover(int cajasPorMover) {
        this.cajasPorMover = cajasPorMover;
    }

    public void deshacer() {
    }

    public void cambiarReglas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
