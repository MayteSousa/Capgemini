/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio_32_Tipo_Triangulo;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a, b, c;
        
        System.out.println("Informe A");
        a = leitor.nextInt();
        
        System.out.println("Informe B");
        b = leitor.nextInt();
        
        System.out.println("Informe C");
        c = leitor.nextInt();
        
        if ( (a < (b+c)) && (b < (a+c)) && (c < (a+b))){
            if( a == b && b == c && c == a){
                System.out.println("Tri�ngulo Equil�tero");
            }else{
                if( a == b || b == c || c == a){
                    System.out.println("Tri�ngulo Is�sceles");
                }else{
                    if( a != b && b != c && c != a){
                        System.out.println("Tri�ngulo Escaleno");
                    }
                }
                
            }
        }else{
            System.out.println("N�o s�o lados de um tri�ngulo");
        }
    }
}
