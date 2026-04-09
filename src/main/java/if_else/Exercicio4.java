package if_else;

import java.util.Scanner;

public class Exercicio4 {
    static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");

        int numero = entrada.nextInt();

        if(numero >= 10 && numero <= 100){
            System.out.println("O número está entre o intervalo de 10 e 100.");
        }else {
            System.out.println("O número NÃO está dentro do intervalo.");
        }

        entrada.close();

    }
}
