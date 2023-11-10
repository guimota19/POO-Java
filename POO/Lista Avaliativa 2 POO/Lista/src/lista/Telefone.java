/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author guimo
 */

public class Telefone {
    private String tipo;
    private String ddd;
    private String numero;

    public String getTelefone() {
        return tipo;
    }

    public void setTelefone(String telefone) {
        this.tipo = telefone;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    @Override
    
    public String toString() {
        return "Telefone{" +
                "telefone='" + tipo + '\'' +
                ", ddd='" + ddd + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
    
    
}
