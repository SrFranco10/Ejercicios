/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.matriz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author franc
 */
public class FmrPrincipal extends javax.swing.JFrame implements ActionListener {
        int [][] Matriz = new int[3][3];
        int Suma=0;
        Random Rand = new Random();
        DefaultTableModel Panel;
    
    public FmrPrincipal() {
        initComponents();
        btnLlenar.addActionListener(this);
        Panel = new DefaultTableModel(new Object[]{"A", "B", "C"}, 3);
        JPanel.setModel(Panel);
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JPanel = new javax.swing.JTable();
        btnLlenar = new javax.swing.JButton();
        txtResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Matriz 3x3");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(167, 16, 70, 16);

        JPanel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(JPanel);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(25, 44, 347, 123);

        btnLlenar.setText("Llenar");
        getContentPane().add(btnLlenar);
        btnLlenar.setBounds(160, 180, 75, 23);
        getContentPane().add(txtResultado);
        txtResultado.setBounds(90, 230, 240, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JPanel;
    private javax.swing.JButton btnLlenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btnLlenar){
           for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Matriz[i][j] = Rand.nextInt(100) + 1;
                Panel.setValueAt(Matriz[i][j], i, j);
                if (i == j) {
                    Suma += Matriz[i][j];
                }
            }
        }

       }
       txtResultado.setText("Suma de la diagonal: " + Suma);
    }
}
