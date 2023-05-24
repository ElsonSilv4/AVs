package aula1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		float n1, n2, n3, n4, diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		n1 = leia.nextFloat();
		System.out.print("Digite o segundo número: ");
		n2 = leia.nextFloat();
		System.out.print("Digite o terceiro número: ");
		n3 = leia.nextFloat();
		System.out.print("Digite o quarto número: ");
		n4 = leia.nextFloat();
		
		diferenca= (n1*n2)-(n3*n4);
		
		System.out.printf("Diferença: " + "%.1f", diferenca);
		
	}

}
