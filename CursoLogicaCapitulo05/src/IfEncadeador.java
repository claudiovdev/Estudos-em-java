import java.util.Scanner;

public class IfEncadeador {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite seu peso: ");
		Double peso = scanner.nextDouble();
		
//		Boolean pesoMedio = (peso > 60) && (peso <= 90);
//		Boolean pesoLeve = peso <= 60;
//		Boolean pesoPesado = peso > 90;
		
		
//		if(pesoLeve) {
//			System.out.println("O lutador � peso leve");
//		} else {
//			if(pesoMedio) {
//				System.out.println("O lutador � peso m�dio");
//			}else {
//				if(pesoPesado) {
//					System.out.println("O lutador � peso Pesado");
//				}
//			}
//		}
		
		Boolean pesoMedio = (peso > 60) && (peso <= 90);
		Boolean pesoLeve = peso <= 60;
		Boolean pesoPesado = peso > 90;
		
		
		if(pesoLeve) {
			System.out.println("O lutador � peso leve");
		}else if (pesoMedio) {
			System.out.println("O lutador � peso m�dio");
		}else if (pesoPesado) {
			System.out.println("O lutador � peso pesado");
		}
		
		
		scanner.close();
	}
}
