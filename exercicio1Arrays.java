package aula4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicio1Arrays {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);	 
	ArrayList<String> cores = new ArrayList<String>();
	
	String cor;

	for(int i=0 ; i <= 4; i++){
		System.out.println("Digite uma cor: ");
		cor= leia.next();
		leia.close();
		cores.add(cor);
	}
	
	System.out.println("Lista de cores: " + "\n" +cores);
		
	Collections.sort(cores);
	System.out.println("Cores em ordem: " + "\n" +cores);
	
	}
	
	
	
}
