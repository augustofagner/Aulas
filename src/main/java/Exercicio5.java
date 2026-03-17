import java.util.Scanner;

public class Exercicio5 {
    static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int numero = entrada.nextInt();

        if(numero % 3 == 0 && numero % 5 == 0){
            System.out.println("O número é múltiplo de 3 e 5.");
        }else {
            System.out.println("O número NÃO é múltiplo de 3 e 5.");
        }

        entrada.close();
    }
}
