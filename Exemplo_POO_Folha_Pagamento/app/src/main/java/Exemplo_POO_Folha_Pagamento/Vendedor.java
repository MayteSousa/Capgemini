/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo_POO_Folha_Pagamento;

import java.util.Date;

/**
 *
 * @author Mayte
 */
public class Vendedor extends Funcionario{

    private int totaItensVendidos;
    private float comissaoPorItem;
    
    Vendedor(){
        super();
    }
    
    public float calcularSalario(){
        return super.getSalario() + (this.comissaoPorItem * this.totaItensVendidos);
    }

    public int getTotaItensVendidos() {
        return totaItensVendidos;
    }

    public void setTotaItensVendidos(int totaItensVendidos) {
        this.totaItensVendidos = totaItensVendidos;
    }

    public float getComissaoPorItem() {
        return comissaoPorItem;
    }

    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }
    
    
}
