/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo_POO_IMC;

/**
 *
 * @author Mayte
 */
public class Pessoa {
        //ATRIBUTOS
    private float peso;
    private float altura;
     
    //CONSTRUTOR
    public Pessoa(float peso, float altura){
        this.peso = peso;
        this.altura = altura;
    
    }
        
    
    //METODOS
    public float calcularIMC(){
        float imc = peso / ( altura * altura);
        
        return imc;
    }

    //METODOS ACESSORES
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
