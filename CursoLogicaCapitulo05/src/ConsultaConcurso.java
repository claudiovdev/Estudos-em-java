
public class ConsultaConcurso {

	public static void main(String[] args) {
		Double notaPortugues = 8.0;
		Double notaMatematica = 7.0;
		Double notaMinimaporMateria = 6.0;
		
		Boolean mediaPorMateria = notaPortugues >= notaMinimaporMateria && notaMatematica >= notaMinimaporMateria;
		Boolean aprovado = notaPortugues + notaMatematica >= 15;
		
		if( mediaPorMateria && aprovado) {
			System.out.println("Candidato aprovado");
		} else {
			System.out.println("Candidato reprovado!!");
		}
	}
	
}
