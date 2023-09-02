/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.Livro;
import javax.swing.JOptionPane;


public class Tela {
    public static void main(String[] args) {
    Livro l = new Livro();
    l.setTitulo(JOptionPane.showInputDialog("Titulo"));
    l.setAutor(JOptionPane.showInputDialog("Autor"));
    l.setNumPag(Integer.valueOf(JOptionPane.showInputDialog("Numero de páginas")));
    JOptionPane.showMessageDialog(null, "Titulo " + l.getTitulo() + "\nAutor " + l.getAutor()+ "\nPáginas " + l.getNumPag() );
  
    }
    
}
