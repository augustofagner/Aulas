import java.util.Scanner;

public class Exercicio6 {
    static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int numero = entrada.nextInt();

        if(numero > 0){
            System.out.println("O número é positivo.");
        }else if(numero < 0) {
            System.out.println("O número é negativo.");
        }else {
            System.out.println("O número é igual a zero.");
        }

        entrada.close();
    }
}
