/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author guilherme.mota
 */
public class Aluno {
    private String nome;
    private double matricula;
    private double idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public double getIdade() {
 
        return idade;
    }

    public void setIdade(double idade) {
         if(idade < 0){
         idade = 0;
        }else{
        this.idade = idade;
        }
    }
    
}
