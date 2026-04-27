/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
/**
 *
 * @author behof
 */
public class Math {
    public JButton jButton;
    public JTextField jTextFieldChar1, jTextFieldChar2; 
    public JLabel jLabelResult;




    public void somar(){
        try {
            int s1 = Integer.parseInt(jTextFieldChar1.getText());
            int s2 = Integer.parseInt(jTextFieldChar2.getText());
            int result = s1+s2;
            jLabelResult.setText("" + result);
        } catch(NumberFormatException e) {
            jLabelResult.setText("Erro na entrada");
        }        
    }
    public void subtrair(){
        try {
            int s1 = Integer.parseInt(jTextFieldChar1.getText());
            int s2 = Integer.parseInt(jTextFieldChar2.getText());
            int result = s1-s2;
            jLabelResult.setText("" + result);
        } catch(NumberFormatException e) {
            jLabelResult.setText("Erro na entrada");
        }        
    }
    public void multiplicar(){
        try {
            int s1 = Integer.parseInt(jTextFieldChar1.getText());
            int s2 = Integer.parseInt(jTextFieldChar2.getText());
            int result = s1*s2;
            jLabelResult.setText("" + result);
        } catch(NumberFormatException e) {
            jLabelResult.setText("Erro na entrada");
        }        
    }
    public void dividir(){
        try {
            int s1 = Integer.parseInt(jTextFieldChar1.getText());
            int s2 = Integer.parseInt(jTextFieldChar2.getText());

            if (s2 == 0) {
                jLabelResult.setText("Divisão por zero");
                return;
            }

            float result = (float) s1 / s2;

            if (result % 1 == 0) {
                jLabelResult.setText("" + (int) result);
            } else {
                jLabelResult.setText("" + result);
            }

        } catch (NumberFormatException e) {
            jLabelResult.setText("Erro na entrada");
        }     
    }
}