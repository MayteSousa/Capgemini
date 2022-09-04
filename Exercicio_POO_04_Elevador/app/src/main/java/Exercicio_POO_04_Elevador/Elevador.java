/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_POO_04_Elevador;

/**
 *
 * @author Mayte
 */
public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int qtdPessoas;
    
    Elevador(){
        andarAtual = 0;
        qtdPessoas = 0;
    }
    
    public void inicializa(int capacidade, int totalAndares){
       this.capacidade = capacidade;
       this.totalAndares = totalAndares;
    }
    
    public Boolean entra(int qtdPessoasEntra){
        if (qtdPessoasEntra  >= 0 && qtdPessoasEntra <= this.capacidade){
            this.qtdPessoas = this.qtdPessoas + qtdPessoasEntra;
            return (true);
        }
        else{
            return (false);
        }
    }
    
    public Boolean sai(int qtdPessoasSai){
        if (qtdPessoasSai  >= 1 && qtdPessoasSai <= this.capacidade){
            this.qtdPessoas = this.qtdPessoas - qtdPessoasSai;
            return (true);
        }
        else{
            return (false);
        }        
    }
    
    public Boolean sobe(int andar){
        if(andar >= 0 && andar < this.totalAndares){
            this.andarAtual = andar;
            return (true);
        }else{
            return (false);
        }
    }
    
    public Boolean desce(int andar){
        if(andar > 0 && andar <= this.totalAndares){
            this.andarAtual = andar;
            return (true);
        }else{
            return (false);
        }        
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }
    
    
}
