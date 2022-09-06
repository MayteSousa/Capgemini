/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_POO_09_Voo;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Mayte
 */
public class Voo {
    private int voo;
    private String data;
    private String horario;
    private int qtdPassageiros, poltrona;
    private char[] vagas = new char[100];

    public Voo(int voo, String data, String horario, int qtdPassageiros) {
        this.voo = voo;
        this.data = data;
        this.horario = horario;
        this.qtdPassageiros = qtdPassageiros;
    }    
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    } 

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        if( qtdPassageiros <= 100){
            this.qtdPassageiros = qtdPassageiros;   
        }
    }        

    public char[] getVagas() {
        return vagas;
    }

    public void setVagas(char[] vagas) {
        this.vagas = vagas;
    }

           
    
    public int ProximoLivre(){
        int aux=0, i=0;
        
        while( vagas[i] == 0){
            i++;
        }
        return(vagas[i--]);
    }
    
    public Boolean verifica(int poltrona){
        if (vagas[poltrona] == 0){
            return (false);
        }else{
            return (true);
        }        
    }
    
    public Boolean ocupa(int poltrona){
        if ( vagas[poltrona] == 0){
            vagas[poltrona] = 'x';
            return (true);          
        }else{
            return(false);
        }            
    }
    
    public int vagas(){
        int cont = 0;
        
        for ( int i = 0; i < 100; i++) {
           if ( vagas[i] == 0  ){
              cont++;
           }
       }
       return (cont);
    }
    public int getVoo(){
        return (this.voo);
    }
    
}
