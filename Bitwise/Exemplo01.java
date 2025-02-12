import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mascara = 0b00100000; // Ou 32
		int n = sc.nextInt();
	
		if ((n & mascara) != 0) {
			System.out.println("O 6° bit é verdadeiro");
		}
		else {
			System.out.println("O 6° bit é falso");
		}
		sc.close();
	}

}
