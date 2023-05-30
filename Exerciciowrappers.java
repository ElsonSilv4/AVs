package aula4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exerciciowrappers {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> setnumero = new HashSet<Integer>();
		Integer num = Integer.valueOf(10);

		for(int i= 0; i<10; i++){		
			System.out.println("Digite um número: ");
			num=leia.nextInt();
			setnumero.add(num);	
		}
		
		System.out.println("\nListar dados do Set: " + setnumero);
		
		}
	
		
	}


		


