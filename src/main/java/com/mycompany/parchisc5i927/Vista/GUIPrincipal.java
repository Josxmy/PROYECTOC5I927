/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.parchisc5i927.Vista;

import com.mycompany.parchisc5i927.Controlador.ControladorPrincipal;
import java.awt.event.ActionListener;

/**
 *
 * @author josmy
 */
public class GUIPrincipal extends javax.swing.JFrame {
   
    
    /**
     * Creates new form GUIPrincipal
     */
    public GUIPrincipal(ControladorPrincipal controlador) {
        initComponents();
        escuchar(controlador);
    }
    
    public void escuchar(ControladorPrincipal controlador){
        btnJugar.addActionListener(controlador);
        btnSalir.addActionListener(controlador);
        btnHistoria.addActionListener(controlador);
        btnCredito.addActionListener(controlador);
        btnInstrucciones.addActionListener(controlador);
                
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir1 = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        btnInstrucciones = new javax.swing.JButton();
        btnCredito = new javax.swing.JButton();
        btnHistoria = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jlFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sonido.png"))); // NOI18N
        btnSalir1.setActionCommand("Sonido");
        btnSalir1.setContentAreaFilled(false);
        getContentPane().add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, -1, -1));

        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jugarPrincipal.png"))); // NOI18N
        btnJugar.setActionCommand("Jugar");
        btnJugar.setContentAreaFilled(false);
        getContentPane().add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 360, 90));

        btnInstrucciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/instruccionesPrincipal.png"))); // NOI18N
        btnInstrucciones.setActionCommand("Instrucciones");
        btnInstrucciones.setContentAreaFilled(false);
        getContentPane().add(btnInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 320, -1));

        btnCredito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/creditosPrincipal.png"))); // NOI18N
        btnCredito.setActionCommand("Credito");
        btnCredito.setBorderPainted(false);
        btnCredito.setContentAreaFilled(false);
        getContentPane().add(btnCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, -1, -1));

        btnHistoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historiaPrincipal.png"))); // NOI18N
        btnHistoria.setActionCommand("Historia");
        btnHistoria.setContentAreaFilled(false);
        getContentPane().add(btnHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonSalir.png"))); // NOI18N
        btnSalir.setActionCommand("Salir");
        btnSalir.setContentAreaFilled(false);
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 660, -1, -1));

        jlFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoPrincipal.png"))); // NOI18N
        getContentPane().add(jlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 990, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCredito;
    private javax.swing.JButton btnHistoria;
    private javax.swing.JButton btnInstrucciones;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JLabel jlFondo;
    // End of variables declaration//GEN-END:variables
}
