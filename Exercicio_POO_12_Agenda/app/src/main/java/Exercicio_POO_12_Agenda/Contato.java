/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_POO_12_Agenda;

/**
 *
 * @author Mayte
 */
public class Contato{

    private String nome;
    private int idade;
    private float altura;

    public Contato(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

        public String imprimirAgenda(){// imprime os dados de todas as pessoas da agenda 

        return ("Nome: " + this.nome + " Idade: " + this.idade + " Altura: " + this.altura);        
    }
        
    public String imprimirPessoa(int index){ // imprime os dados da pessoa que est? na posi??o ?i? da agenda.
        
           return ("Nome: " + this.nome + "Idade: " + this.idade + "Altura: " + this.altura);
        
    }        
}
