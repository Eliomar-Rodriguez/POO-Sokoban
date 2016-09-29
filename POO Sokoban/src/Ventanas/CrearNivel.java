
package Ventanas;


public class CrearNivel extends javax.swing.JFrame {


    public CrearNivel() {
        initComponents();
        
        //
        setResizable(false);    // no poder cambiar tamano a la ventana
        setSize(1280,720);      // tamano
        setLocationRelativeTo(null);    // posicionar ventana en centro
        setTitle("Crear Niveles Sokoban");   // poner titulo a ventana
        //
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBotons/mario.gif"))); // NOI18N
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 160, 50, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBotons/mariobros.gif"))); // NOI18N
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 10, 50, 60);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBotons/supermario.gif"))); // NOI18N
        getContentPane().add(jButton3);
        jButton3.setBounds(30, 80, 49, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearNivel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
