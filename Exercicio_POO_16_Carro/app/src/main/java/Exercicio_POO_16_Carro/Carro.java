/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_POO_16_Carro;

/**
 *
 * @author Mayte
 */
public class Carro {
    float combustivel, distancia;

    public Carro(float combustivel, float distancia) {
        this.combustivel = combustivel;
        this.distancia = distancia;
    }

    public Carro(float combustivel) {
        this.combustivel = combustivel;
    }

    public float getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(float combustivel) {
        if( combustivel < 0 || combustivel > 50 ){
            this.combustivel = 0;
        }else{
            this.combustivel = combustivel;
        }        
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }
    
    float consumoCombustivel(){
        float combustivelRestante;
        
        combustivelRestante = combustivel - (distancia / 15);
        return combustivelRestante;
    }
}
