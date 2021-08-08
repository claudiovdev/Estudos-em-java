import java.util.Scanner;

public class QuadradoDeUmNumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o numero que você quer saber o quadadro dele: ");
		Integer numeroDigitado = scanner.nextInt();
		
		Integer resultado = numeroDigitado * 2;
		
		System.out.println("O quadrado de " + numeroDigitado + " é: " + resultado);
		
		scanner.close();
	}
}
