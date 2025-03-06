/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.buscarnumero;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FmrPrincipal extends javax.swing.JFrame implements ActionListener {

    ArrayList<Integer> numeros=new ArrayList<>();
    int x=0;
    int Buscar;
    

    public FmrPrincipal() {
        initComponents();
        btnIngresar.addActionListener(this);
        btnBuscar.addActionListener(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtLabel = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPanel = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        txtLabel.setText("Ingrese 10 Numeros ");
        jPanel1.add(txtLabel);
        txtLabel.setBounds(130, 10, 220, 16);

        btnIngresar.setText("Ingresar");
        jPanel1.add(btnIngresar);
        btnIngresar.setBounds(110, 90, 75, 23);
        jPanel1.add(txtNumero);
        txtNumero.setBounds(170, 40, 71, 22);

        btnBuscar.setText("Buscar");
        jPanel1.add(btnBuscar);
        btnBuscar.setBounds(210, 90, 72, 23);

        txtPanel.setColumns(20);
        txtPanel.setRows(5);
        jScrollPane1.setViewportView(txtPanel);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(80, 150, 234, 86);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtLabel;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextArea txtPanel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnIngresar){
            AgregarNumeros();
        }else if(e.getSource()==btnBuscar){
            
          BuscarNumeros();
        }
    }
    
    public void AgregarNumeros(){
    if(x<10){
    numeros.add(Integer.parseInt(txtNumero.getText()));
    x++;
    txtNumero.setText("");
    }else{
        JOptionPane.showMessageDialog(null, "Numeros completos");
        txtNumero.setText("");
        txtLabel.setText("Ingrese Numero Para Buscar");
    }
    }
    
     public void BuscarNumeros() {
        txtPanel.setText(""); 
        boolean encontrado = false;

        for (int i = 0; i < numeros.size(); i++) {
            Buscar= Integer.parseInt(txtNumero.getText());
            if (numeros.get(i) == Buscar) {
                txtPanel.setText("El valor sí se encuentra y está en la posición: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            txtPanel.setText("El valor a buscar no existe.");
        }
    
             
    }}

