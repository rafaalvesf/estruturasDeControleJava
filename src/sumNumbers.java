import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma =0, numeroDigitado;
        System.out.println("Digites numeros positivos a serem somados. " +
                "Caso digite um numero negativo, a soma irá se encerrar");

        //somar enquanto os numeros inseridos forem positivos
        do{
            System.out.println("Digite: ");
            numeroDigitado = entrada.nextInt();
            if(numeroDigitado >= 0) {
                soma = soma + numeroDigitado;
            }
            System.out.println("Somando...");
            System.out.println(soma);
        }
        while (numeroDigitado >= 0);
        System.out.println("Processo Finalizado !");
    }
}
