package Vetores;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		int soma=0;
		float media=0;
		Scanner leia = new Scanner(System.in);

		for (int indice = 0; indice < 10; indice++) {
			System.out.println("Digite o " + (indice + 1) + "º número: ");
			vetor[indice] = leia.nextInt();

		}
		System.out.println("Elementos nos indices impares: ");
		for (int indice = 0; indice < vetor.length; indice++) {

			if (indice % 2 != 0) {
				System.out.print(" " +  vetor[indice]);
			}
		}
		System.out.println("\nElementos pares: ");
		for (int indice = 0; indice < vetor.length; indice++) {
			if (vetor[indice] % 2 == 0) {
				System.out.print(" " +  vetor[indice]);
			}
		}
		System.out.println("\nSoma: ");
		for (int indice = 0; indice < vetor.length; indice++) {
			soma = soma + vetor[indice];
		}	
		 	System.out.print(soma);
	

		System.out.println("\nMédia: ");
			for (int indice = 0; indice < vetor.length; indice++) {
		media = soma / vetor.length;
		}
			System.out.print(media);
	}
		
}