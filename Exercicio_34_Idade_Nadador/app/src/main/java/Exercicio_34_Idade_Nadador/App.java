/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio_34_Idade_Nadador;
import java.util.Scanner;
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade;
        
        System.out.println("Informe a idade");
        idade = leitor.nextInt();
        
        if( idade >= 5 && idade <= 7 ){
            System.out.println("Infantil A");
        }else{
            if( idade >= 8 && idade <= 10 ){
                System.out.println("Infantil B");
            }else{
                if( idade >= 11 && idade <= 13 ){
                    System.out.println("Juvenil A");
                }else{
                    if( idade >= 14 && idade <= 17 ){
                        System.out.println("Juvenil B");
                    }else{
                        if( idade >= 18 && idade <= 25 ){
                            System.out.println("S�nior");
                        }
                        else{
                            System.out.println("idade fora da faixa et�ria");
                        }
                    }
                }
            }    
        }
    }
}