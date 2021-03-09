import java.util.Scanner;

public class mostHigherNumber {
    public static void main(String[] args) {
        //Verificar qual é o maior número
        Scanner entrada = new Scanner(System.in);
        int numeroDigitado, maiorNumero = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite 10 números que veremos qual é o maior entre eles");
            System.out.println("Digite o " + (i + 1) +"° número: ");
            numeroDigitado = entrada.nextInt();
            if(i == 0){
                maiorNumero = numeroDigitado;
            }
            else if(numeroDigitado > maiorNumero){
                maiorNumero = numeroDigitado;
            }
        }
        System.out.println("O maior número digitado é " + maiorNumero);
    }
}
