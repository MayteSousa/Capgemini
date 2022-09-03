package Exercicio_POO_03_BombaCombustivel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mayte
 */
public class BombaCombustivel {
    
    private String tipoCombustível;
    private float vlLitro;
    private float qtdcombustível;
    
    BombaCombustivel(String tipoCombustível, float vlLitro, float qtdcombustível){
       this.tipoCombustível = tipoCombustível;
       this.vlLitro = vlLitro;
       this.qtdcombustível = qtdcombustível;
        
    }
    
    
    public float abastecerPorValor(float valor){
        return (qtdcombustível = valor / vlLitro);
    }
    
    public float abastecerPorLitro(float litros){
        float  pagar;
        
        return (pagar = litros * vlLitro);
    }
    
    public float alterarValor(float novoVlLitro){
        return (vlLitro = vlLitro + (vlLitro*novoVlLitro) / 100);
    }
    
    public String alterarCombustivel(String tpCombustível){
        
        return (tipoCombustível = tpCombustível);
    }
    
    public float alterarQuantidadeCombustivel(float qtdBomba){
        return qtdBomba;
    }
}
