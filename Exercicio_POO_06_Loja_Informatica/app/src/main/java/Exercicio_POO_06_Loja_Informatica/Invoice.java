/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_POO_06_Loja_Informatica;

/**
 *
 * @author Mayte
 */
public class Invoice {

    private int numero;
    private String descricao;
    private int qtd;
    private float precoUnt;

    public Invoice(int numero, String descricao, int qtd, float precoUnt) {
        this.setNumero(numero);
        this.setDescricao(descricao);
        this.setQtd(qtd);
        this.setPrecoUnt(precoUnt);
                
    }

    public double getInvoiceAmount() {

        double valor = qtd * precoUnt;
        return (valor);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {

        if (this.qtd < 0) {
            this.qtd = 0;
        } else {
            this.qtd = qtd;
        }
    }

    public float getPrecoUnt() {
        return precoUnt;
    }

    public void setPrecoUnt(float precoUnt) {
        if (this.precoUnt < 0) {
            this.precoUnt = 0.0f;
        } else {
            this.precoUnt = precoUnt;
        }
    }

}
