/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3;

/**
 *
 * @author guimo
 */
import java.util.Scanner;

public class dvd extends Midia {
    private int nFaixas;

   
    public dvd() {
        this(0, 0.0, "Nenhum", 0); 
    }

    public dvd(int codigo, double preco, String name, int nFaixas) {
        super(codigo, preco, name); 
        setFaixas(nFaixas);
    }

    public String getTipo() {
        return "DVD: ";
    }

    public String getDetalhes() {
        return super.getDetalhes() + "\n" +
                "Número de faixas: " + nFaixas + "\n";
    }

    public void setFaixas(int nfaix) {
        nFaixas = (nfaix > 0) ? nfaix : 0;
    }

 
    public void inserirDados() {
    
        super.inserirDados();

        Scanner in = new Scanner(System.in);

    
        System.out.printf("\nEntre com o número de faixas: ");
        int nfaix = in.nextInt();

   
        setFaixas(nfaix);

        
        in.close();
    }
}