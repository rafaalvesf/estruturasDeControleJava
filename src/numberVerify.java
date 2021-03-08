import java.util.Scanner;

public class numberVerify {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Solicita o número ao usuário
        System.out.println("Digite um número qualquer: ");
        int numero = entrada.nextInt();

        //verifica se o número está entre 10
        if (numero <= 10 && numero >= 0){
            System.out.println("O número " + numero + " ESTÁ entre 0 e 10, ");
        }
        else{
            System.out.println("O número " + numero + " NÃO está entre 0 e 10, ");
        }
        //verifica se o número é par
        if (numero % 2 == 0){
            System.out.print(numero + " é PAR");
        }
        else{
            System.out.print(numero + " é Ímpar");
        }
    }
}
