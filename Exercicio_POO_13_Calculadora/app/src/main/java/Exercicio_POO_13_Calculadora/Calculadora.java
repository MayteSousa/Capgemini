/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_POO_13_Calculadora;

/**
 *
 * @author Mayte
 */
public class Calculadora {
       float n1, n2, resultado;

    public Calculadora(float n1, float n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
            
    float soma(float n1, float n2){        
                
        return (resultado = n1 + n2);
    }
    
    float subtracao(float n1, float n2){
        
        return (resultado = n1 - n2);
    }
    
    float multiplicacao(float n1, float n2){       
        
        return (resultado = n1 * n2);
    }

    float divisao(float n1, float n2){
        
        return (resultado = n1 / n2);
    }    
}
