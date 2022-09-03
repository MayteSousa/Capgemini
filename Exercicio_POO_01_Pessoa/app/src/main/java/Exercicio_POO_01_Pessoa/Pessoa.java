/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_POO_01_Pessoa;
    import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author Mayte
 */
public class Pessoa {
    
    private String nome;
    //private String dataNasc;
    private int dia, mes, ano;
    private float altura;
    
    public String imprimirDados(String nome, int dia, int mes, int ano, float altura){
        this.nome = nome;
        //this.dataNasc = dataNasc;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.altura = altura;
        
        return ( "Nome: "+nome + " Data Nascimento: "+dia+"/"+mes+"/"+ano+ " Altura: " +altura );
        // System.out.println("Nome: "+nome + " Data Nascimento: "+dia+"/"+mes+"/"+ano+ " Altura: " +altura);
         //System.out.println("Nome: "+nome + " Data Nascimento: "+dia+"/"+mes+"/"+ano+ " Altura: " +altura);
         //System.out.println("Data Nascimento: "+dia+mes+ano);
         //System.out.println("Altura: " +altura);
    }

    public int calcularIdade(int dia, int mes, int ano) {
        return (int) ChronoUnit.YEARS.between(LocalDate.of(ano, mes, dia), LocalDate.now());
    }
    
    Pessoa(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }


    
    
    
}
