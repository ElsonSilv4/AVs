package Aula2;

import java.util.Scanner;

public class ExercicioSwitch_2 {

	public static void main(String[] args) { 
		Scanner leia = new Scanner(System.in);
		String nome;
		int cargo;
		float salario, novosalario;
		
		System.out.print("Informe o seu nome: ");
		nome =leia.next();
		System.out.print("Informe o código do colaborador: ");
		cargo=leia.nextInt();
		
		switch(cargo) {
		
		case 1: 
			System.out.print("Nome do colaborador: "+nome+"\n");
			System.out.print("Cargo: "+cargo+"\n");
			salario= 10000;
			System.out.print("Salário: R$"+salario+"\n");
			System.out.print("Cargo: Gerente\n");
			novosalario= (salario + (10 * salario / 100));
			System.out.printf("Salário Reajustado: R$"+novosalario+"\n");
			
			break;
			
		case 2: 
			System.out.print("Nome do colaborador: "+nome+"\n");
			System.out.print("Cargo: "+cargo+"\n");
			salario= 2000;
			System.out.print("Salário: R$"+salario+"\n");
			System.out.print("Cargo: Vendedor\n");
			novosalario= (salario + (7 * salario / 100));
			System.out.printf("Salário Reajustado: R$"+novosalario+"\n");
		
			break;
			
		case 3: 
			System.out.print("Nome do colaborador: "+nome+"\n");
			System.out.print("Cargo: "+cargo+"\n");
			salario= 5000;
			System.out.print("Salário: R$"+salario+"\n");
			System.out.print("Cargo: Supervisor\n");
			novosalario= (salario + (9 * salario / 100));
			System.out.printf("Salário Reajustado: R$"+novosalario+"\n");
		
			break;
			
		case 4: 
			System.out.print("Nome do colaborador: "+nome+"\n");
			System.out.print("Cargo: "+cargo+"\n");
			salario= 2500;
			System.out.print("Salário: R$"+salario+"\n");
			System.out.print("Cargo: Motorista\n");
			novosalario= (salario + (6 * salario / 100));
			System.out.printf("Salário Reajustado: R$"+novosalario+"\n");
			
			break;
			
		case 5: 
			System.out.print("Nome do colaborador: "+nome+"\n");
			System.out.print("Cargo: "+cargo+"\n");
			salario= 4500;
			System.out.print("Salário: R$"+salario+"\n");
			System.out.print("Cargo: Estoquista\n");
			novosalario= (salario + (5 * salario / 100));
			System.out.printf("Salário Reajustado: R$"+novosalario+"\n");
			
			break;
		
		case 6: 
			System.out.print("Nome do colaborador: "+nome+"\n");
			System.out.print("Cargo: "+cargo+"\n");
			salario= 8700;
			System.out.print("Salário: R$"+salario+"\n");
			System.out.print("Cargo: Técnico de TI\n");
			novosalario= (salario + (8 * salario / 100));
			System.out.printf("Salário Reajustado: R$"+novosalario+"\n");
			
			break;
		}
		

	}
}