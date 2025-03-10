package edu.barbara.primeirasemana;

public class Opradores {
    public static void main(String[] args) {
        // para tornar um numero negativo
        int numero = 5;

        System.out.println(numero);

        numero = numero * -1;//o numero positivo passa a ser negativo
        System.out.println(numero);
        
        numero = numero * -1;//o numero negativo passa a ser positivo
        System.out.println(numero);
        
        //forma curta para trocar sinal
        numero = - numero;//forma curta, o numero passa a ser negativo denovo 
        System.out.println(numero); //a forma curta nao funciona com o sinal de +
        numero = - numero; //volta a ser positivo
        System.out.println(numero);

        //incremento e decremento (antes e depois):

        System.out.println(++numero);//incrementa depois imprimi
        System.out.println(--numero);//decrementa depois imprimi
        System.out.println(numero++);//imprimi depois incrementa
        System.out.println(numero--);//imprimi depois decrementa

        //inverter valor do booleano

        boolean variavelBooleana = true;
        System.out.println(variavelBooleana);//true

        variavelBooleana = !variavelBooleana; //altera na sobrescricao
        System.out.println(variavelBooleana);//false

        System.out.println(!variavelBooleana); //altera na impressao
        //true

        //Operadores ternários
        int a, b, c;
        a = 6;
        b = 6;
        c = 8;
        String resultado = a==b ? "igual" : "diferente";
        System.out.println(resultado);
        resultado = a<b || a==c? "verdadeiro" : "falso";
        System.out.println(resultado);
        resultado = a<c && a==b? "verdadeiro" : "falso";
        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;
        
        boolean simNao = numero1 == numero2;
        System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numero1 é diferente a numero2? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numero1 é maior a numero2? " + simNao);

        //verificacao booleana direta na impressao
        System.out.println(numero1 == numero2);
        System.out.println(numero1 != numero2);
        System.out.println(numero1 <= numero2);
        System.out.println(numero1 > numero2);
        System.out.println("\n------------------------------------\n");
        
        //.equals compara conteúdos, nao pode ser usado para tipo int
        String nome1 = "Mônica";
        String nome2 = "Eduardo";
        String nome3 = new String("Eduardo");

        System.out.println(nome1.equals(nome2));
        System.out.println(nome2.equals(nome3) || nome1.equals(nome3));
        System.out.println(nome2.equals(nome3) && nome1.equals(nome3));

        if(simNao && nome2 == nome3){
            System.out.println("Interessante!");
        }else{
            System.out.println("Nem faz sentido.");
        }
    }

}
