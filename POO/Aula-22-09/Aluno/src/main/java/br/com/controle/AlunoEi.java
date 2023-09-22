/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;


public class AlunoEi extends Aluno {
    private String responsavel;
    

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public void setIdade(double idade) {
      if(idade >=4 && idade < 7){
        idade = 0;
        }else{
          this.idade = idade;
      }
    }

    
    public static void main(String args[]){
        System.out.println("Idade");
    }
    
}


