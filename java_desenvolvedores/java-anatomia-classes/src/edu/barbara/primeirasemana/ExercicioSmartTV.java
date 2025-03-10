package edu.barbara.primeirasemana;
//Exercicio SmartTV
public class ExercicioSmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o Volume para " + volume); 
    }

    public void diminuirVolume(){
        volume--; 
        System.out.println("Diminuindo o Volume para " + volume);
    }
    
    public void aumentarCanal(){
        canal++; 
        System.out.println("Aumentando o canal para " + canal);
    }

    public void diminuirCanal(){
        canal--; 
        System.out.println("Dminuindo o canal para " + canal);
    }

    public void mudarCanal(int novocanal){
        canal = novocanal; 
        System.out.println("Mudando para novo canal: " + canal);
    }

}


