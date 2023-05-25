package Aula2;

import java.util.Scanner;

public class ExercicioIF_1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int A, B, C;
		System.out.println("Digite um número: ");
		A = ler.nextInt();
		System.out.println("Digite outro número: ");
		B = ler.nextInt();
		System.out.println("Digite outro número: ");
		C = ler.nextInt();
		ler.close();
		if ((A + B) > C) {
			System.out.println("A soma é maior que C.");
		} else if ((A + B) < C) {
			System.out.println("A soma é menor que C.");
		} else if ((A + B) == C) {
			System.out.println("A soma é igual a C.");
		}

	}

}
