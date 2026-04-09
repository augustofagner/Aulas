package Switch;

import java.util.Scanner;

public class exercicio_switch_4 {
    static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char letra = entrada.next().toLowerCase().charAt(0);

        switch (letra) {

            case 'a':

            case 'e':

            case 'i':

            case 'o':

            case 'u':

                System.out.println("É uma vogal.");
                break;
            default:
                System.out.println("É uma consoante.");

        }

    }
}
