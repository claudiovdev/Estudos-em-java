
public class EstruturaIf {

	public static void main(String[] args) {
		Double emprestimo = 4000.0;
		Double movimentacaoMedia = 2000.0;
		
		
		
		Boolean movimentaPelomenosMetadeDoValor = (emprestimo * 2) >= movimentacaoMedia;
		Boolean aContaTemTempoSuficienteDeAbertura = true;
		Boolean temNomeLimpo = true;
		
		Boolean liberarEmprestimo = movimentaPelomenosMetadeDoValor && aContaTemTempoSuficienteDeAbertura && temNomeLimpo;
		
		if(liberarEmprestimo) {
			System.out.println("Sim! Pode liberar o emprestimo");
		} else {
			System.out.println("Emprestimo negado!");
		}
		
		
	}
}
