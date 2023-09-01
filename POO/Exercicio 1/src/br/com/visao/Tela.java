/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.CadastroCarro;
import javax.swing.JOptionPane;


public class Tela {
    public static void main(String[] args) {
        CadastroCarro c = new CadastroCarro();
        c.setMarca(String.valueOf(JOptionPane.showInputDialog("Informe a marca")));
        c.setModelo(String.valueOf(JOptionPane.showInputDialog("Informe o modelo")));
        c.setAno(Integer.valueOf(JOptionPane.showInputDialog("Informe o Ano")));
        JOptionPane.showMessageDialog(null,"Marca: " + c.getMarca() + "\nModelo: " + c.getModelo() + "\nAno: " + c.getAno());
    }
    
}
