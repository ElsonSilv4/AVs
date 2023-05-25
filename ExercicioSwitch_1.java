package Aula2;

import java.util.Scanner;

public class ExercicioSwitch_1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, qtd, valor, valorTotal, pag;

	System.out.println("--------------------LANCHONETE DA GENERATION--------------------");	
	System.out.println("\n[1] Cachorro Quente \n[2] X-Salada \n[3] X-Bacon \n[4] Bauru \n[5] Refrigerante \n[6] Suco de laranja");
	System.out.print("Insira o código do produto: ");	
	num=ler.nextInt();
		
		switch (num) {
		
		case 1:
			System.out.println("\nCachorro Quente");
			System.out.print("\nQual a quantidade?");
			qtd=ler.nextInt();
			valor = 10;
			valorTotal=(valor*qtd);
			System.out.println("Código do produto: " + num);
			System.out.println("Produto: Cachorro Quente");
			System.out.println("Quantidade: " + qtd);
			System.out.println("Valor total: R$" + valorTotal);
			
		break;
		
		case 2:
			System.out.println("\nX-Salada");
			System.out.print("\nQual a quantidade?");
			qtd=ler.nextInt();
			valor = 15;
			valorTotal=(valor*qtd);
			System.out.println("Código do produto: " + num);
			System.out.println("Produto: X-Salada");
			System.out.println("Quantidade: " + qtd);
			System.out.println("Valor total: R$" + valorTotal);
			
		break;
		
		case 3:
			System.out.println("\nX-Bacon");
			System.out.print("\nQual a quantidade?");
			qtd=ler.nextInt();
			valor = 18;
			valorTotal=(valor*qtd);
			System.out.println("Código do produto: " + num);
			System.out.println("Produto: X-Bacon");
			System.out.println("Quantidade: " + qtd);
			System.out.println("Valor total: R$" + valorTotal);
			
		break;
		
		case 4:
			System.out.println("\nBauru");
			System.out.print("\nQual a quantidade?");
			qtd=ler.nextInt();
			valor = 12;
			valorTotal=(valor*qtd);
			System.out.println("Código do produto: " + num);
			System.out.println("Produto: Bauru");
			System.out.println("Quantidade: " + qtd);
			System.out.println("Valor total: R$" + valorTotal);
			
		break;
		
		case 5:
			System.out.println("\nRefrigerante");
			System.out.print("\nQual a quantidade?");
			qtd=ler.nextInt();
			valor = 8;
			valorTotal=(valor*qtd);
			System.out.println("Código do produto: " + num);
			System.out.println("Produto: Refrigerante");
			System.out.println("Quantidade: " + qtd);
			System.out.println("Valor total: R$" + valorTotal);
			
		break;
		
		case 6:
			System.out.println("\nSuco de Laranja");
			System.out.print("\nQual a quantidade?");
			qtd=ler.nextInt();
			valor = 13;
			valorTotal=(valor*qtd);
			System.out.println("Código do produto: " + num);
			System.out.println("Produto: Suco de Laranja");
			System.out.println("Quantidade: " + qtd);
			System.out.println("Valor total: R$" + valorTotal);
			
		break;
		default:
			System.out.println("Opção Inválida");
			
		
		
		}
		
		System.out.println("\nQual a forma de pagamento? ");
		System.out.println("[1] Débito \n[2] Crédito \n[3] Pix");
		pag=ler.nextInt();
		
		switch(pag) {
		
		case 1:
			System.out.println("------Débito------");
			System.out.println("\nInsira o cartão");
			
		break;
		
		case 2:
			System.out.println("------Crédito------");
			System.out.println("\nInsira o cartão");
			
		break;
		case 3:
			System.out.println("------Pix------");
			System.out.println("\nLeia o QR CODE ou faça a transferencia para a chave pix:");
			System.out.println("\nelson3031@hotmail.com");
		break;
		}
		
		
			
	

	}

}
