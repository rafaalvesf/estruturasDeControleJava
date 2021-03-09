import java.util.Calendar;
import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        /*Para que o ano seja bissexto:
        o ano tem que ser divisivel por 4
        não pode ser divisivel por 100
        e se for divisivel por 400 a divisão tem que ser exata
        * */
        //pega e define o ano atual
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ano desejado. Digite 0 para o ano atual: ");
        int ano = entrada.nextInt();
        //Se 0 for digitado, então pegue o ANO ATUAL
        if(ano == 0){
            ano = year;
        }
        //Verifica se o ANO é BISSEXTO
        System.out.println("O ano digitado foi: " + ano);
        if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 ==0){
            System.out.println(ano + " é BISSEXTO");
        }
        else{
            System.out.println(ano + " NÃO é BISSEXTO");
        }
    }
}
