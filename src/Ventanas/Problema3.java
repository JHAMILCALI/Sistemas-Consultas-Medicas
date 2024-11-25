/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Clases.Consulta;
import Clases.NodoConsulta;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Problema3 extends javax.swing.JFrame {
    private Principal v1;
    /**
     * Creates new form Problema3
     */
    public Problema3() {
        initComponents();
    }

    Problema3(Principal aThis) {
        initComponents();
        this.v1=aThis;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        botonCalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pantallaTiempos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("[3] CALCULAR TIEMPO DE ESPERA DE LOS PACIENTES NO ATENDIDOS");

        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        botonCalcular.setText("CALCULRA TIEMPOS");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(pantallaTiempos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(botonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.v1.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        // TODO add your handling code here:
        NodoConsulta R = v1.getA().getConsulta().getP();
	    DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
            String titulo [] = {"\t--------TEMPOS DE ESPERA DE PACIENTES-------"};
            //pantalla.addRow(titulos);
	    String titulos [] = {"Nombre Paciente ","Hora de ingreso","Tiempo de espera"};
            DefaultTableModel pantalla  = new  DefaultTableModel(null,titulos);
            
	    while (R != null) {
	        Consulta con = R.getConsulta();
	        if (con != null && con.getatendido().equals("No")) {
	            try {
	                String hora = con.getHora();
	                if (hora == null || hora.isEmpty()) {
	                    System.out.println("Hora no válida para el paciente: " + con.getPaciente().getNombre());
	                    R = R.getSig();
	                    continue;
	                }
	                LocalTime horaInicial = LocalTime.parse(hora, formato);
	                LocalTime horaActual = LocalTime.now();
	                Duration duracion = Duration.between(horaInicial, horaActual);
	                if (duracion.isNegative()) {
	                    duracion = duracion.abs();
	                }
	                long horas = duracion.toHours();
	                long minutos = duracion.toMinutes() % 60;
	                String tiempoFormateado = String.format("%02d:%02d", horas, minutos);
	                System.out.println("El Paciente: " + con.getPaciente().getNombre() + " esperó el tiempo [" + tiempoFormateado + "]");
                        String fila [] = {con.getPaciente().getNombre(),con.getHora(),tiempoFormateado};
                        pantalla.addRow(fila);
	            } catch (Exception e) {
	                System.out.println("Error procesando el tiempo para el paciente: " + con.getPaciente().getNombre());
	                e.printStackTrace();
	            }
	        }
	        R = R.getSig();
	    }
            pantallaTiempos.setModel(pantalla);
    }//GEN-LAST:event_botonCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Problema3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Problema3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Problema3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Problema3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Problema3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcular;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pantallaTiempos;
    // End of variables declaration//GEN-END:variables
}
