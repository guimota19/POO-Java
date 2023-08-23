/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.Vendas;
import javax.swing.JOptionPane;

public class Tela {
    public static void main(String[] args){
        Vendas v = new Vendas();
        v.setValor(Double.valueOf(JOptionPane.showInputDialog("Digite o valor da venda")));
        v.setParcelas(Integer.valueOf(JOptionPane.showInputDialog("Digite o numero de parcelas")));
        JOptionPane.showMessageDialog(null, "Valor final " + v.valorFinal());
        
        
        
    }   
    
}
