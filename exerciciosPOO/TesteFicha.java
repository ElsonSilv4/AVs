package exerciciosPOO;

public class TesteFicha {

	public static void main(String[] args) {
		FichaAnimal cadastro = new FichaAnimal ();
		
		
		cadastro.setAnimal("Cachorro");
		cadastro.setSexo("Femea");
		cadastro.setNome("Princesa");
		cadastro.setIdade(8);
		cadastro.setRaca("Labrador");
		cadastro.setPeso(10.5);
		cadastro.setDono("Ricardo");
		
		
		System.out.println("Animal: " + cadastro.getAnimal());
		System.out.println("Sexo: " + cadastro.getSexo());
		System.out.println("Nome: " + cadastro.getNome());
		System.out.println("Idade: " + cadastro.getIdade() + " meses");
		System.out.println("Raça: " + cadastro.getRaca());
		System.out.println("Peso: " + cadastro.getPeso());
		System.out.println("Dono(a/e): " + cadastro.getDono());
		

	}

}
