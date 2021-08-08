import java.util.Scanner;

public class PremiacaoDeJaneiro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double metaDeFaturamentoAnual = 80000.0;
		Double faturamentoRealDaEmpresa = null;
		Double salarioFuncionario = null;
		
		System.out.print("Digite o faturamento anual da empresa no ano de 2020: ");
		faturamentoRealDaEmpresa = scanner.nextDouble();
		
		System.out.print("Digite o sálario do funcionario João: ");
		salarioFuncionario = scanner.nextDouble();
		
		
		Double mediaSalariaDoFuncionario = (salarioFuncionario / 100.0) * 80;
		Double percentualAumentoSalario = (mediaSalariaDoFuncionario / 100.0) * 80;
		Double percentualAbaixoDaMeta = (metaDeFaturamentoAnual * 80)/100;
		
		Boolean premioPormetaAtingida = faturamentoRealDaEmpresa >= metaDeFaturamentoAnual;
		Boolean premioPor80DaMeta = faturamentoRealDaEmpresa >= percentualAbaixoDaMeta;
		
		
		if(premioPormetaAtingida) {
			System.out.println("Parabéns a empresa atingiu a meta anual e você ganhará um bonus de: R$" + mediaSalariaDoFuncionario);
			
		}else if (premioPor80DaMeta) {
			System.out.println("Você receberá um prêmio pela empresa ter alcançado 80% do valor da meta estipulada e será no valor de  : R$" + percentualAumentoSalario);
		} else {
			System.out.println("A empresa não bateu a meta");
		}
	}
}
