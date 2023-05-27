package aula3;

import java.util.Scanner;

public class Exercicio_While {

	public static void main(String[] args) {
		
		int idade, maior50 = 0, menor21 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a idade: ");
            idade = leia.nextInt();
		
            while (idade >= 0) {
            	
            	if (idade < 21) {
            		menor21++;
            	}
            	if (idade > 50) {
            		maior50++;
            }
            System.out.println("Digite uma idade: ");
            idade=leia.nextInt();
        }
            
            if (idade <= 0) {
            	            	System.out.println("Total de pessoas menores  de 21 anos: " + menor21);
            	            	System.out.println("Total de pessoas maiores de 50 anos: " + maior50);
            }
	}
}
