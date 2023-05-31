package aula5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PilhaExercicio {

	public static void main(String[] args) {
	Stack<String> pilha = new Stack<String>();
	Scanner leia = new Scanner(System.in);
	Integer num;
	String nome;
	
	System.out.println("\t*********************************\n");
	System.out.println("\t*   Opção 1 - Adicionar livro   *\n");
	System.out.println("\t*   Opção 2 - Lista de livros   *\n");
	System.out.println("\t*   Opção 3 - Retirar livro     *\n");
	System.out.println("\t*   Opção 0 - Sair              *\n");
	System.out.println("\t*   Digite um número:           *\n");
	System.out.println("\t*********************************\n");
	num = leia.nextInt();
	
	
	while (num != 0) {
		if (num == 1) {
	System.out.println("\t   Digite o nome do livro:      \n");
	leia.nextLine();
	nome = leia.nextLine();
	
	pilha.push(nome);
	System.out.println("\t   Livro adicionado!            \n");
	}
	else if (num == 2) {
	System.out.println("\t   Lista de livros: "+pilha);
	}
	else if (num==3) {
	if (pilha.isEmpty() == true) {
	System.out.println(pilha.isEmpty());
	System.out.println("\t    A pilha está vazia.         \n");
	} else {
	System.out.println(pilha.pop());
	System.out.println("\t  O livro foi retirado!         \n");
		}
	}
	System.out.println("\t    Digite um número:           \n");
	num = leia.nextInt();	
	}
	System.out.println("\t    PROGRAMA FINALIZADO!         \n");
	
		}
	}

