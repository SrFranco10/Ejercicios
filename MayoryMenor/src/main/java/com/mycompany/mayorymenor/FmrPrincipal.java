/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mayorymenor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class FmrPrincipal extends javax.swing.JFrame implements ActionListener {
Double numeros[]= new Double [11];
int x=1;
    
    public FmrPrincipal() {
        initComponents();
        btnCambiar.addActionListener(this);
        btnResultado.addActionListener(this);
        txtN1.setText("Numero"+x);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtN1 = new javax.swing.JLabel();
        btnCambiar = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        btnResultado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        txtN1.setText("Numero ");
        jPanel1.add(txtN1);
        txtN1.setBounds(170, 30, 60, 16);

        btnCambiar.setText("Anadir");
        jPanel1.add(btnCambiar);
        btnCambiar.setBounds(140, 90, 110, 23);
        jPanel1.add(txtNumero);
        txtNumero.setBounds(160, 50, 64, 22);

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 160, 260, 200);

        btnResultado.setText("Resultados");
        jPanel1.add(btnResultado);
        btnResultado.setBounds(150, 370, 110, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
    
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
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnResultado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtN1;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==btnCambiar){
          AgregarNumeros();
          }else if(e.getSource()==btnResultado){
            Resultados();  
          } 
        
    }
    
    
    
    
    
    
    
    
    
    public void AgregarNumeros(){
    if(x<=10){
    numeros[x] = Double.parseDouble(txtNumero.getText());
    x++;
    txtN1.setText("Numero"+(x) );
    txtNumero.setText("");
    }else{
        JOptionPane.showMessageDialog(null, "Numeros completos");
    }
    }
    
    public void Resultados(){
        
        
        
        Double NumM=Double.MIN_VALUE;
        
        for(int i=1;i<=10;i++){
            if(NumM < numeros[i]){
               NumM=numeros[i];
            }
            
    }
        txtResultado.append("Numero Mayor: "+Double.toString(NumM)+"\n");
        for(int i=1;i<=10;i++){
            if(NumM > numeros[i]){
               NumM=numeros[i];
            }}
        txtResultado.append("Numero Menor: "+Double.toString(NumM)+"\n");
        NumM=0.0;
        for(int i=1;i<=10;i++){
            NumM+=numeros[i];
            
            }
            NumM=NumM/10;
            txtResultado.append("Promedio: "+Double.toString(NumM)+"\n");
    }
        
        
        
} 





