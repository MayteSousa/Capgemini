/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio_POO_16_Carro;
import java.util.Scanner;
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        float combustivel, distancia;
        
        /*
        System.out.println("informe a quantidade abastecida: ");
        combustivel = leitor.nextFloat();
        
        
        System.out.println("Informe a Distancia percorrida (km)");
        distancia = leitor.nextFloat();
        */
        Carro objCarro = new Carro(20, 200);
        System.out.println("Abastecendo 20 L, Percorrendo 200 km Combustivel restante: " + objCarro.consumoCombustivel() + "(L)");
        
        Carro objCarro2 = new Carro(30, 400);
        System.out.println("Abastecendo 30 L, Percorrendo 400 km Combustivel restante: " + objCarro2.consumoCombustivel() + "(L)");        
    }
}