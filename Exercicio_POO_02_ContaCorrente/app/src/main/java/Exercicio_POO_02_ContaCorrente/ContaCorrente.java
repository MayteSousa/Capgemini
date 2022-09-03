package Exercicio_POO_02_ContaCorrente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mayte
 */
public class ContaCorrente {
    
    private int numConta;
    private String nomeCorrentista ;
    private float saldo;
    
    ContaCorrente(int numConta, String nomeCorrentista, float saldo ){
       this.numConta = 0;
       this.nomeCorrentista = "";
       //this.saldo = 0;
    }
    
    public String alterarNome(String novoNome ){
        this.nomeCorrentista = novoNome;
        
        return (nomeCorrentista);
    }
    
    public float depósito(float vlDeposito){
        this.saldo = this.saldo + vlDeposito;
        return saldo;
    }
    
    public float saque(float vlSaque){
        this.saldo = saldo - vlSaque;
        return saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
}
