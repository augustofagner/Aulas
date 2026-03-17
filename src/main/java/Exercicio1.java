package teste;

import java.util.Scanner;

public class Exercicio1 {
    static void main(String[] args){

        System.out.println("Digite um número: ");

        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        entrada.nextLine();

        if(numero > 0){
            System.out.println("o número é positivo.");
        } else {
            System.out.println("o número NÃO é positivo.");
        }

        entrada.close();
    }
}
