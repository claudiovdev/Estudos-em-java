import java.util.Scanner;

public class TipoTexto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Ol� meu nome � " + nome + "!");
		
		scanner.close();
	}
}
