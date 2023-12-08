/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author guimo
 */
 public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

   
    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

  
    public double calcularSalario() {
        return salarioBase - (salarioBase * (imposto / 100));
    }
}
