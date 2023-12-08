/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.exerc4;

/**
 *
 * @author guimo
 */
// Classe Veículo
public class Veiculo {
    private String modelo;
    private int ano;

    // Construtor
    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

// Classe Carro (subclasse de Veículo)
public class Carro extends Veiculo {
    private String marca;
    private int numPortas;

    // Construtor
    public Carro(String modelo, int ano, String marca, int numPortas) {
        super(modelo, ano);
        this.marca = marca;
        this.numPortas = numPortas;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
}

// Classe CarroEsportivo (subclasse de Carro)
public class CarroEsportivo extends Carro {
    private String tipoMotor;
    private int velocidadeMax;

    // Construtor
    public CarroEsportivo(String modelo, int ano, String marca, int numPortas, String tipoMotor, int velocidadeMax) {
        super(modelo, ano, marca, numPortas);
        this.tipoMotor = tipoMotor;
        this.velocidadeMax = velocidadeMax;
    }

    // Getters e Setters
    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }
}

// Classe de Teste
public class TesteVeiculo {
    public static void main(String[] args) {
        // Criando uma instância de CarroEsportivo
        CarroEsportivo carroEsportivo = new CarroEsportivo("Model X", 2023, "Tesla", 2, "Elétrico", 250);

        // Acessando os dados
        System.out.println("Modelo: " + carroEsportivo.getModelo());
        System.out.println("Ano: " + carroEsportivo.getAno());
        System.out.println("Marca: " + carroEsportivo.getMarca());
        System.out.println("Número de Portas: " + carroEsportivo.getNumPortas());
        System.out.println("Tipo de Motor: " + carroEsportivo.getTipoMotor());
        System.out.println("Velocidade Máxima: " + carroEsportivo.getVelocidadeMax() + " km/h");
    }
}
