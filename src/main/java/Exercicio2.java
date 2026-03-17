import java.util.Scanner;

public class Exercicio2 {
    static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");

        int numero = entrada.nextInt();

        entrada.nextLine();

        if(numero % 2 == 0) {
            System.out.println("O número é par.");
        } else{
            System.out.println("O número é ímpar.");
        }

        entrada.close();
    }

}
