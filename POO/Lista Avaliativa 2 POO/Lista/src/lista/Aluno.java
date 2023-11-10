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
public class Aluno extends Pessoa {
  
    private double nota;
    private Curso curso;

    public Aluno(String nome, String cpf, String email, List<Telefone> telefones, Endereco endereco, double nota) {
        super(nome, cpf, email, telefones, endereco);
        this.nota = nota;
    }
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
     @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", nota=" + nota +
                ", curso=" + (curso != null ? curso.getNome() : "Não matriculado") +
                '}';
    }

    public void imprimir() {
        System.out.println("Aluno: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Nota: " + nota);
        if (curso != null) {
            System.out.println("Curso: " + curso.getNome());
        } else {
            System.out.println("Curso: Não matriculado em nenhum curso");
        }
    }
}

