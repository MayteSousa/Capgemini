/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_POO_14_Fatura;

/**
 *
 * @author Mayte
 */
public class Fatura {
    String numero, descrição;
    int quantidade;
    double preco;

    public Fatura(String numero, String descrição, int quantidade, double preco) {
        this.numero = numero;
        this.descrição = descrição;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0){
            quantidade=0;
        }else{
            this.quantidade = quantidade;           
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0 ){
            preco = 0;
        }else{
            this.preco = preco;            
        }        
    }
    
    double getTotalFatura(){
        double valorFatura; 
        
        valorFatura = this.quantidade * this.preco;
        
        if (valorFatura < 0){
            valorFatura = 0;
        }
        
        return valorFatura;
    }
}
