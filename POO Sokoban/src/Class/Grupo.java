package Class;


import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Grupo {

    private int cantidadJugadores;
    
    private ArrayList<Grupo> listaJugadores;

    public Grupo(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
        this.listaJugadores = new ArrayList();
    }
   

    public void setCantidadJugadores(int cJ) {
        this.cantidadJugadores = cJ ;
    }

    public int getCatidadJugadores() {
        return cantidadJugadores;
    }

    public ArrayList<Grupo> getListaJugadores() {
        return listaJugadores;
    }
    

    public void setListaJugadores(Grupo j) {
        if ((listaJugadores.size()>=2)&&(listaJugadores.size()<=4))
            this.listaJugadores.add(j);
        else
        {
            JOptionPane.showMessageDialog(null,"El minimo de usuarios para crear un grupo es 2 y el maximo es 4.");            
        }
        
    }

    
    public void registrarCierreGrupo() {
    }

    public void pasarSigNivelGrupo() {
    }

    public void registrarCierreGrupo1() {
    }

    public void agregarNivel() {
    }

    public void jugarGrupo() {
    }

    @Override
    public String toString() {
        return "Grupo{" + "cantidadJugadores=" + cantidadJugadores + ", listaJugadores=" + listaJugadores + '}';
    }

   
    
    
}
