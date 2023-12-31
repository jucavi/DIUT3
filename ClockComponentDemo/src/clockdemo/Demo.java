/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clockdemo;

import digitalclock.AlarmListener;
import javax.swing.JOptionPane;

/**
 *
 * @author kaos
 */
public class Demo extends javax.swing.JFrame {

    /**
     * Creates new form Demo
     */
    public Demo() {
        initComponents();
        digitalClock24.addAlarmListener(new AlarmListener() {
            @Override
            public void launchAlarm() {
                JOptionPane.showMessageDialog(Demo.this, digitalClock24.getAlarm().getMessage(), "Alarma activa", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        digitalClock12.addAlarmListener(new AlarmListener() {
            @Override
            public void launchAlarm() {
                JOptionPane.showMessageDialog(Demo.this, digitalClock12.getAlarm().getMessage(), "Alarma activa", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelClock24 = new javax.swing.JLabel();
        digitalClock24 = new digitalclock.DigitalClock();
        jLabelClock12 = new javax.swing.JLabel();
        digitalClock12 = new digitalclock.DigitalClock();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Demo de componente DigitalClock");
        setResizable(false);

        jLabelClock24.setBackground(new java.awt.Color(0, 0, 0));
        jLabelClock24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClock24.setText("En formato 24H no seleccionado por defecto");

        digitalClock24.setAlarm(new digitalclock.Alarm(12, 34, true, "Alarma generada por reloj 24H"));
        digitalClock24.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        digitalClock24.setFormat24(true);
        digitalClock24.setToolTipText("Reloj digital en formato 24H");

        jLabelClock12.setBackground(new java.awt.Color(0, 0, 0));
        jLabelClock12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClock12.setText("En formato 12H por defecto");

        digitalClock12.setAlarm(new digitalclock.Alarm(12, 35, true, "Alarma generada por reloj 12H"));
        digitalClock12.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        digitalClock12.setToolTipText("Reloj digital en formato 12H");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelClock24, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(digitalClock24, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addComponent(digitalClock12, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addComponent(jLabelClock12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabelClock24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(digitalClock24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabelClock12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(digitalClock12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Demo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private digitalclock.DigitalClock digitalClock12;
    private digitalclock.DigitalClock digitalClock24;
    private javax.swing.JLabel jLabelClock12;
    private javax.swing.JLabel jLabelClock24;
    // End of variables declaration//GEN-END:variables
}
