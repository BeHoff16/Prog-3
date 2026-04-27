/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Discentes
 */
public class control {
    JTextField jTextFieldQUANT, jTextFieldPAG, jTextFieldVALOR;
    JLabel jLabelTOTAL, jLabelTROCO, jLabelRELATORIO;
    int calcular2;
    int final1;
            
    public control(JTextField jTextFieldQUANT, JTextField jTextFieldPAG, JTextField jTextFieldVALOR, JLabel jLabelTOTAL, JLabel jLabelTROCO, JLabel jLabelRELATORIO) {
        this.calcular2 = 0;
        this.final1 = 0;
        this.jTextFieldQUANT = jTextFieldQUANT;
        this.jTextFieldPAG = jTextFieldPAG;
        this.jTextFieldVALOR = jTextFieldVALOR;
        this.jLabelTOTAL = jLabelTOTAL;
        this.jLabelTROCO = jLabelTROCO;
        this.jLabelRELATORIO = jLabelRELATORIO;
    }

    public void calcular() {
        int q = Integer.parseInt(jTextFieldQUANT.getText());
        int valor = Integer.parseInt(jTextFieldVALOR.getText());
        calcular2 = q * valor;
        jLabelTOTAL.setText("" + calcular2);
    }
    public void salvarF() {
        final1 = calcular2;
    }
    
    public void contas(){
        int pag = Integer.parseInt(jTextFieldPAG.getText());
        int cont = pag - final1;
        jLabelRELATORIO.setText("Final:" + cont);
    }
    
    
}
