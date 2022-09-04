/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_POO_07_Funcionario;

/**
 *
 * @author Mayte
 */
public class Funcionario {
    
    private String nome, sobrenome;
    private float salarioMensal;

    public Funcionario(String nome, String sobrenome, float salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public float salarioAnual(){
        return(salarioMensal * 12);
    }
    
    public float calcularAumento(){
        return ( salarioMensal = salarioMensal + ((salarioMensal*10)/100));
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        if ( this.salarioMensal < 0){
            this.salarioMensal = 0.0f;
        }
        else{
            this.salarioMensal = salarioMensal;
        }
    }
    
    
    
    
    
}
