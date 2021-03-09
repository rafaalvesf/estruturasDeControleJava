import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        //Verificar se um número é primo

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número para saber se o mesmo é primo: ");
        int numeroDigitado = entrada.nextInt();
        int primo = 0;

        //verificar se o número é primo
        for(int i = 1; i <= numeroDigitado; i++){
            if(numeroDigitado % i == 0){
                primo++;
            }
        }
        //se o número tiver mais que dois divisores, ele é primo
        if(primo == 2){
            System.out.println("O número " + numeroDigitado + " é PRIMO");
        }
        else{
            System.out.println("O número " + numeroDigitado + " NÃO é PRIMO");
        }
        System.out.println(primo);
    }
}
