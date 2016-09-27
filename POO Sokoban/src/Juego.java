public class Juego {

    private int cantMoves;

    private String tiempo;

    private String estadoActual;

    private int regresar;

    private int ultimaCaja;

    public Juego(int cantMoves, String tiempo, String estadoActual, int regresar, int ultimaCaja) {
        this.cantMoves = cantMoves;
        this.tiempo = tiempo;
        this.estadoActual = estadoActual;
        this.regresar = regresar;
        this.ultimaCaja = ultimaCaja;
    }

    
    public void setEstado_actual(String eAct) {
        this.estadoActual = eAct;
    }

    public String getEstado_actual() {
        return estadoActual;
    }

    public void setCantidad_moves(int cMoves) {
        this.cantMoves = cMoves;
    }

    public int getCantidad_moves() {
        return cantMoves;
    }

    public void setTiempo(String t) {
       this.tiempo = t;
    }

    public String getTiempo() {
       return tiempo;
    }

    public void guardar() {
    }

    public void salir() {
    }

    public void estadoActual() {
    }

    public void verificarMoves() {
    }

    public void mover() {
    }

    public void cambiarBestMoves() {
    }

    public void continuarJuego() {
    }

    public void deshacerJugada() {
    }

    @Override
    public String toString() {
        return "Juego{" + "cantMoves=" + cantMoves + ", tiempo=" + tiempo + ", estadoActual=" + estadoActual + ", regresar=" + regresar + ", ultimaCaja=" + ultimaCaja + '}';
    }
    
    
}
