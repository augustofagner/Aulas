package Switch;

import java.util.Scanner;

public class exercicio_switch_3 {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();

        System.out.println("Digite a operação (+,-,/,*): ");
        char operador = entrada.next().charAt(0);

        switch (operador){

            case '+':

                System.out.println("Resultado: " + (numero1 + numero2));
                break;

            case '-':

                System.out.println("Resultado: " + (numero1 - numero2));
                break;

            case '/':

                if (numero2 != 0)

                    System.out.println("Resultado: " + (numero1 / numero2));

                else
                    System.out.println("Erro: Divisão por zero.");
                    break;

            case '*':

                System.out.println("Resultado: " + (numero1 * numero2));
                break;

            default:
                System.out.println("Operador Inválido!");
        }

        entrada.close();

    }
}
