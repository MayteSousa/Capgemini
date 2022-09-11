/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_POO_13_Calculadora;

/**
 *
 * @author Mayte
 */
public class CalculadoraCientifica {
        double resultado;    

    public CalculadoraCientifica(float resultado) {
        this.resultado = resultado;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }            
    
    double raizQuadrada(int n1){    
        resultado = Math.sqrt(n1);
        return (resultado);    
    }
    
    double potencia(int n1, int n2){
         resultado = Math.pow(n1, n2);
         
        return (resultado);
    }
}
