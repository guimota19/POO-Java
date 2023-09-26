/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 * 
 *Crie uma classe chamada Livro que tenha os atributos: titulo, autor e numPaginas. Adicione um método chamado imprimirInfo() 
 * que imprime todas as informações do livro. Crie um construtor que inicialize todos os atributos. Crie um objeto da classe Livro e 
 * imprima suas informações usando o método imprimirInfo().
 * 
 */
public class Livro {
    private String titulo;
    private String autor;
    private int numPag;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    
    
    
}
