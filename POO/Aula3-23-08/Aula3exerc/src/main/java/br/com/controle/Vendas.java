/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author guilherme.mota
 */
public class Vendas {
    private double valor;
    private int parcelas;
        double resultado; 

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
    
    public double valorFinal(){
        if(this.parcelas <= 1){
            resultado = this.valor - (this.valor*0.1); 
            
        }else if(this.parcelas > 1 && this.parcelas <= 3){
            resultado = this.valor + (this.valor*0.05); 
 
        }else if(this.parcelas > 3){
            resultado = this.valor + (this.valor*0.1); 
            
        }
        return resultado;
    }
}





