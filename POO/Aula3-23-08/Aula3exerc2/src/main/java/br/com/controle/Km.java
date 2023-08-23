/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

public class Km {
    private double kminicial;
    private double kmfinal;
    private double litros;
    double cons;

    public double getKminicial() {
        return kminicial;
    }

    public void setKminicial(double kminicial) {
        this.kminicial = kminicial;
    }

    public double getKmfinal() {
        return kmfinal;
    }

    public void setKmfinal(double kmfinal) {
        this.kmfinal = kmfinal;
    }
    
    
    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }
    
    public double consumo(){
       return this.kmfinal - this.kminicial / this.litros;
        
       
    }
    
}
