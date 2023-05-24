package aula1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota :");
		nota1 = leia.nextFloat();
		
		System.out.print("Digite a segunda nota :");
		nota2 = leia.nextFloat();
		
		System.out.print("Digite a terceira nota :");
		nota3 = leia.nextFloat();
		
		System.out.print("Digite a quarta nota :");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("Média final: " + "%.1f", media);
		
	}

}
