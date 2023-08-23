/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.Dobro;
import javax.swing.JOptionPane;

/**
 *
 * @author guilherme.mota
 */
public class Tela {
    public static void main(String[] args) {
        Dobro d = new Dobro();
        
        d.setValor(Integer.valueOf(JOptionPane.showInputDialog("Digite um Valor")));
        JOptionPane.showMessageDialog(null, d.calcularDobro());
    }
}
