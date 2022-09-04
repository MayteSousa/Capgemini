/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_POO_05_Aluno;

/**
 *
 * @author Mayte
 */
public class Aluno {
    String matricula, nome;
    float p1, p2, tp, media;
    
    Aluno(){

    }
    
    public float media(String matricula, String nome, float p1, float p2, float tp){
                
        this.nome = nome;
        this.matricula = matricula;
        this.p1 = p1;
        this.p2 = p2;
        this.tp = tp;
        
        //media = ((p1 * 2.5f) + (p2 * 2.5f) + (tp * 2.0f))/(p1 + p2 + tp);
        media = (p1 + p2 + tp) / 3;
        return (media);
    }
    
    public float pfinal(){
        float pf;
        
        if( media  >=0 && media < 6){
            pf = ((10 - media)-6)*25f;
            return pf;
        }else{
            return (0.0f);
        }        
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }

    public float getTp() {
        return tp;
    }

    public void setTp(float tp) {
        this.tp = tp;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    
    
}
