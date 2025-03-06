/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.aeropuerto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class FmrPrincipal extends javax.swing.JFrame implements ActionListener {
    public Vuelo[] vuelos;
    
    public FmrPrincipal() {
        initComponents();
        vuelos = new Vuelo[5];
        vuelos[0] = new Vuelo("V001", "Madrid", "Barcelona");
        vuelos[1] = new Vuelo("V002", "Sevilla", "Valencia");
        vuelos[2] = new Vuelo("V003", "Paris", "Roma");
        vuelos[3] = new Vuelo("V004", "Londres", "Berlin");
        vuelos[4] = new Vuelo("V005", "New York", "Los Angeles");
        
        btnAgregar.addActionListener(this);
        btnMostrar.addActionListener(this);
        btnBuscar.addActionListener(this);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroVuelo = new javax.swing.JTextField();
        txtNombrePasajero = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPanel = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Numero Vuelo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 40, 77, 16);

        jLabel2.setText("Nombre Pasajero");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 80, 91, 16);

        jLabel3.setText("Buscar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 110, 35, 16);
        getContentPane().add(txtNumeroVuelo);
        txtNumeroVuelo.setBounds(160, 40, 92, 22);
        getContentPane().add(txtNombrePasajero);
        txtNombrePasajero.setBounds(160, 80, 210, 22);
        getContentPane().add(txtBuscar);
        txtBuscar.setBounds(160, 110, 64, 22);

        btnAgregar.setText("Agregar");
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(130, 160, 72, 23);

        btnMostrar.setText("Mostrar");
        getContentPane().add(btnMostrar);
        btnMostrar.setBounds(220, 160, 72, 23);

        btnBuscar.setText("Buscar");
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(310, 160, 72, 23);

        txtPanel.setColumns(20);
        txtPanel.setRows(5);
        jScrollPane1.setViewportView(txtPanel);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 210, 350, 120);

        pack();
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
            java.util.logging.Logger.getLogger(FmrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNombrePasajero;
    private javax.swing.JTextField txtNumeroVuelo;
    private javax.swing.JTextArea txtPanel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnAgregar){
              String numeroVuelo = txtNumeroVuelo.getText();
                String nombrePasajero = txtNombrePasajero.getText();
                Vuelo vuelo = encontrarVuelo(numeroVuelo);

                if (vuelo != null) {
                    vuelo.agregarPasajero(nombrePasajero);
                    JOptionPane.showMessageDialog(null, "Pasajero agregado correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Vuelo no encontrado.");
                }

                txtNombrePasajero.setText("");
            }else if(e.getSource()==btnBuscar){
                String nombrePasajero = txtBuscar.getText();
                boolean encontrado = false;

                txtPanel.setText(""); 

                for (Vuelo vuelo : vuelos) {
                    if (vuelo.buscarPasajero(nombrePasajero)) {
                        txtPanel.append("El pasajero " + nombrePasajero + " está en el vuelo " + vuelo.getNumeroVuelo() + "\n");
                        encontrado = true;
                    }
                }

                if (!encontrado) {
                    txtPanel.append("El pasajero no se encuentra en ningún vuelo.\n");
                }

                txtBuscar.setText("");
            }else if (e.getSource() == btnMostrar) {
            txtPanel.setText(""); 

             for (Vuelo vuelo : vuelos) {
              vuelo.mostrarPasajeros(txtPanel);  
    }
}
            }
        
            private Vuelo encontrarVuelo(String numeroVuelo) {
        for (Vuelo vuelo : vuelos) {
            if (vuelo.getNumeroVuelo().equals(numeroVuelo)) {
                return vuelo;
            }
        }
        return null;  
    }
            
        }
    

