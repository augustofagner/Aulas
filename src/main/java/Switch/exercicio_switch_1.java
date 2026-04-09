package Switch;

import java.util.Scanner;

public class exercicio_switch_1 {
    static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha sua cor favorita: ");

        System.out.println("1 - Azul: ");
        System.out.println("2 - Vermelho: ");
        System.out.println("3 - Verde: ");
        System.out.println("4 - Preto: ");

        System.out.print("Digite o número da opção: ");

        int opcao = entrada.nextInt();

        switch (opcao) {

            case 1:

                System.out.println("Você escolheu a cor Azul!");

                break;

            case 2:

                System.out.println("Você escolheu a cor Vermelha!");

                break;

            case 3:

                System.out.println("Você escolheu a cor Verde!");

                break;

            case 4:

                System.out.println("Você escolheu a cor Preta!");

                break;

            default:

                System.out.println("Opção inválida!");
        }

        entrada.close();
    }
}
