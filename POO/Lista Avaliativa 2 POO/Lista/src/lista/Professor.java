/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author guimo
 */
import java.util.List;

public class Professor extends Pessoa {
    private String titulacao;
    private double salario;

    public Professor(String nome, String cpf, String email, List<Telefone> telefones, Endereco endereco, String titulacao, double salario) {
        super(nome, cpf, email, telefones, endereco);
        this.titulacao = titulacao;
        this.salario = salario;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", titulacao='" + titulacao + '\'' +
                ", salario=" + salario +
                '}';
    }
    
    public void imprimir() {
        System.out.println("Professor: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Titulação: " + titulacao);
        System.out.println("Salário: " + salario);
    }
}
