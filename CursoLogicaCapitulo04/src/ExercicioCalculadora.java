import java.util.Scanner;

public class ExercicioCalculadora {
	
	static Integer primeiroNumero;
	static Integer segundoNumero;
	static Integer resultado;
	static char operador;
	static String operacao;
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("CALCULADORA SIMPLES!");
		System.out.print("Por favor Digite o primeiro numero a ser calculado: ");
		primeiroNumero = scanner.nextInt();
		
		System.out.println("Agora digite o operador que você dejesa usar");
		System.out.print("As opções são: [ '+' Soma , '-'Subitração, '/' para divisão e '*' para Multiplicação ]: ");
		operador = scanner.next().charAt(0);
		
		System.out.print("Por favor Digite o segundo numero a ser calculado: ");
		segundoNumero = scanner.nextInt();
		
		if(operador == '+') {
			resultado = primeiroNumero + segundoNumero;
			operacao = "soma ";
		}else if(operador == '-') {
			resultado = primeiroNumero - segundoNumero;
			operacao = "subitração ";
		}else if(operador == '/'){
			resultado = primeiroNumero / segundoNumero;
			operacao = "divisão ";
		}else if(operador == '*'){
			resultado = primeiroNumero * segundoNumero;
			operacao = "multiplicação ";
		};
		
		System.out.println("O resultado da " + operacao + "é: " + resultado);
		scanner.close();
	}
}
