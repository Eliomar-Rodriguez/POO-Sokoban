package Class;

public class Historial {

    private int yourMoves;

    private String estado;

    private String tiempo;
    
    public Historial(int yourMoves, String estado, String tiempo) {
        this.yourMoves = yourMoves;
        this.estado = estado;
        this.tiempo = tiempo;
    }

    public Historial() {
    } 

    public void setYourMoves(int yMoves) {
        this.yourMoves = yMoves;
    }

    public int getYourMoves() {
        return yourMoves;
    }

    public void setEstado(String e) {
       this.estado = e;
    }

    public String getEstado() {
        return estado;
    }

    public void setTiempo(String t) {
        this.tiempo = t;
    }
    
    public String getTiempo() {
       return tiempo;
    }

    public void mostrarHistorialUsuario() {
    }

    public void reemplazarHistotial() {
    }

    public void generalHistorial() {
    }

    @Override
    public String toString() {
        return "Historial{" + "yourMoves=" + yourMoves + ", estado=" + estado + ", tiempo=" + tiempo + '}';
    }
    
    
}
