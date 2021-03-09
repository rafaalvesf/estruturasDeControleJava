import java.util.Scanner;

public class letterByLetter {
    public static void main(String[] args) {
        //pegando uma palavra digitada e imprimindo letra por letra

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase: ");
        String palavraDigitada = entrada.nextLine().toLowerCase();
        String[] letras = palavraDigitada.split("");
        int tamanhoPalavra = palavraDigitada.length(); //verificando tamanho da palavra
        for (int i = 0; i < tamanhoPalavra; i++){
            System.out.println(letras[i]);// imprimindo cara letra armazenada
        }
    }
}
