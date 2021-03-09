import java.util.Scanner;

public class testScores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double primeiraNota = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double segundaNota = entrada.nextDouble();

        //calcular a média das notas
        double media = 0;
        media = (primeiraNota + segundaNota) / 2;

        //Verificar situação do aluno
        if(media >= 7){
            System.out.println("A nota foi " + media + "! APROVADO");
        }
        else if(media > 4){
            System.out.println("A nota foi " + media + "! RECUPERAÇÃO");
        }
        else{
            System.out.println("A nota foi " + media + "! REPROVADO");
        }
    }
}
