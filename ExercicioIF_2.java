package Aula2;

import java.util.Scanner;

public class ExercicioIF_2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num;		
		System.out.print("Digite um número: ");
		num = ler.nextInt();
		
		if ((num > 0 ) && (num % 2 == 0)) {
			System.out.println("O " + num + " é par e positivo.");
		}else if ((num > 0) && (num % 2 != 0)) {
			System.out.println("O " + num + " é impar e positivo.");

		}else if ((num < 0) && (num % 2 == 0)) {
			System.out.println("O "+ num + " é Par e negativo.");
		}else if (num == 0) {
			System.out.println("O "+ num + " é Par e neutro.");
		}else {
			System.out.println("O " + num + "é Impar e negativo.");
		}
	}
}
