import java.util.Scanner;
import java.util.Random;

public class divinationGame {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroDigitado = 0;
        boolean advinhou = false;

        System.out.println("Jogo da advinhação!!");
        System.out.println("Vou te dar algumas dicas, " +
                "mas você precisa adivinhar em que número estou pensando...");
        System.out.println("Digite um número entre 0 e 100: ");

        //salvar variável aleatória entre 0 e 100
        Random gerarNumero = new Random();
        int numeroAleatorio = gerarNumero.nextInt(100) + 1;

        //adivinhar numero
        for (int i = 10; i > 0; i--){
            numeroDigitado = entrada.nextInt();
            System.out.println(numeroAleatorio);
            if (numeroDigitado > numeroAleatorio){
                System.out.println("O número que eu pensei, é MENOR do que o número " + numeroDigitado);
            }
            else if(numeroDigitado < numeroAleatorio){
                System.out.println("O número que eu pensei, é MAIOR do que o número " + numeroDigitado);
            }
            else{
                advinhou = true;
                break;
            }
            System.out.println("Você ainda tem " + (i-1) + " chances");
        }
        if (advinhou){
            System.out.println("PARABENS!!! Você advinhou o número");
        }
        else{
            System.out.println("Que Pena!!! Você não advinhou o número");
        }
    }
}
