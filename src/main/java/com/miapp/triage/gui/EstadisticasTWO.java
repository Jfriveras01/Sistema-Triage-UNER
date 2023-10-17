
package com.miapp.triage.gui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class EstadisticasTWO extends javax.swing.JDialog {

    String archivoPacientes = "C:\\Users\\iCentro\\Desktop\\taller 2\\Sistema-Triage-UNER\\src\\main\\java\\com\\miapp\\triage\\csv\\pacientes.csv";
    String archivoConsultas = "C:\\Users\\iCentro\\Desktop\\taller 2\\Sistema-Triage-UNER\\src\\main\\java\\com\\miapp\\triage\\csv\\Consultas.csv";
    
    public EstadisticasTWO() {
        super();
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("         Fecha2");

        jLabel2.setText("        Fecha1");

        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("           Edad1");

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Siguiente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("       Edad2");

        jFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(jFormattedTextField4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(253, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jFormattedTextField4)))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(16, 16, 16))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(246, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        EstadisticasGUI estadisticas = new EstadisticasGUI();
        estadisticas.setVisible(true);
        estadisticas.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String fecha1 = jFormattedTextField1.getText();
        String fecha2 = jFormattedTextField3.getText();
        int edad1 = Integer.parseInt(jFormattedTextField4.getText());
        int edad2 = Integer.parseInt(jFormattedTextField2.getText());

        // Verifica que todos los campos estén completos
        if (fecha1.isEmpty() || fecha2.isEmpty() || edad1<0 || edad2<0) {
            JOptionPane.showMessageDialog(this, "Debes completar todos los campos.");
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); // Esto hará que el formato sea estricto
    
        try {
            Date fechauno = sdf.parse(fecha1);
            Date fechados = sdf.parse(fecha2);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "El formato de fecha no es válido");
             return; // Sale del método si las fechas no tienen el formato correcto
        }


        int pacientesAtendidos = 0;

        try (BufferedReader brPacientes = new BufferedReader(new FileReader(archivoPacientes));
             BufferedReader brConsultas = new BufferedReader(new FileReader(archivoConsultas))) {
            String lineaPaciente;
            String lineaConsulta;

            while ((lineaPaciente = brPacientes.readLine()) != null && (lineaConsulta = brConsultas.readLine()) != null) {
                String[] datosPaciente = lineaPaciente.split(";");
                String[] datosConsulta = lineaConsulta.split(";");

                if (datosPaciente.length >= 4 && datosConsulta.length >= 3) {
                    
                    String fechaNacimientoPaciente = datosPaciente[3];
                    Date fechaNacimiento = sdf.parse(fechaNacimientoPaciente);

               
                    int edadPaciente = calcularEdad(fechaNacimiento);
                    String fechaConsulta = datosConsulta[1];
                    if (fechaDentroDelRango(fechaConsulta, fecha1, fecha2) && edadDentroDelRango(edadPaciente,edad1,edad2)) {
                            pacientesAtendidos++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException ex) {
            Logger.getLogger(EstadisticasTWO.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(this, "Cantidad de pacientes atendidos en el rango de fechas y edad: " + pacientesAtendidos);
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField2ActionPerformed

    private int calcularEdad(Date fechaNacimiento) {
        // Calcula la edad a partir de la fecha de nacimiento
        // Esto es solo un ejemplo, puedes implementar un cálculo más preciso si es necesario
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaNacimiento.getMonth() > fechaActual.getMonth() || (fechaNacimiento.getMonth() == fechaActual.getMonth() && fechaNacimiento.getDate() > fechaActual.getDate())) {
            edad--;
        }
        return edad;
    }

    private boolean fechaDentroDelRango(String fecha, String fechaInicio, String fechaFin) {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    try {
        Date fechaConsulta = sdf.parse(fecha);
        Date fecha1 = sdf.parse(fechaInicio);
        Date fecha2 = sdf.parse(fechaFin);
        return fechaConsulta.compareTo(fecha1) >= 0 && fechaConsulta.compareTo(fecha2) <= 0;
    } catch (ParseException e) {
        e.printStackTrace();
        return false; 
    }
}
    
    private boolean edadDentroDelRango(int edad,int edad1, int edad2){
        return edad>=edad1 && edad<= edad2;
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
            java.util.logging.Logger.getLogger(EstadisticasTWO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstadisticasTWO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstadisticasTWO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstadisticasTWO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EstadisticasTWO dialog = new EstadisticasTWO();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
