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
		
		System.out.println("Agora digite o operador que voc� dejesa usar");
		System.out.print("As op��es s�o: [ '+' Soma , '-'Subitra��o, '/' para divis�o e '*' para Multiplica��o ]: ");
		operador = scanner.next().charAt(0);
		
		System.out.print("Por favor Digite o segundo numero a ser calculado: ");
		segundoNumero = scanner.nextInt();
		
		if(operador == '+') {
			resultado = primeiroNumero + segundoNumero;
			operacao = "soma ";
		}else if(operador == '-') {
			resultado = primeiroNumero - segundoNumero;
			operacao = "subitra��o ";
		}else if(operador == '/'){
			resultado = primeiroNumero / segundoNumero;
			operacao = "divis�o ";
		}else if(operador == '*'){
			resultado = primeiroNumero * segundoNumero;
			operacao = "multiplica��o ";
		};
		
		System.out.println("O resultado da " + operacao + "�: " + resultado);
		scanner.close();
	}
}
