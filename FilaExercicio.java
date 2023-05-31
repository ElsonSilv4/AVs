package aula5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaExercicio {

	public static void main(String[] args) {
	Queue<String> fila = new LinkedList<String>();
	Scanner leia = new Scanner(System.in);
	Integer num;
	String nome;
	
	System.out.println("\t|  ----------| MENU |-----------|\n");
	System.out.println("\t|   Opção 1 - Adicionar Cliente |\n");
	System.out.println("\t|   Opção 2 - Lista             |\n");
	System.out.println("\t|   Opção 3 - Chamar cliente    |\n");
	System.out.println("\t|   Opção 0 - Sair              |\n");
	System.out.println("\t|   Digite um número:           |\n");
	num = leia.nextInt();
	
	while (num != 0) {
		if (num == 1) {
	System.out.println("\t|   Digite o nome:              |\n");
	nome = leia.next();
	fila.add(nome);
	System.out.println("\t|   Cliente adicionado!         |\n");
	}
	else if (num == 2) {
	System.out.println("\t|   Lista de clientes:"+fila+" |");
	}
	else if (num==3) {
	if (fila.isEmpty() == true) {
	System.out.println(fila.isEmpty());
	System.out.println("\t|   A fila está vazia.          |\n");
	} else {
	System.out.println(fila.poll());
	System.out.println("\t| O cliente foi Chamado.        |\n");
		}
	}
	System.out.println("\t|   Digite um número:           |\n");
	num = leia.nextInt();	
	}
	System.out.println("\t|   SISTEMA FINALIZADO!         |\n");
	
		}
	}


