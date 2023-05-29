package Vetores;

public class Vetor {

	public static void main(String[] args) {
		String vetorCachorros[] = {"Boxer", "Pastor A", "Pinscher", "Husky", "Corgi"};

		for(int numero = 0; numero < vetorCachorros.length; numero++) {
			System.out.println((numero + 1) + "º casa: " + vetorCachorros[numero]);
		}
		System.out.println("O tamanho do vetor é: " + vetorCachorros.length);
	}

}
