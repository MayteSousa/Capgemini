/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio_POO_01_Pessoa;

import java.util.Date;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Pessoa objetoPessoa = new Pessoa();      
          
        System.out.println("Informações: "+objetoPessoa.imprimirDados("Mayte",03,10,1980, 1.74f ));
        System.out.println("Idade: "+objetoPessoa.calcularIdade(03,10,1980));
    }
    
    
}
