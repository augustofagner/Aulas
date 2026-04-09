package Switch;

import java.util.Scanner;

public class exercicio_switch_2 {
    static void main (String[] argsr) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7: ");

        int opcao = entrada.nextInt();

        switch (opcao) {

            case 1:

                System.out.println("Domingo");

                break;

            case 2:

                System.out.println("Segunda-Feira");

                break;

            case 3:

                System.out.println("Terça-Feira");

                break;

            case 4:

                System.out.println("Quarta-Feira");

                break;

            case 5:

                System.out.println("Quinta-Feira");

                break;

            case 6:

                System.out.println("Sexta-Feira");

                break;

            case 7:

                System.out.println("Sábado");

                break;

            default:

                System.out.println("Digite um número válido! Entre 1 e 7.");

        }

        entrada.close();
    }
}
