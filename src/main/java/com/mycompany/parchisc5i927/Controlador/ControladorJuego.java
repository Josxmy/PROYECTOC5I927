/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parchisc5i927.Controlador;

import com.mycompany.parchisc5i927.Modelo.Ficha;
import com.mycompany.parchisc5i927.Modelo.Posicion;
import com.mycompany.parchisc5i927.Vista.GUIJuego;
import com.mycompany.parchisc5i927.Vista.GUIPrincipal;
import com.mycompany.parchisc5i927.Vista.PanelControl;
import com.mycompany.parchisc5i927.Vista.PanelJuego;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

/**
 *
 * @author josmy
 */
public class ControladorJuego implements ActionListener, MouseListener{
    private GUIJuego guiJuego;
    private PanelJuego panelJuego;
    private PanelControl panelControl;
    private GUIPrincipal guiPrincipal;
    private Ficha ficha;
    
    public ControladorJuego(){
        guiJuego=new GUIJuego(this);
    }
    
    public ControladorJuego(GUIPrincipal guiPrincipal){
        this.guiPrincipal=guiPrincipal;
        guiJuego= new GUIJuego(this);
        guiJuego.setVisible(true);
        ficha= new Ficha(new Posicion(504, 82), new ImageIcon("./src/main/resources/img/pieceblue.png"), "Amarillo");
    }
    
    public void dibujar(Component c, Graphics g )
    {
       ficha.dibujar(c, g);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "Dado":
                System.out.println("Se presiono el boton dado");
                break;
            case "AtrasJuego":
                guiJuego.dispose();
                guiPrincipal.setVisible(true);
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("X "+e.getX()+" Y "+e.getY());
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
