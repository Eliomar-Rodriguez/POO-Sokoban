package Class;


public class Nivel {

    private int cantMoves;
    
    private int idNivel;
    
    private int cantCajas;

    private int filas;

    private int columnas;

    private int filaPersonaje;

    private int columnaPersonaje;

    int [][] matrizLogica = new int [filas][columnas];    // ojo al tipo en caso de que de error con la matriz mas adelante

    private String idAdmin;

    private int cantPuntos;

    private int movisDuranteJuego;
    
    private SokobanPrincipal soko = null;
    private int[][] matriz;

    public Nivel(int cantMoves, int idNivel, int cantCajas, int filas, int columnas, int filaPersonaje, int columnaPersonaje, String idAdmin, int cantPuntos, int movisDuranteJuego) {
        this.cantMoves = cantMoves;
        this.idNivel = idNivel;
        this.cantCajas = cantCajas;
        this.filas = filas;
        this.columnas = columnas;
        this.filaPersonaje = filaPersonaje;
        this.columnaPersonaje = columnaPersonaje;
        this.idAdmin = idAdmin;
        this.cantPuntos = cantPuntos;
        this.movisDuranteJuego = movisDuranteJuego;
    }

    public int[][] getMatrizLogica() {
        return matrizLogica;
    }

    public void setMatrizLogica(int[][] matrizLogica) {
        this.matrizLogica = matrizLogica;
    }

    public SokobanPrincipal getSoko() {
        return soko;
    }

    public void setSoko(SokobanPrincipal soko) {
        this.soko = soko;
    }


    public Nivel() {
        
    }

    public int getCantMoves() {
        return cantMoves;
    }

    public void setCantMoves(int cantMoves) {
        this.cantMoves = cantMoves;
    }

    public int getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(int idNivel) {
        this.idNivel = idNivel;
    }

    public int getCantCajas() {
        return cantCajas;
    }

    public void setCantCajas(int cantCajas) {
        this.cantCajas = cantCajas;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getFilaPersonaje() {
        return filaPersonaje;
    }

    public void setFilaPersonaje(int filaPersonaje) {
        this.filaPersonaje = filaPersonaje;
    }

    public int getColumnaPersonaje() {
        return columnaPersonaje;
    }

    public void setColumnaPersonaje(int columnaPersonaje) {
        this.columnaPersonaje = columnaPersonaje;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public int getCantPuntos() {
        return cantPuntos;
    }

    public void setCantPuntos(int cantPuntos) {
        this.cantPuntos = cantPuntos;
    }

    public int getMovisDuranteJuego() {
        return movisDuranteJuego;
    }

    public void setMovisDuranteJuego(int movisDuranteJuego) {
        this.movisDuranteJuego = movisDuranteJuego;
    }
    

    
    
    public void estadoInicial() {
    }

    public void reiniciar() {
    }


    public void determinarGane() {
    }

    public void determinarJuegoBloqueado() {
    }

    public void repetirNivel() {
    }

    public void pasarSigNivelSuperacion() {
    }

    public void crearPared(int x, int y) {
    }

    public void ubicarPersonaje(int x, int y) {
    }

    public void validarMatriz() {
    }

    public int[][] crearMatriz(int n) {
        Nivel nivel = new Nivel();
        int [][] matriz = new int [n][n];
        
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                matriz[x][y]=0;  
            }  
        }
        return matriz;
        
        
    }

    @Override
    public String toString() {
        return "Nivel{" + "cantMoves=" + cantMoves + ", idNivel=" + idNivel + ", cantCajas=" + cantCajas + ", filas=" + filas + ", columnas=" + columnas + ", filaPersonaje=" + filaPersonaje + ", columnaPersonaje=" + columnaPersonaje + ", matrizLogica=" + matrizLogica + ", idAdmin=" + idAdmin + ", cantPuntos=" + cantPuntos + ", movisDuranteJuego=" + movisDuranteJuego + '}';
    }
    
    
   
}
