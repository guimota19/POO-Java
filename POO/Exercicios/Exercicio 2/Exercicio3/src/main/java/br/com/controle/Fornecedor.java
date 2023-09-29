/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author guilherme.mota
 */
public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    
    public double obterSaldo(){
        double saldo = getValorCredito() - getValorDivida();
        
        return saldo;
    }

    @Override
    public String toString(){
        return String.format(""+super.toString()+
                            "\nCredito: "+getValorCredito()+
                            "\nDivida: "+getValorDivida()+
                            "\nSaldo: "+obterSaldo());
    }
    
    
}
