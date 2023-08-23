/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.Notas;
import javax.swing.JOptionPane;


public class Tela {
    public static void main(String[] args){
        Notas c = new Notas();
        c.setNota1(Double.valueOf(JOptionPane.showInputDialog("Digite a primeira nota")));
        c.setNota2(Double.valueOf(JOptionPane.showInputDialog("Digite a segunda nota")));
        
        if(c.media() >= 6){
            JOptionPane.showMessageDialog(null, "Aprovado "+c.media());
        }
        
        if(c.media() < 4){
            JOptionPane.showMessageDialog(null, "Reprovado "+c.media());
        }
        
        if(c.media() >=4 && c.media() <6 ){
            JOptionPane.showMessageDialog(null, "Recuperação "+c.media());
        }
    }   
}
