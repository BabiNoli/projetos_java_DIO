package edu.barbara.primeirasemana;

public class UsuarioSmartTV {
    public static void main(String[] args) throws Exception{
        ExercicioSmartTV smartTV = new ExercicioSmartTV();
        //imprimindo estado atual
        System.out.println("TV está ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar();

        System.out.println("Novo status -> TV está ligada? " + smartTV.ligada);
        
        smartTV.desligar();

        System.out.println("Novo status -> TV está ligada? " + smartTV.ligada);
        
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();

        System.out.println("Novo status -> Volume atual: " + smartTV.volume);
        
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();

        System.out.println("Novo status -> Volume atual: " + smartTV.volume);
        

        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();

        
        smartTV.diminuirCanal();
        smartTV.diminuirCanal();

        smartTV.mudarCanal(3);
        smartTV.mudarCanal(6);
        smartTV.mudarCanal(20);
    }
}
