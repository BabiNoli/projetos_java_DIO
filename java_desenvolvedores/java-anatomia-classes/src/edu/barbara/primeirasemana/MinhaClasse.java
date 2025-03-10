package edu.barbara.primeirasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        final String BR = "Brasil";
        System.out.println(BR);
        String primeiroNome = "Barbara";
        String segundoNome = "Oliveira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
        
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
