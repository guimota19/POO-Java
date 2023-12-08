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

public class CadastroMidia {
    public static void main(String args[]) {
      
        Midia[] lista = new Midia[10];

        int opcao;

   
        for (int i = 0; i < 2; i++) {
          
            System.out.println("Digite 1 para CD e 2 para DVD");
            Scanner in = new Scanner(System.in);
            opcao = in.nextInt();

            if (opcao == 1)
                lista[i] = new cd();
            else 
                lista[i] = new dvd();

            lista[i].inserirDados(); 

            
            in.close();
        }

   
        for (int i = 0; i < 2; i++)
            System.out.println(lista[i].getDetalhes());
    }
}
