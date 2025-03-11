import java.util.Locale;
import java.util.Scanner;

public class DemonstraExcecaoSimples{
    public static void main(String[] args) {
        do { //loop para garantir que o usuário digite um número
            try {
                Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
                System.out.println("Digite a sua idade");
                int idade = scanner.nextInt();
                System.out.println("Sua idade é " + idade);
                scanner.close();
                break;
            } catch (Exception e) {
                System.err.println("Sua idade deve ser um número positivo");
            }
        }while (true);
        
    }
}