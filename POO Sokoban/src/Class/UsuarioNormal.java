package Class;

public class UsuarioNormal extends Persona {

    private int bestMoves;

    private int repeticiones;

    private int nivelActual;
    
    
    public UsuarioNormal(){
        super();
    }
    
    public UsuarioNormal(int bestMoves, int repeticiones, int nivelActual, String nombre, String cedula, String correo, String contra, String fechaRegistro, String foto, int tipoUsuario) {
        super(nombre, cedula, correo, contra, fechaRegistro, foto, tipoUsuario);
        this.bestMoves = bestMoves;
        this.repeticiones = repeticiones;
        this.nivelActual = nivelActual;
    }    

    public int getBestMoves() {
        return bestMoves;
    }

    public void setBestMoves(int bestMoves) {
        this.bestMoves = bestMoves;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public int getNivelActual() {
        return nivelActual;
    }

    public void setNivelActual(int nivelActual) {
        this.nivelActual = nivelActual;
    }
    
    public void jugar() {
    }

    public void crearGrupo() {
    }

    public void abandonarGrupo() {
    }

    public void pasarSigNivel() {
    }

    public void empujarCaja() {
    }

    public void seleccionarJugadores() {
    }

    public void seleciconarNiveles() {
    }
}
