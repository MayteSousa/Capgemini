/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio_13_Maior_10;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int n1;
        
        System.out.println("Informe um n�mero");
        n1 = leitor.nextInt();
        
        if (n1 > 10){
            System.out.println(n1+ "� maior que 10");
        }
    }
}
