/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_POO_10_Jogador_Futebol;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author Mayte
 */
public class JogadorFutebol {


    private String nome;
    private String posicao;
    private int diaNasc, mesNasc, anoNasc;
    private String nacionalidade;
    private float altura;
    private float peso; 
    private int idade;

    public JogadorFutebol(String nome, String posicao, int diaNasc, int mesNasc, int anoNasc, String nacionalidade, float altura, float peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public int getDiaNasc() {
        return diaNasc;
    }

    public void setDiaNasc(int diaNasc) {
        this.diaNasc = diaNasc;
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    public String imprimirDados(){
        return (this.nome+ ", " +
        this.posicao + ", " +
        this.diaNasc + ", " +
        this.mesNasc + ", " +
        this.anoNasc + ", " +
        this.nacionalidade + ", " +
        this.altura + ", " +
        this.peso );
    }
    
    public int calcularIdade(){
        Date date = new Date(); // sua instancia Date
        Calendar calendar = Calendar.getInstance();
        
       
        int anoAtual = calendar.get(calendar.YEAR);
        int mesAtual = calendar.get(calendar.MONTH);
        int diaAtual = calendar.get(calendar.DAY_OF_MONTH);              

        if (anoAtual >= this.anoNasc && mesAtual > this.mesNasc && diaAtual > this.diaNasc){
                    idade = anoAtual - anoNasc;
        }else{
            idade = anoAtual - anoNasc-1;
        }
        
        return (idade);
    }
    
    public int tempoAposentar(){
        int tempoAposentar=0;
        if (this.posicao  == "Defesa"&& idade <= 40){
            tempoAposentar = idade - 40;
        }else{
            if(this.posicao == "Meio Campo" && idade <= 38){
                tempoAposentar = idade - 38;
            }else{
                if(this.posicao == "Atacante" && idade <= 35){
                    tempoAposentar = idade - 35;
                }
                else{
                    tempoAposentar = 0;
                }                
            }
        }
        return(tempoAposentar);
        
    }
}


