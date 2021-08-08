import java.util.Scanner;

public class DescontoNoFrete {
	static Double valorProduto;
	static Double valorFinal;
	static Double adicionarFrete;
	static Boolean consultarFrete;
	
	
	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		
		System.out.print("Por favor digite o valor da sua compra: ");
		valorProduto = scanner.nextDouble();
		
		adicionarFrete = 15.0;
		
		consultarFrete = valorProduto >= 100;
		
		if(consultarFrete) {
			System.out.println("O valor final do seu pedido é : " + valorProduto + " Você ganhou o frete gratis");
		}else {
			valorFinal = valorProduto + adicionarFrete;
			System.out.println("O valor final do seu pedido é : " + valorFinal);
		}
		
		scanner.close();
	}
}
