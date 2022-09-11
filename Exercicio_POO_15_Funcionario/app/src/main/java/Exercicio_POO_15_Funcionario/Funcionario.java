/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_POO_15_Funcionario;

/**
 *
 * @author Mayte
 */
public class Funcionario {
    String nome, sobrenome;
    double salarioMensal;

    public Funcionario(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
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

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal() {
        this.salarioMensal = salarioMensal;
    }
    
    double calcularSalarioAnual(){
        double salarioAnual = this.salarioMensal*12;
        
        return salarioAnual;        
    }
    
    double calcularAumento(){
        double aumento;
        
        aumento = ((this.salarioMensal*10)/100);
        salarioMensal = this.salarioMensal + aumento;
        return aumento;
    }
}
