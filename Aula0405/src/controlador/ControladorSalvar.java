package controlador;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import model.Projeto;

public class ControladorSalvar {
    public JTextField jTextFieldID, jTextFieldCPF, jTextFieldNome, jTextFieldTelefone;
    public JButton jButton1;
    public JList<String> jList1;
    ArrayList<Projeto> ListaDeProjetos = new ArrayList<>();
    
    public void Salvar() {
        int id = Integer.parseInt(jTextFieldID.getText());
        String cpf = jTextFieldCPF.getText();
        String nome = jTextFieldNome.getText();
        String tel = jTextFieldTelefone.getText();
        Projeto p = new Projeto(id, cpf, nome, tel);
        ListaDeProjetos.add(p);
    }
    
    public void CarregarLista() {
        DefaultListModel<String> defaultListModel = new DefaultListModel<>();
        ArrayList<String> listaAtualizada = new ArrayList<>();
        
        for (Projeto p : ListaDeProjetos) {
            listaAtualizada.add(p.getNome());
        }
        
        Collections.sort(listaAtualizada);
        defaultListModel.addAll(listaAtualizada);
        jList1.setModel(defaultListModel);
    }
}