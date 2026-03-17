import java.util.Scanner;

public class Exercicio3 {
    static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        if(numero1 > numero2 ){
            System.out.println("O maior numero é: " + numero1);
        }else if(numero1 == numero2){
            System.out.println("Os números são iguais: ");
        }else {
            System.out.println("O maior numero é: " + numero2);
        }

        entrada.close();

    }
}
