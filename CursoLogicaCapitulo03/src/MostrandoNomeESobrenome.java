import java.util.Scanner;

public class MostrandoNomeESobrenome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Olá informe o nome do usuario: ");
		String nome = scanner.nextLine();
		
		System.out.println("Agora digite o sobrenome por gentileza: ");
		String sobreNome = scanner.nextLine();
		
		System.out.println("O resultado da soma das variaveis é :" + nome + " " + sobreNome);
	}
}
