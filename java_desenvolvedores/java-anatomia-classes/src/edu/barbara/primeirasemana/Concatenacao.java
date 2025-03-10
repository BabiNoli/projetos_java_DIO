package edu.barbara.primeirasemana;
//O que acontece quando temos um mix de somas e concatenacao
public class Concatenacao {
    public static void main(String[] args) {
        String concatena;

        concatena = 1+1+1+"1"; 
        System.out.println(concatena);//3+1 imprimi 31

        concatena = 1+"1"+1+1;
        System.out.println(concatena);//concatena os uns imprimi 1111

        concatena = 1+"1"+1+"1";
        System.out.println(concatena);//concatena os uns imprimi 1111

        concatena = "1"+1+1+1;
        System.out.println(concatena);//concatena os uns imprimi 1111

        concatena = "1"+(1+1+1);
        System.out.println(concatena);//1+3 imprimi 13
    }
    

}
