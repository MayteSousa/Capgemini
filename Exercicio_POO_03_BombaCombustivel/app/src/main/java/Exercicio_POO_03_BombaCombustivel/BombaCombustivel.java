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
    
    private String tipoCombust�vel;
    private float vlLitro;
    private float qtdcombust�vel;
    
    BombaCombustivel(String tipoCombust�vel, float vlLitro, float qtdcombust�vel){
       this.tipoCombust�vel = tipoCombust�vel;
       this.vlLitro = vlLitro;
       this.qtdcombust�vel = qtdcombust�vel;
        
    }
    
    
    public float abastecerPorValor(float valor){
        return (qtdcombust�vel = valor / vlLitro);
    }
    
    public float abastecerPorLitro(float litros){
        float  pagar;
        
        return (pagar = litros * vlLitro);
    }
    
    public float alterarValor(float novoVlLitro){
        return (vlLitro = vlLitro + (vlLitro*novoVlLitro) / 100);
    }
    
    public String alterarCombustivel(String tpCombust�vel){
        
        return (tipoCombust�vel = tpCombust�vel);
    }
    
    public float alterarQuantidadeCombustivel(float qtdBomba){
        return qtdBomba;
    }
}
