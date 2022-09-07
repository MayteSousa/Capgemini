/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_POO_11_Ingresso;

/**
 *
 * @author Mayte
 */
public class IngressoVip extends Ingresso{
    
    private float adicional;

    public IngressoVip(float valor, float adicional) {
        super(valor);
        this.adicional = adicional;
    }



    public float imprimirValorVip(){
                
        this.adicional = this.getValor() + ((this.adicional*this.getValor())/100);
                
        return (this.adicional);
    }    
    
    public float getAdicional() {
        return adicional;
    }

    public void setAdicional(float adicional) {
        this.adicional = adicional;
    }


    
}
