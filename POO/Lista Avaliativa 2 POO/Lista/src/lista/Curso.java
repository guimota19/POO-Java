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

public class Curso {
   
    private String nome;
    private List<Professor> professores;

    public Curso(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void addProfessores(List<Professor> novosProfessores) {
        this.professores.addAll(novosProfessores);
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Curso{nome='").append(nome).append("', professores=[");
        for (Professor professor : professores) {
            stringBuilder.append(professor.getNome()).append(", ");
        }
        if (!professores.isEmpty()) {
            stringBuilder.setLength(stringBuilder.length() - 2); // Remove a vírgula extra no final
        }
        stringBuilder.append("]}");
        return stringBuilder.toString();
    }

    public void imprimirCurso() {
        System.out.println("Curso: " + nome);
        System.out.println("Professores:");
        for (Professor professor : professores) {
            System.out.println("- " + professor.getNome() + " (Titulação: " + professor.getTitulacao() + ")");
        }
    }
}

