/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_POO_12_Agenda;

/**
 *
 * @author Mayte
 */
public class Agenda {
    private String nome;
    private Contato[] contato = new Contato[3];
    private int idade;
    private float altura;

    public Agenda(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContato() {
        return contato;
    }

    public void setContato(Contato[] contato) {
        this.contato = contato;
    }
    
    public String obterInfo(){
        String info = "Nome = " + nome + "\n";
        
        if (contato != null){
            for (Contato c : contato){
                info += c.imprimirAgenda()+ "\n";
            }
        }
        
        return info;
    }  
    
    


    public void armazenarPessoa(String nome, int idade, float altura){ 

//armazena a pessoa em um array
       
           this.nome = nome;
           this.idade = idade;
           this.altura = altura;
    }  
    
    public int buscarPessoa(String nome){ 
// informa em que posi??o da agenda est? a pessoa
        int posicao=0;
        int i = 0;
        
        do{
            if (this.nome == nome){
                i++;
                posicao = i;
                
            }
        }while( posicao == 0);
        
        return(posicao);        
    }
    
    

    

}
