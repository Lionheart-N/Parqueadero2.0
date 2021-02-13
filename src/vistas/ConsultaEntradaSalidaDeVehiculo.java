/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vistas;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author kestn
 */
public class ConsultaEntradaSalidaDeVehiculo extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaEntradaSalidaDeVehículo
     */
    public ConsultaEntradaSalidaDeVehiculo() {
        initComponents();
        setTitle("Entrada y salida de vehiculo");
        setResizable(false);
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;		
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon (getClass().getResource("../img/icon.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_linea = new javax.swing.JLabel();
        jTextField_placa = new javax.swing.JTextField();
        btn_consultarPlaca = new javax.swing.JButton();
        jLabel_titulo = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_linea.setText("Ingresa la placa a consultar");

        jTextField_placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_placaActionPerformed(evt);
            }
        });

        btn_consultarPlaca.setText("Consultar");
        btn_consultarPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarPlacaActionPerformed(evt);
            }
        });

        jLabel_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_titulo.setText("Consultas ");

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit-P.png"))); // NOI18N
        btn_salir.setContentAreaFilled(false);
        btn_salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit-G.png"))); // NOI18N
        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btn_salir)
                        .addGap(42, 42, 42)
                        .addComponent(btn_consultarPlaca))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_linea)
                                .addGap(40, 40, 40)
                                .addComponent(jTextField_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel_titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_linea))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_consultarPlaca)
                    .addComponent(btn_salir))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_consultarPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_consultarPlacaActionPerformed

    private void jTextField_placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_placaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_placaActionPerformed

    private void btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseClicked
        // TODO add your handling code here:
        Administrador administrador = new Administrador();
        administrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_salirMouseClicked

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
            java.util.logging.Logger.getLogger(ConsultaEntradaSalidaDeVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaEntradaSalidaDeVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaEntradaSalidaDeVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaEntradaSalidaDeVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaEntradaSalidaDeVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultarPlaca;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel_linea;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JTextField jTextField_placa;
    // End of variables declaration//GEN-END:variables
}