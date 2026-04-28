/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Discentes
 */
public class Controlador {
    JButton jButton1;
    JButton jButton2;
    JButton jButton3;
    JButton jButton4;
    JButton jButton5;
    
    JLabel jLabel1, jLabel2, jLabel3, jLabel4;

    public Controlador(JButton jButton1, JButton jButton2, JButton jButton3, JButton jButton4, JButton jButton5, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4) {
        this.jButton1 = jButton1;
        this.jButton2 = jButton2;
        this.jButton3 = jButton3;
        this.jButton4 = jButton4;
        this.jButton5 = jButton5;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
    }
    
    public void actionFeminicidio(){
        jLabel1.setText("<html> <div style = 'width:350px;'>"+
                "Feminicídio é o assassinato de uma mulher por motivo de gênero."+
    "</div></html>");
        jLabel2.setText("<html> <div style = 'width:350px;'>"+
                "Geralmente envolve violência doméstica ou ódio contra mulheres."+
    "</div></html>");
        jLabel3.setText("<html> <div style = 'width:350px;'>"+
                "No Brasil, é considerado crime específico desde 2015."+
    "</div></html>");
        jLabel4.setText("<html> <div style = 'width:350px;'>"+
                "É uma forma grave de violência que busca ser combatida por leis e políticas públicas."+
    "</div></html>");
    }
    public void actionSixSeven(){
        jLabel1.setText("<html> <div style = 'width:350px;'>"+
                "“SixSeven” virou uma parada meio aleatória no TikTok."+
    "</div></html>");
        jLabel2.setText("<html> <div style = 'width:350px;'>"+
                "É usado como nickname, “estética” ou só pra parecer diferente."+
    "</div></html>");
        jLabel3.setText("<html> <div style = 'width:350px;'>"+
                "Muita gente usa sem nem ter um significado claro."+
    "</div></html>");
        jLabel4.setText("<html> <div style = 'width:350px;'>"+
                "Basicamente é mais hype/meme do que algo profundo."+
    "</div></html>");
    }
    public void actionAura(){
        jLabel1.setText("<html> <div style = 'width:350px;'>"+
                "“Aura” é uma gíria usada na internet."+
    "</div></html>");
        jLabel2.setText("<html> <div style = 'width:350px;'>"+
                "Refere-se à energia ou presença que alguém transmite."+
    "</div></html>");
        jLabel3.setText("<html> <div style = 'width:350px;'>"+
                "Pode indicar carisma, estilo ou “vibe” da pessoa."+
    "</div></html>");
        jLabel4.setText("<html> <div style = 'width:350px;'>"+
                "Ex: “ele tem muita aura” = chama atenção naturalmente."+
    "</div></html>");
    }
    public void actionMogged(){
        jLabel1.setText("<html> <div style = 'width:350px;'>"+
                "“Mogged” é uma gíria da internet."+
    "</div></html>");
        jLabel2.setText("<html> <div style = 'width:350px;'>"+
                "Significa ser superado ou ofuscado por outra pessoa."+
    "</div></html>");
        jLabel3.setText("<html> <div style = 'width:350px;'>"+
                "Geralmente envolve aparência, altura ou estilo."+
    "</div></html>");
        jLabel4.setText("<html> <div style = 'width:350px;'>"+
                "Pode ser usada em memes, mas às vezes é meio tóxica."+
    "</div></html>");
    }
    public void actionSigma(){
        jLabel1.setText("<html> <div style = 'width:350px;'>"+
                "“Sigma” é uma gíria da internet."+
    "</div></html>");
        jLabel2.setText("<html> <div style = 'width:350px;'>"+
                "Refere-se a alguém independente e confiante."+
    "</div></html>");
        jLabel3.setText("<html> <div style = 'width:350px;'>"+
                "É visto como quem não segue a multidão."+
    "</div></html>");
        jLabel4.setText("<html> <div style = 'width:350px;'>"+
                "Também pode significar “lobo solitário”."+
    "</div></html>");
    }
}
