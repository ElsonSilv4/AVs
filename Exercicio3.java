package aula1;

import java.util.Scanner;
 
public class Exercicio3 {

	public static void main(String[] args) {
		float bruto, noturno, extra, desconto, liquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Qual o salário bruto? (R$) ");
		bruto = leia.nextFloat();
		System.out.print("Qual o adicional noturno? (R$) ");
		noturno = leia.nextFloat();
		System.out.print("Quanto de hora extra? (R$) ");
		extra = leia.nextFloat();
		System.out.print("Quanto teve de desconto? (R$) ");
		desconto = leia.nextFloat();
		
		liquido = (bruto + noturno + (extra * 5) - desconto);
		
		System.out.printf("Salário Líquido: R$" + "%.2f",liquido);
		

	}

}
