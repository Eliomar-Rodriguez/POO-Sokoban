package Class;

public class Administrador extends Persona {

    private String nacionalidad;

    private int nivelesAgregados;

    private int bestMoves;

    public Administrador(String nombre, String cedula, String correo, String contra, String fechaRegistro, String foto, int tipoUsuario) {
        super(nombre, cedula, correo, contra, fechaRegistro, foto, tipoUsuario);
    }
    
    public Administrador(String nacionalidad, int nivelesAgregados, int bestMoves, String nombre, String cedula, String correo, String contra, String fechaRegistro, String foto, int tipoUsuario) {
        super(nombre, cedula, correo, contra, fechaRegistro, foto, tipoUsuario);
        this.nacionalidad = nacionalidad;
        this.nivelesAgregados = nivelesAgregados;
        this.bestMoves = bestMoves;
    }

    public Administrador() {
        super();
    }
    
    public void setNacionalidad(String nac) {
        this.nacionalidad = nac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNivelesAgregados(int nAdd) {
        this.nivelesAgregados = nAdd;
    }

    public int getNivelesAgregados() {
        return nivelesAgregados;
    }

    public void setBestMoves(int bMoves) {
        this.bestMoves = bMoves;
    }

    public int getBestMoves() {
        return bestMoves;
    }

    public void cambiarOrdenNivel() {
    }

    public void imprimirNivelesAdministrador() {
    }

    public void cambiarNivelesOptimizados() {
    }

    public void crearCaja() {
    }

    public void crearMatriz() {
    }

    public void crearPuntos() {
    }

    public void cambiarAsignacionNivel() {
    }
}
