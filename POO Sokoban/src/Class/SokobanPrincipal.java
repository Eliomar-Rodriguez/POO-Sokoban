package Class;


import java.util.ArrayList;

public class SokobanPrincipal {

    public static ArrayList<Persona> listaUsuarios;
    public static ArrayList<Nivel> listaNiveles;
    public static ArrayList<Historial> listaHistorial;
    public static ArrayList<Estadisticas> listaEstadisticas;
   

    public SokobanPrincipal() {
        this.listaUsuarios = new ArrayList();
        this.listaNiveles = new ArrayList();
        this.listaHistorial = new ArrayList();
        this.listaEstadisticas = new ArrayList();
       
    }

   
    

    public ArrayList<Estadisticas> getListaEstadisticas() {
        return listaEstadisticas;
    }

    public  void setListaEstadisticas(Estadisticas e) {
        this.listaEstadisticas.add(e);
    }
    
    

    public ArrayList<Historial> getListaHistorial() {
        return listaHistorial;
    }
    
    public void setListaHistorial(Historial h) {
        this.listaHistorial.add(h);
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
    
    public void setlistaNiveles(Nivel n) {
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
    
}
