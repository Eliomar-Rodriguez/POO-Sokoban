public class Administrador extends Persona {

    private String nacionalidad;

    private int nivelesAgregados;

    private int bestMoves;

    public Administrador(String nacionalidad, int nivelesAgregados, int bestMoves, String n, String id, String cor, String contra, String fechaReg, String foto) {
        super(n, id, cor, contra, fechaReg, foto);
        this.nacionalidad = nacionalidad;
        this.nivelesAgregados = nivelesAgregados;
        this.bestMoves = bestMoves;
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
