/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parchisc5i927.Controlador;

import com.mycompany.parchisc5i927.Vista.GUIHistoria;
import com.mycompany.parchisc5i927.Vista.GUIInstrucciones;
import com.mycompany.parchisc5i927.Vista.GUIPrincipal;
import com.mycompany.parchisc5i927.Vista.GUICreditos;
import com.mycompany.parchisc5i927.Vista.GUIJuego;
import com.mycompany.parchisc5i927.Controlador.ControladorJuego;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author josmy
 */
public class ControladorPrincipal implements ActionListener {
    private GUIPrincipal guiPrincipal;
    private GUICreditos guiCreditos;
    private GUIInstrucciones guiInstrucciones;
    private GUIHistoria guiHistoria;
    private GUIJuego guiJuego;
    private ControladorJuego controladorJuego;
    public ControladorPrincipal() {
            guiPrincipal = new GUIPrincipal(this);
            guiCreditos = new GUICreditos(this);
            guiInstrucciones = new GUIInstrucciones(this);
            guiHistoria = new GUIHistoria(this);
            guiPrincipal.setVisible(true);
    }
    
    
    
    
    public void actionPerformed (ActionEvent e){
        
        switch (e.getActionCommand()){
            
            case "Jugar":
                guiPrincipal.setVisible(true);
               controladorJuego= new ControladorJuego(guiPrincipal);
                break;
            case "Instrucciones":
                 guiPrincipal.setVisible(false);
                guiInstrucciones.setVisible(true);
                break;
                case "AtrasInstrucciones":
                guiInstrucciones.setVisible(false);
                guiPrincipal.setVisible(true);
                break;

            case "Credito":
                guiPrincipal.setVisible(false);
                guiCreditos.setVisible(true);
                
                
                break;
            case "AtrasCreditos":
                guiCreditos.setVisible(false);
                guiPrincipal.setVisible(true);
                break;
                
            case "Historia":
                 guiPrincipal.setVisible(false);
                guiHistoria.setVisible(true);
                break;
            case "AtrasHistoria":
                guiHistoria.setVisible(false);
                guiPrincipal.setVisible(true);
                break;
            case "Salir":
                System.exit(0);
                break;
            
            
            
        }
        
        
    }
}