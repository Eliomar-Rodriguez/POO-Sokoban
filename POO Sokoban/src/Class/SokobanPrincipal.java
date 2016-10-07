package Class;


import Objetos.Vacio;
import java.util.ArrayList;

public class SokobanPrincipal {

    public static ArrayList<Persona> listaUsuarios;
    public static ArrayList<Nivel> listaNiveles;

    public SokobanPrincipal() {
        this.listaUsuarios = new ArrayList();
    }

    public ArrayList<Persona> getListaUsuarios() {
        return listaUsuarios;
    }
    
    public void setListaUsuarios(Persona u) {
        this.listaUsuarios.add(u);
    }
    
    public ArrayList<Nivel> getListaNiveles() {
        return listaNiveles;
    }
    
    public void setListaNiveles(Nivel n) {
        this.listaNiveles.add(n);
    }
     
    public void login() {
    }

    public void crearUsuario() {
    }

    public void borrarUsuario() {
    }

    public void buscarUsuario() {
    }

    public void ubicarPersonaje() {
    }

    public void agregarNiveles() {
    }

    public void nivelesPorAdministrador() {
    }


    public void eliminarAdministrador() {
    }

    public void addNivel() {
    }

    public void usuariosGanadaron() {
    }

    public void generalHistorialJuego() {
    }

    public void getNivelesMasRepetidos() {
    }

    public void nuevoRecord(int cantMov, int numNivel) {
    }

    public void obtenerListaGrupo() {
    }

    public void cantGanesOptimizados() {
    }

    public void obtenerMejorTiempo() {
    }

    public void mejorEnMovimientos() {
    }

    public void mostrar5UsuRecordsRotos() {
    }

    public void mostrar5UsuGanesOptimizados() {
    }

    public void mostrar5UsuInsistentesNivel() {
    }

    public void mostrarEstadisticaUsuario(String idUsu) {
    }

    public void actualizarHistorial() {
    }

    public void pasarNivel() {
    }
    
    public void crearCaja() {
    }
    
    public static void crearMatriz(int n) {
        Vacio vacio = new Vacio();
        Nivel nivel = new Nivel();
        
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                vacio.setX(x);
                vacio.setY(y);
                vacio.setTipo('v');
                //vacio.setBoton(); // falta ponerle la imagen al boton para que arranque con una imagen predeterminada
                nivel.matrizLogica[x][y]=vacio;
                                
            }
            
        }
    }
}
