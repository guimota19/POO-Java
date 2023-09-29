/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        Fornecedor f = new Fornecedor();
    
        System.out.println("Digite o nome: ");
        String nomeF = sc.nextLine();
        f.setNome(nomeF);
        
        System.out.println("Digite o endereço: ");
        String end = sc.nextLine();
        f.setEndereco(end);
        
        System.out.println("Digite o telefone: ");
        String tel = sc.nextLine();
        f.setTelefone(tel);
        
        System.out.println("Digite o credito: ");
        double credito = sc.nextDouble();
        f.setValorCredito(credito);
        
        System.out.println("Digite a divida: ");
        double divida = sc.nextDouble();
        f.setValorDivida(divida);
        
        System.out.println("Informações Fornecedor: "+f.toString());
        
    }
}
