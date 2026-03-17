import java.util.Scanner;

public class Exercicio9 {
    static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char letra = entrada.next().toLowerCase().charAt(0);
        //Captura a entrada do usuário e faz três operações
        //1. entrada.next() = lê a proxima palavra digitada (String)
        //2. toLowerCase() = converte toda a palavra digitada para letras
        //3. charAt(0) = extrai o primeiro caractere da String (posição 0), ignorando o restante

        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("A letra digitada é uma vogal: " + letra);
        }else{
            System.out.println("A letra digitada é uma consoante: " + letra);
        }

        entrada.close();
    }
}
