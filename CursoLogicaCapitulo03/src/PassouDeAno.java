import java.util.Scanner;

public class PassouDeAno {

	static final Double NOTA_NESCESSARIA_PARA_APROVACAO = 7.0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Por favor digite a nota que você tirou para confirmar se foi aprovado: ");
		Double aluno = scanner.nextDouble();
		
		
		Boolean passouDeAno = aluno >= NOTA_NESCESSARIA_PARA_APROVACAO;
		
		if(passouDeAno) {
			System.out.println("Parabens você passou de ano, sua nota foi " + aluno);
		}else {
			System.out.println("Você reprovou de ano!");
		}
	}
}
