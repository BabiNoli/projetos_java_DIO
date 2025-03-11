/*import java.text.NumberFormat;
import java.util.Locale;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a3.14"); //dispara um NumberFormatException
        System.out.println(valor);
        // NumberFormatException é uma subclasse de IllegalArgumentException que é uma subclasse de RuntimeException
        //RuntimeException é uma subclasse de Exception que não é verificada, ou seja, não é obrigatório tratar.

        Number valor2 = NumberFormat.getInstance().parse("a3.14"); //dispara um java.text.ParseException
        System.out.println(valor2);
        // ParseException é uma exceção que indica que houve um erro ao analisar uma string para criar um objeto Number.
        // ParseException é uma subclasse de Exception que é verificada, ou seja, é obrigatório tratar.
        //como tratar:
        // try {
        //     Number valor2 = NumberFormat.getInstance().parse("a3.14");
        //     System.out.println(valor2);
        // } catch (ParseException e) {
        //     System.err.println("Erro ao converter a string para um número");
        // }


        Number valor3 = NumberFormat.getNumberInstance(new Locale("pt", "BR")); //dispara um java.lang.IllegalArgumentException
        System.out.println(valor3);
        // IllegalArgumentException é uma exceção que indica que um método foi chamado com um argumento ilegal ou inválido.
        // IllegalArgumentException é uma subclasse de RuntimeException que não é verificada, ou seja, não é obrigatório tratar.



    }
}
*/