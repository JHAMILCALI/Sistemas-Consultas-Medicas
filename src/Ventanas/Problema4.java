/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Clases.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Problema4 extends javax.swing.JFrame {
    private Principal v1;
    /**
     * Creates new form Problema4
     */
    public Problema4() {
        initComponents();
    }

    Problema4(Principal aThis) {
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
        botonAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PANTALLAORDENAR = new javax.swing.JTable();
        botonMostrarConsultas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("[4] ORDENAR PACIENTES POR PRIORIDADES");

        jButton1.setText("ORDENAR PACIENTES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        botonAtras.setText("ATRAS");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(PANTALLAORDENAR);

        botonMostrarConsultas.setText("MOSTRAR  CONUSLTAS");
        botonMostrarConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarConsultasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonMostrarConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jButton1)
                        .addGap(42, 42, 42)
                        .addComponent(botonMostrarConsultas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(botonAtras)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int nroElem = v1.getA().getEmergencia().nroElem();
		
	
		for (int i = 0; i < nroElem; i++) {
			Emergencia eme = v1.getA().getEmergencia().eli();
			v1.getA().getEmergencia().adi(eme);
			ordenar_consultas(v1.getA(),eme.getNivel_gravedad());
		}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        // TODO add your handling code here:
        this.v1.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonMostrarConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarConsultasActionPerformed
        // TODO add your handling code here:
        NodoConsulta R = v1.getA().getConsulta().getP();
        String titulos[] = {"\t====== CONSULTAS ======"};
        DefaultTableModel pantalla = new DefaultTableModel(null,titulos);
        int cont = 0;
        while (R!=null) {
            Consulta con = R.getConsulta();
            cont++;
            String contador [] = {"=======Consulta ["+Integer.toString(cont)+"]======="};
            pantalla.addRow(contador);
            String fecha [] = {"Fecha : "+con.getFecha()};
            pantalla.addRow(fecha);
            String Hora [] = {"Hora : "+con.getHora()};
            pantalla.addRow(Hora);
            String sala [] = {"Sala : "+con.getSala()};
            pantalla.addRow(sala);
            String Atendido [] = {"Atendido : "+con.getatendido()};
            pantalla.addRow(Atendido);
            String TipoE [] = {"Tipo de Emergencia : "+con.gettipo_emergencia()};
            pantalla.addRow(TipoE);
            String motivo [] = {"Motivo : "+con.getMotivo()};
            pantalla.addRow(motivo);
            String NomDoc [] = {"Nombre Doc : "+con.getDoc_Nombre_Atender()};
            pantalla.addRow(NomDoc);
            String nompac [] = {"      Nombre del Paciente : "+con.getPaciente().getNombre()};
            pantalla.addRow(nompac);
            String edad [] = {"     Edad del Paciente : "+con.getPaciente().getEdad()};
            pantalla.addRow(edad);
            R=R.getSig();
        }
        PANTALLAORDENAR.setModel(pantalla);

    }//GEN-LAST:event_botonMostrarConsultasActionPerformed

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
            java.util.logging.Logger.getLogger(Problema4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Problema4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Problema4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Problema4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Problema4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PANTALLAORDENAR;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonMostrarConsultas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void ordenar_consultas(Sala_de_Espera sala, String nivel_gravedad) {
        NodoConsulta R = sala.getConsulta().getP();
		NodoConsulta S = R;
		while (R!=null) {
			Consulta con = R.getConsulta();
			if (con.gettipo_emergencia().equals(nivel_gravedad)) {
				if (R==sala.getConsulta().getP()) {
					R=R.getSig();
					S=R;
				}else {
					S.setSig(R.getSig());
					R = R.getSig();
					sala.getConsulta().adiPrincipio(con);
				}
			}else {
				S=R;
				R=R.getSig();
			}
		}
    }
}
