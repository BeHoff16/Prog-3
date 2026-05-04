/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import visao.TelaColorida;
import visao.TelaProjeto;

/**
 *
 * @author victorperes
 */
public class ControladorTela {

    JDesktopPane jDesktop;
    
     public void abrirTelaProjeto() {
        jDesktop.removeAll();
        jDesktop.updateUI();
        Dimension resolucao = jDesktop.getSize(); //captura resolução do container
        TelaProjeto tela1 = new TelaProjeto();
        tela1.setSize(resolucao);
        tela1.setLocation(0, 0);
        jDesktop.add(tela1);
        tela1.setVisible(true);
    }
    
    
    

    public ControladorTela(JDesktopPane jDesktop) {
        this.jDesktop = jDesktop;
    }

   

    public void abrirTelaColorida() {
        jDesktop.removeAll();
        jDesktop.updateUI();
        Dimension resolucao = jDesktop.getSize(); //captura resolução do container
        TelaColorida tela1 = new TelaColorida();
        tela1.setSize(resolucao);
        tela1.setLocation(0, 0);
        jDesktop.add(tela1);
        tela1.setVisible(true);
    }
}
