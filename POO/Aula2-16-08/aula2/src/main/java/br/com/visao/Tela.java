/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.Calculos;
import javax.swing.JOptionPane;

public class Tela {
    public static void main(String[] args){
      Calculos c = new Calculos();
      c.setNumero1(Double.valueOf(JOptionPane.showInputDialog("Digite um valor")));
      c.setNumero2(Double.valueOf(JOptionPane.showInputDialog("Digite outro valor")));
      JOptionPane.showMessageDialog(null, "A soma foi "+c.somar());
    }
}
