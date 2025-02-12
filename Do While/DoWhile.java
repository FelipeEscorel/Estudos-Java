import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, soma;
		do {
			System.out.print("Digite o primeiro número: ");
			num1 = sc.nextInt();
			System.out.print("\nDigite o segundo número: ");
			num2 = sc.nextInt();
			soma = num1 + num2;
			System.out.printf("\nA soma dos dois número é: %d\n", soma);
		
	} while (soma < 11);
		sc.close();
}
}