package aula1;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		String nome; 
		float distancia;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		 
		
		System.out.print("Digite a distância: ");
		distancia = leia.nextFloat();
				
		System.out.println("\nParabéns, " + nome + "! A distância percorrida foi de " + distancia + "Km");
		
	}

}
