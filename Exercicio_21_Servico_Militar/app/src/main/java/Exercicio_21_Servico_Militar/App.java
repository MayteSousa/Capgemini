/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio_21_Servico_Militar;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        String nome;
        char sexo, saude, continuar='s';
        int idade, apto=0, inapto=0;
        
        while( continuar == 's' || continuar == 'S'){
        
            System.out.println("Informe o nome");
            nome = leitor.nextLine();

            System.out.println("Informe o sexo: Masculino - M | Feminino - F");
            sexo = leitor.next().charAt(0);

            System.out.println("Informe a idade");
            idade = leitor.nextInt();

            System.out.println("Informe se � saud�vel: Sim - S | N�o - N");
            saude = leitor.next().charAt(0);

            if(( sexo == 'M' || sexo == 'm') && idade >= 18 && ( saude == 's' || saude == 'S')){
                System.out.println("�pto a prestar servi�o militar");
            }else{
                System.out.println("Inapto a prestar servi�o militar");
            }
            System.out.println("Deseja continuar?");
            continuar = leitor.next().charAt(0);
        }
    }
}