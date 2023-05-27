package aula3;

import java.util.Scanner;

public class Exercicio_For {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int contador, num1, num2;

		System.out.println("Escreva um número: ");
		num1 = leia.nextInt();
		System.out.println("Escreva um número maior que o primeiro número: ");
		num2 = leia.nextInt();
		if (num1 > num2) {
			System.out.println("Intervalo Inválido.");
		} else {
			System.out.println("No intervalo entre " + num1 + " e " + num2 + ":");
			for (contador = num1; contador < num2; contador++) {
				if (contador % 3 == 0 && contador % 5 == 0 && contador != 0) {
					System.out.println(contador + " é múltiplo de 3 e 5.");
				}
			}
		}
	}
}
