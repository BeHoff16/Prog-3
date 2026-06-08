/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.JDesktopPane;
import java.awt.Dimension;
import visao.TelaColorida;
import visao.TelaProjeto;
/**
 *
 * @author behof
 */
public class ControladorTela {
    
    JDesktopPane jDesktop;
    
    public ControladorTela(JDesktopPane jDesktop){
        this.jDesktop = jDesktop;
    }
    
    public void abrirTelaProjeto(){
        jDesktop.removeAll();
        jDesktop.updateUI();
        Dimension resolution = jDesktop.getSize();
        TelaProjeto tela1 = new TelaProjeto();
        tela1.setSize(resolution);
        tela1.setLocation(0, 0);
        jDesktop.add(tela1);
        tela1.setVisible(true);
    }
    
    public void abrirTelaColorida(){
        jDesktop.removeAll();
        jDesktop.updateUI();
        Dimension resolution = jDesktop.getSize();
        TelaColorida tela1 = new TelaColorida();
        tela1.setSize(resolution);
        tela1.setLocation(0, 0);
        jDesktop.add(tela1);
        tela1.setVisible(true);
    }
}
