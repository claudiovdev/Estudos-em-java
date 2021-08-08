
public class TipoLogico {

	public static void main(String[] args) {
		Boolean variavelVerdadeira = true;
		
		Boolean variavelFalsa = false;
		
		System.out.println(("---------------------------"));
		
		Integer idade = 18;
		
		
		Boolean podeTirarCarteira = idade >= 18;
		
		
		if(podeTirarCarteira) {
			System.out.println("Sim! Ele pode tirar a carteira");
		}else {
			System.out.println("Não! Ele não pode tirar a carteira");
		}
	}
}
