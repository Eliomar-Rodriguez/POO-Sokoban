
package poo.sokoban;

import java.awt.*;
import javax.swing.*;

public class VentanaPrincipal extends javax.swing.JPanel {

    public VentanaPrincipal() {
        initComponents();
        this.setSize(1280,720);
    }
    public void paintComponent(Graphics g)
    {
        Dimension tam = getSize();
        ImageIcon ImageFondo = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/MainImage.jpg")).getImage());
        //ImagesIcon f = new ImagesIcon(new ImagesIcon(getClass().getResource("/Iconos/caja.png")).getImage())
        g.drawImage(ImageFondo.getImage(), 0,0 , 1280,720,null);
        setOpaque(false);  
        super.paintComponents(g);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
