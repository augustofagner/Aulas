package if_else;

import java.util.Scanner;

public class Exercicio8 {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media >= 7) {
            System.out.println("Aluno aprovado com média " + media);
        }else if(media >= 5) {
            System.out.println("Aluno em recuperação com média " + media);
        }else {
            System.out.println("Aluno reprovado com média " + media);
        }

        entrada.close();
    }
}
