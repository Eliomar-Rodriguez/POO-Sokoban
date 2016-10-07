/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

/**
 *
 * @author Antonio Rodriguez
 */
public class CrearGrupo extends javax.swing.JFrame {

    /**
     * Creates new form CrearGrupo
     */
    public CrearGrupo() {
        initComponents();
        lstJugadores.setVisible(false);
        setResizable(false);
        setLocationRelativeTo(null);    // posicionar ventana en centro
        setTitle("Crear grupo");   // poner titulo a ventana
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombregrupo = new javax.swing.JTextField();
        txtJugadores = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdJug = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstJugadores = new javax.swing.JList<>();
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear grupo");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(64, 34, 0, 0);

        jLabel4.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel4.setText("Nombre del  grupo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(300, 170, 380, 40);

        jLabel5.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel5.setText("cantidad de jugadores");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(300, 220, 380, 40);

        txtNombregrupo.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        getContentPane().add(txtNombregrupo);
        txtNombregrupo.setBounds(680, 160, 290, 40);

        txtJugadores.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        txtJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJugadoresActionPerformed(evt);
            }
        });
        getContentPane().add(txtJugadores);
        txtJugadores.setBounds(680, 220, 290, 40);

        jLabel2.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(42, 283, 222, 56);

        jLabel6.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel6.setText("cedula de jugador");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(300, 280, 380, 40);

        txtIdJug.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        getContentPane().add(txtIdJug);
        txtIdJug.setBounds(680, 280, 290, 40);

        jButton1.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(740, 330, 150, 40);

        jScrollPane1.setViewportView(lstJugadores);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 380, 670, 190);

        btnAtras.setFont(new java.awt.Font("Minecrafter Alt", 0, 24)); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras);
        btnAtras.setBounds(0, 0, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/grupos.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJugadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJugadoresActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        lstJugadores.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        MenuUsuario menu = new MenuUsuario();
        menu.setVisible(true);
        menu.setDefaultCloseOperation(HIDE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearGrupo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstJugadores;
    private javax.swing.JTextField txtIdJug;
    private javax.swing.JTextField txtJugadores;
    private javax.swing.JTextField txtNombregrupo;
    // End of variables declaration//GEN-END:variables
}
