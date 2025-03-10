package edu.barbara.primeirasemana;

/*
 * Tipos primitivos: Valores brutos armazenados diretamente  
 * na pilha de memória (Memory stack).
 * 8 tipos:
 * byte -> 1 byte de memória (de -128 a 127)  
 * short -> 2 bytes de memória (de -32.768 a 32.767)  
 * int -> 4 bytes de memória (de -2.147.483.648 a 2.147.483.647)
 * long -> 8 bytes de memória (de -9.223.372.06.854.775.808 a 9.223.372.06.854.775.807)
 * float -> 4 bytes de memória (de -3,4028E + 38 a 3,4028E + 38) 
 * double -> 8 bytes de memória (de -1,7976E + 308 a 1,7976E + 308) 
 * boolean -> em java 8 bits ou 1 byte de memória depende da JVM (true = 1 ou false = 0)
 * char -> em java 2 bytes de memória (usa UTF-16 de 0 a 65.535 ou seja \u0000 a \uFFFF)
 */

public class TiposDeVariaveis {

    public static void main(String[] args) {
        
        byte idade = 12;
        short ano = 2021;
        int codigoPostal = 8035; // int nao pode comecar com 0
        long numeroHabitantes = 256489678449L; //também nao pode comecar com 0. termina com l ou L
        float pi = 3.14F; // termina com f ou F
        double salarioMinimo = 2500.33; //usa . e nao ,

        System.out.println("idade: " + idade + "\ncodigoPostal: " + codigoPostal + "\npi: " + pi);
        System.out.println("numeroHabitantes: " + numeroHabitantes + "\nsalarioMinimo: " + salarioMinimo + "\nano: " + ano);
        System.out.println("\n________________________________________________\n");
        // java é fortemente tipado: 
        //um valor pequeno cabe em um tipo maior que ele

        numeroHabitantes = codigoPostal;
        salarioMinimo = pi; //imprimi: 3.140000104904175
        ano = idade;

        System.out.println("java é fortemente tipado, um valor pequeno cabe em um tipo maior que ele");
        System.out.println("numeroHabitantes: " + numeroHabitantes + "\nsalarioMinimo: " + salarioMinimo + "\nano: " + ano);
        System.out.println("\n________________________________________________\n");
       
        //para garantir que a variavel nao seja modificada ou seja
        //se torne um valor constante, deve-se usa a palavra "final"

        final double valorPI = 3.14;

        //valorPI = 2.45;  nao aceita sobescrever o valor, dá erro.
        System.err.println("valorPI: " + valorPI);

        char genero = 'F';
        //char genero1 = "F"; errado, nao aceita aspas duplas
        String generoExtenso = "Feminino"; //String nao é um tipo primitivo
        //String generoExtenso1 = 'Feminino'; errado, nao aceita aspas simples

        System.out.println("Gênero em String: " + generoExtenso + "\n" + "gênero em char: " + genero);

        boolean feminino = true;

        if(feminino){
            System.out.println("O gênero é feminino.");
        }else{
            System.out.println("O gênero é indefinido.");
        }

    }
}
