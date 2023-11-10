/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author guimo
 */
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        Telefone telefoneProf = new Telefone("Celular", "123", "456789");
        Telefone telefoneAluno = new Telefone("Fixo", "321", "987654");

        Endereco enderecoProf = new Endereco("Rua Professores", "Cidade Prof", "Estado Prof");
        Endereco enderecoAluno = new Endereco("Rua Alunos", "Cidade Aluno", "Estado Aluno");

        Professor professor1 = new Professor("Prof 1", "123456789", "prof1@example.com", List.of(telefoneProf), enderecoProf, "Doutor", 5000.0);
        Professor professor2 = new Professor("Prof 2", "987654321", "prof2@example.com", List.of(telefoneProf), enderecoProf, "Mestre", 4000.0);

        Curso curso = new Curso("Ciência da Computação");
        curso.addProfessores(List.of(professor1, professor2));

        Aluno aluno1 = new Aluno("Aluno 1", "111222333", "aluno1@example.com", List.of(telefoneAluno), enderecoAluno, 8.5);
        Aluno aluno2 = new Aluno("Aluno 2", "444555666", "aluno2@example.com", List.of(telefoneAluno), enderecoAluno, 7.5);

        aluno1.setCurso(curso);
        aluno2.setCurso(curso);

        Disciplina disciplina = new Disciplina("Programação Java", List.of(aluno1, aluno2), List.of(curso), professor1);

        System.out.println("Informações da Disciplina:");
        System.out.println(disciplina);

        System.out.println("\nInformações dos Professores:");
        System.out.println(professor1);
        System.out.println(professor2);

        System.out.println("\nInformações dos Alunos:");
        System.out.println(aluno1);
        System.out.println(aluno2);
    }
}





