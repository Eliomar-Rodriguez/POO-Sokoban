
package Class;

import java.awt.Button;
import java.awt.Color;

public class Objeto {
    public Button b = new Button();
    public int x,y;
    

    public Objeto() {
    }

    public Objeto(int x, int y) {
        this.x = x;
        this.y = y;
        b.setBounds(x, y, 58, 58);
    }

    public Button getB() {
        return b;
    }

    public void setB(Button b) {
        this.b = b;
    }
    public void setCaja(){
        b.setBackground(Color.MAGENTA);
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
    
    
    
}
