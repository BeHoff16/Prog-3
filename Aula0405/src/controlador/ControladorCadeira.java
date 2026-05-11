/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Cadeira;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author Discentes
 */
public class ControladorCadeira {
    JTextField jTextFieldID, jTextFieldNome, jTextFieldCPF, jTextFieldTelefone;
    JList<String> jListCadeira;
    
    ArrayList<Cadeira> listaDeCadeira = new ArrayList<>();
    DefaultListModel defaultListModel = new DefaultListModel();

    public ControladorCadeira(JTextField jTextfielID, JTextField jTextFieldNome, JTextField jTextFieldCPF, JTextField jTextFieldTelefone, JList jListCadeira) {
        this.jTextFieldID = jTextfielID;
        this.jTextFieldNome = jTextFieldNome;
        this.jTextFieldCPF = jTextFieldCPF;
        this.jTextFieldTelefone = jTextFieldTelefone;
        this.jListCadeira = jListCadeira;
    }
    
    public void Salvar(){
        int id = Integer.parseInt(jTextFieldID.getText());
        String nome = jTextFieldNome.getText();
        String cpf = jTextFieldCPF.getText();
        String telefone = jTextFieldTelefone.getText();
        Cadeira cadeira = new Cadeira(id, nome, cpf, telefone);
        listaDeCadeira.add(cadeira);
        CarregarLista();
    }
    private void CarregarLista(){
        defaultListModel = new DefaultListModel();
        ArrayList<String> temp = new ArrayList<>();
        for (Cadeira cadeiraTemp: listaDeCadeira) {
            temp.add(cadeiraTemp.getNome());
        }
        Collections.sort(temp);
        defaultListModel.addAll(temp);
        jListCadeira.setModel(defaultListModel);
        }
    
    public void Limpar(){
            jTextFieldID.setText("");
            jTextFieldNome.setText("");
            jTextFieldCPF.setText("");
            jTextFieldTelefone.setText("");
    }
          
}
