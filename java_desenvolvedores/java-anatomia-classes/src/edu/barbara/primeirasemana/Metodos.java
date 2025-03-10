package edu.barbara.primeirasemana;

public class Metodos {
    public double somar(int num1, int num2){
        return num1 + num2;
    }

    public void imprimir(String texto){
        System.out.println(texto);
    }

    public double dividir(int dividendo, int divisor) throws Exception{
        if (divisor == 0) {
            throw new Exception("Divisor nao pode ser zero");
        }
        return (double) dividendo / divisor;
    }

    private void metodoPrivado(){
        System.out.println("Este é um método privado.");
    }

    public void usarMetodoPrivado() {
        metodoPrivado();
    }

    public void registarCliente(String nome, int idade, char genero){
        //impletmentacao aqui
    }

    /*no caso de POO
    public void registarClientePOO(Cliente cliente){
        //impletmentacao aqui
    }*/

}
