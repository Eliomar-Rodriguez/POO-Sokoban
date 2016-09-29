package Class;

public class Estadisticas {

    private int juegos_jugados;

    private int juegos_ganados;

    private int juegos_perdidos;

    private int tiempo_consumido;

    public Estadisticas(int juegos_jugados, int juegos_ganados, int juegos_perdidos, int tiempo_consumido) {
        this.juegos_jugados = juegos_jugados;
        this.juegos_ganados = juegos_ganados;
        this.juegos_perdidos = juegos_perdidos;
        this.tiempo_consumido = tiempo_consumido;
    }

    @Override
    public String toString() {
        return "Estadisticas{" + "juegos_jugados=" + juegos_jugados + ", juegos_ganados=" + juegos_ganados + ", juegos_perdidos=" + juegos_perdidos + ", tiempo_consumido=" + tiempo_consumido + '}';
    }
    
    public Estadisticas(String j, int jJug, int jGan, int jPer) {
    }

    public void setJuegos_jugados(int jJ) {
        this.juegos_jugados = jJ;
    }

    public int getJuegos_jugados() {
        return juegos_jugados;
    }

    public void setJuegos_ganados(int jG) {
        this.juegos_ganados = jG;
    }

    public int getJuegos_ganados() {
        return juegos_ganados;
    }

    public void setJuegos_perdidos(int jP) {
        this.juegos_perdidos = jP;
    }

    public int getJuegos_perdidos() {
        return juegos_perdidos;
    }

    public int getTiempo_consumido() {
        return tiempo_consumido;
    }

    public void setTiempo_consumido(int tiempo_consumido) {
        this.tiempo_consumido = tiempo_consumido;
    }
    
    public void mostrarEstadisticaUsuario() {
    }

    public void generarEstadisticas() {
    }

    public void calcularDifeYmovesBestMoves() {
    }

    public void obtenerUsuSuperanNivelX(int idNivel) {
    }

    
}
