/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.miapp.triage.gui;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fran
 */
public class MedicosGUI extends javax.swing.JFrame {

    /**
     * Creates new form Medicos
     */

    public MedicosGUI() {
    initComponents();
    cargarDatosDesdeCSV();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Medico", "Especialidad", "Fecha Titulo", "Universidad", "N Matricula"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Menu men = new Menu();
        men.setVisible(true);
        men.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void cargarDatosDesdeCSV() {
    DefaultTableModel modeloTabla = (DefaultTableModel) jTable1.getModel();
    modeloTabla.setRowCount(0);
    
    

    try {
        BufferedReader brMedicos = new BufferedReader(new FileReader("src\\main\\java\\com\\miapp\\triage\\csv\\medicos.csv"));
        BufferedReader brEspecialidad = new BufferedReader(new FileReader("src\\main\\java\\com\\miapp\\triage\\csv\\especialidades.csv"));
        BufferedReader brEstudios = new BufferedReader(new FileReader("src\\main\\java\\com\\miapp\\triage\\csv\\estudios.csv"));
        String lineaMedicos;
        String lineaEspecialidad;
        String lineaEstudios;

        while ((lineaMedicos = brMedicos.readLine()) != null && (lineaEspecialidad = brEspecialidad.readLine()) != null && (lineaEstudios = brEstudios.readLine()) != null ) {
            String[] datosMedicos = lineaMedicos.split(";");
            String[] datosEspecialidad = lineaEspecialidad.split(";");
            String[] datosEstudios = lineaEstudios.split(";");
            
            if (datosMedicos.length >= 10 && datosEspecialidad.length >= 2 && datosEstudios.length >= 2) {
                String nombre = datosMedicos[1]; 
                String apellido = datosMedicos[2];
                String especialidades = datosEspecialidad[1]; 
                String Universidad = datosEstudios[0];
                String fechaTit = datosEstudios[1];
                String numMatri = datosMedicos[10];

                String nombreCompleto = nombre + " " + apellido;

                modeloTabla.addRow(new Object[] {nombreCompleto, especialidades, fechaTit, Universidad, numMatri});
            }
        }
        
        brMedicos.close();
        brEspecialidad.close();
        brEstudios.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    
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
            java.util.logging.Logger.getLogger(MedicosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicosGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
