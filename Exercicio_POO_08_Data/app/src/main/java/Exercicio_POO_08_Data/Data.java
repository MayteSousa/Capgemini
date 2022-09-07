/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_POO_08_Data;

import java.util.Calendar;
import java.util.Date;



/**
 *
 * @author Mayte
 */
public class Data {
    
    private int dia, mes, ano;
    Date date = new Date(); // sua instancia Date
    Calendar calendar = Calendar.getInstance();
//calendar.setTime(date);
        
        int anoAtual = calendar.get(calendar.YEAR);
        int mesAtual = calendar.get(calendar.MONTH);
        int diaAtual = calendar.get(calendar.DAY_OF_MONTH);    

    public Data(int dia, int mes, int ano) {
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if ( dia > 0 && dia < 31){
            this.dia = dia;
        }else{
            this.dia = 01;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if ( mes > 0 && mes < 12){
            this.mes = mes;
        }else{
            this.mes = 01;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if ( ano > 0 && ano <= 2022){
            this.ano = ano;
        }else{
            this.ano = 0001;
        } 
    }
    
    public int compara(int dia, int mes, int ano){                
        
        if ( diaAtual == dia && mesAtual == mes && anoAtual == ano){
            return (0);
        }else{
            if(anoAtual > ano ){
                return (1);
            }
            else{
                if (anoAtual == ano && mesAtual > mes){
                    return (1);
                }
                else{
                    if (anoAtual == ano && mesAtual == mes && diaAtual > dia){
                       return (1);     
                    }else{
                        if(ano > anoAtual ){
                            return (-1);
                        }
                    }
                }
            }
        }
     return (0);       
    }
    
    public String GetMesExtenso(){
        String mesExtenso = "";
        
        switch(this.mesAtual){
            case 1:
                mesExtenso = "Janeiro";
                break;
                
            case 2:
                mesExtenso = "Fevereiro";
                break;

            case 3:
                mesExtenso = "Março";
                break;

            case 4:
                mesExtenso = "Abril";
                break;

            case 5:
                mesExtenso = "Maio";
                break;

            case 6:
                mesExtenso = "Junho";
                break;                
                
            case 7:
                mesExtenso = "Julho";
                break;

            case 8:
                mesExtenso = "Agosto";
                break;

            case 9:
                mesExtenso = "Setembro";
                break;

            case 10:
                mesExtenso = "Outubro";
                break;

            case 11:
                mesExtenso = "Novembro";
                break;

            case 12:
                mesExtenso = "Dezembro";
                break;
                
        }
        
        return (mesExtenso);
    }

    public Boolean IsBissexto(){
        
        if( (( anoAtual % 4) == 0) && (( anoAtual % 100) != 0) ) {
            return (true);
        }
        else{
            return (false);
        }                    
    }
    
    
    public String clone(){
        int dia = this.dia;
        int mes = this.mes;
        int ano = this.ano;
        
        return (dia+"/"+mes+"/"+ano);
    }
}
