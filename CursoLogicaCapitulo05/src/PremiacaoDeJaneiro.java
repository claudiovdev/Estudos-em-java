import java.util.Scanner;

public class PremiacaoDeJaneiro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double metaDeFaturamentoAnual = 80000.0;
		Double faturamentoRealDaEmpresa = null;
		Double salarioFuncionario = null;
		
		System.out.print("Digite o faturamento anual da empresa no ano de 2020: ");
		faturamentoRealDaEmpresa = scanner.nextDouble();
		
		System.out.print("Digite o s�lario do funcionario Jo�o: ");
		salarioFuncionario = scanner.nextDouble();
		
		
		Double mediaSalariaDoFuncionario = (salarioFuncionario / 100.0) * 80;
		Double percentualAumentoSalario = (mediaSalariaDoFuncionario / 100.0) * 80;
		Double percentualAbaixoDaMeta = (metaDeFaturamentoAnual * 80)/100;
		
		Boolean premioPormetaAtingida = faturamentoRealDaEmpresa >= metaDeFaturamentoAnual;
		Boolean premioPor80DaMeta = faturamentoRealDaEmpresa >= percentualAbaixoDaMeta;
		
		
		if(premioPormetaAtingida) {
			System.out.println("Parab�ns a empresa atingiu a meta anual e voc� ganhar� um bonus de: R$" + mediaSalariaDoFuncionario);
			
		}else if (premioPor80DaMeta) {
			System.out.println("Voc� receber� um pr�mio pela empresa ter alcan�ado 80% do valor da meta estipulada e ser� no valor de  : R$" + percentualAumentoSalario);
		} else {
			System.out.println("A empresa n�o bateu a meta");
		}
	}
}
