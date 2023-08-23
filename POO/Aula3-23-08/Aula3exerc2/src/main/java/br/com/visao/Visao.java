/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.Km;
import javax.swing.JOptionPane;

public class Visao {
    public static void main(String[] args) {
        Km k = new Km();
        k.setKminicial(Double.valueOf(JOptionPane.showInputDialog("Km inicial")));
        k.setKmfinal(Double.valueOf(JOptionPane.showInputDialog("Km final")));
        k.setLitros(Double.valueOf(JOptionPane.showInputDialog("Quantidade de Litros")));
        JOptionPane.showMessageDialog(null, "Consumo medio: " + k.consumo());
    }
}
