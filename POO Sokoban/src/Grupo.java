public class Grupo {

    private int cantidadJugadores;

    private int jugadores;
    
    public Grupo(int cantJug, int jug) {
    }

    public void setCantidadJugadores(int cJ) {
        this.cantidadJugadores = cJ ;
    }

    public int getCatidadJugadores() {
        return cantidadJugadores;
    }

    public int getJugadores() {
        return jugadores;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }
    
    public void registrarCierreGrupo() {
    }

    public void pasarSigNivelGrupo() {
    }

    public void registrarCierreGrupo1() {
    }

    public void agregarNivel() {
    }

    public void jugarGrupo() {
    }

    @Override
    public String toString() {
        return "Grupo{" + "cantidadJugadores=" + cantidadJugadores + ", jugadores=" + jugadores + '}';
    }
    
    
}
