import java.util.Scanner;

public class AlterandoValorVariavel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o tipo do pagamento [1 = � vista / 2 = � prazo] :");
		Integer tipoPagamento = scanner.nextInt();
		
		Boolean pagamentoAvista = tipoPagamento.equals(1);
		
		Double juros = 0.0;
		
		if(!pagamentoAvista) {
			juros = 10.0;
		}
		
		Double acrescimo = valorProduto * juros / 100;
		Double valorTotal = valorProduto + acrescimo;
		
		System.out.println("O valor total ser�: " + valorTotal);
		 
	}
}
