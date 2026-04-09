package While;

import java.util.Scanner;

public class exercicio_while_1 {
    static void main (String[] args){

    Scanner entrada = new Scanner(System.in);

    System.out.println("\n1. Contar de 1 até 5 com while\n");

    int contador = 1;

    while (contador <= 5){

        System.out.println("Contador: " + contador);

        contador++;
    }
    }

}
