
package Objetos;

import java.awt.Button;
import java.awt.Label;

public class Objeto {
    int x,y;
    Button boton = new Button();
    char tipo;

    public Objeto(int x, int y, Button boton,char t) {
        this.x = x;
        this.y = y;
        this.boton = boton;
        this.tipo = t;
    }

    public Objeto() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Button getBoton() {
        return boton;
    }

    public void setBoton(Button boton) {
        this.boton = boton;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    
}
