/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author guimo
 */
public class Animal {
    private String nome;
    private double peso;

    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

 

    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", peso=" + peso + "]";
    }
}

// Peixe class (subclass de Animal)
public class Peixe extends Animal {
    private String tipoHabitat;

    public Peixe(String nome, double peso, String tipoHabitat) {
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }

    // Getters e Setters
    // ...

    @Override
    public String toString() {
        return super.toString() + ", Peixe [tipoHabitat=" + tipoHabitat + "]";
    }
}

// Cachorro class (subclass de Animal)
public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cachorro [raca=" + raca + "]";
    }
}


public class Teste {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal1", 10.5);
        Peixe peixe = new Peixe("Peixe1", 0.5, "água doce");
        Cachorro cachorro = new Cachorro("Cachorro1", 15.2, "Labrador");

        System.out.println(animal);
        System.out.println(peixe);
        System.out.println(cachorro);
    }
}