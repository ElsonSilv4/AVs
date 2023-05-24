package aula1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		float salario, abono, NovoSalario;
			
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o salário (R$) :");
		salario = leia.nextFloat();
		
		System.out.print("Digite o abono (R$) :");
		abono = leia.nextFloat();
		
		NovoSalario = (salario+abono);
		
		System.out.printf("\nO novo salário é R$" + "%.2f", NovoSalario );
		
		
				
		
		

	}

}
