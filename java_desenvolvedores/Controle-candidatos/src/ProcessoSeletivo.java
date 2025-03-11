import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo Seletivo\n");
		String[] candidatos = {"João", "Maria", "José", "Ana", "Carlos", "Mariana", "Pedro", "Paula", "Luiz", "Fernanda"};
		
		double salarioBase = 2000.0;
		int vagas = 5;
		
		imprimeCandidatos(candidatos);
		selecaoCandidato(salarioBase, candidatos, vagas);
		
		
	}
	
	static void selecaoCandidato(double salarioBase, String[] candidatos, int vagas) {

		String[] canditadosSelecionados = new String[vagas];
		int candidatosSelecionadosCount = 0;
		int candidatosAtual = 0;
		int indice = 0;
		
		
		while(candidatosSelecionadosCount < vagas && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido(); //gera um valor aleatório entre 1800 e 2200
			System.out.println("\nO candidato " + candidato + " pretende ganhar " + salarioPretendido);
			analisaCandidato(salarioPretendido, salarioBase, candidato);
			
					
			
			if(salarioBase < salarioPretendido) {
				canditadosSelecionados[indice] = candidato;
				indice++;
				candidatosSelecionadosCount++;
			}
				
			candidatosAtual++;	
		}
		imprimeCandidatosSelecionados(canditadosSelecionados);
		
		
		System.out.println("\nLigando para os candidatos selecionados...\n");
		for(int i = 0; i < candidatosSelecionadosCount; i++) {
			String candidatoContactado = canditadosSelecionados[i];
			ligarCandidato(candidatoContactado, chamadaAtendida());
			
		}
		
		
	}
	
	static double valorPretendido() {
		 return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
	}
		
	static void analisaCandidato(double salarioPretendido, double salarioBase, String candidato) {
		
		System.out.println("\nAnalisando candidato...");
		
		if(salarioBase < salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO " + candidato + " E AGENDAR ENTREVISTA.");
		} else if(salarioBase == salarioPretendido) {
			System.out.println("Fazer uma contra proposta para o candidato " + candidato);
		} else {
			System.out.println("Enviar e-mail para o candidato " + candidato + " informando que não foi selecionado.");
		}
		
		
	}
	
	static void imprimeCandidatos(String[] candidatos) {
		System.out.println("\nImprimindo a lista de candidatos informando o indice: \n");
		
		for(int indice = 0; indice < candidatos.length; indice++) {
			
			System.out.println("O candidato de número " + (indice+1) + " é " + candidatos[indice]);
		}
	}
	
	static void imprimeCandidatosSelecionados(String[] candidatosSelecionados) {
		System.out.println("\nImprimindo a lista de candidatos selecionados: \n");
		
		
		
		for(int indice = 0; indice < candidatosSelecionados.length; indice++) {
			
			System.out.println("O candidato de número " + (indice+1) + " é " + candidatosSelecionados[indice]);
		}
	}
	
	static void ligarCandidato(String candidato, boolean chamadaAtendida) {
		int tentativasRealizadas = 0;
		chamadaAtendida = chamadaAtendida(); //simula se a chamada foi atendida ou não aleatoriamente
		
		while(tentativasRealizadas < 3 && !chamadaAtendida) {
			System.out.println("Tentando ligar para o candidato " + candidato + " pela " + (tentativasRealizadas+1) + " vez.");
			
			tentativasRealizadas++;
			
			
		}
		if(chamadaAtendida) {
				System.out.println("Candidato " + candidato + " atendeu a ligação.\n");
		} else if(tentativasRealizadas == 3) {
			
			System.out.println("O candidato " + candidato + " foi eliminado.\n");
		}
	}
	
	
	static boolean chamadaAtendida() {
		return new Random().nextInt(3) == 1;
	}
	
	
	
}
