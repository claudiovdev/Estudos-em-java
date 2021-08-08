import java.util.Scanner;

public class GanhaDescontoNaQuantidade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Por favor digite o valor da camisa que o senhor gostaria: ");
		Double camisa = scanner.nextDouble();
		
		System.out.print("Agora por favor digite a quantidade de camisas: ");
		Double quantidadeDeCamisas = scanner.nextDouble();
		
		Double subTotal = camisa * quantidadeDeCamisas;
		
		
		Boolean promocao = quantidadeDeCamisas >= 10;
		
		Double desconto = 10.0;
		
		if(!promocao) {
			desconto = 0.0;
		}
		
		
		Double valorDesconto = subTotal * desconto / 100;
		Double valorFinal = subTotal + valorDesconto;
		
		System.out.println("Testando o valor " + valorFinal);
		
		
		
		
		
		
		
		
	}
}
