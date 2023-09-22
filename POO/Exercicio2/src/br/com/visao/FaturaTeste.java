/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.Fatura;
import javax.swing.JOptionPane;
/**
 *
 * @author guimo
 */
public class FaturaTeste {
    public static void main(String[] args) {
    Fatura f = new Fatura();
    f.setNumero((JOptionPane.showInputDialog("Numero")));
    f.setDescricao((JOptionPane.showInputDialog("Descrição"))); 
    f.setPreco(Double.valueOf(JOptionPane.showInputDialog("Preço")));
    f.setQuantidade(Integer.valueOf(JOptionPane.showInputDialog("Quantidade")));
    JOptionPane.showMessageDialog(null, "Numero: " + f.getNumero() +
            "\nDescrição: " + f.getDescricao() +
            "\nPreço: " + f.getPreco() +
            "\nQuantidade: " + f.getQuantidade()+
            "\n\nTotal da Fatura: " + f.getTotalFatura());
    
            
    }
}
