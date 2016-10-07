package Class;

import Objetos.Objeto;

public class Nivel {

    private int cantMoves;

    private int idNivel;

    private int cantCajas;

    private int filas;

    private int columnas;

    private int filaPersonaje;

    private int columnaPersonaje;

    Objeto [][] matrizLogica = new Objeto [filas][columnas];    // ojo al tipo en caso de que de error con la matriz mas adelante

    private String idAdmin;

    private int cantPuntos;

    private int movisDuranteJuego;

    public Nivel(int cantMoves, int idNivel, int cantCajas, int filas, int columnas, int filaPersonaje, int columnaPersonaje, String idAdmin, int cantPuntos, int movisDuranteJuego) {
        this.matrizLogica = new Objeto[filas][columnas];
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

    public void generarMatriz() {
    }

   
}
