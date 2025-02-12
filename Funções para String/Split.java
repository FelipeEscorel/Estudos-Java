package secao7;

public class Split {

	public static void main(String[] args) {
		
		String s = "potato apple lemon";
		
		String[] vetor = s.split(" "); //Guarda as strings no vetor indicado, usando nesse caso o espaço em branco como separador
		
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
	}

}
