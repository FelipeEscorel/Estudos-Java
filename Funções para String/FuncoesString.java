public class FuncoesString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
				
		String s01 = original.toLowerCase(); // Transforma em minúsculo
		String s02 = original.toUpperCase(); // Transforma em maiúsculo
		String s03 = original.trim(); // Elimina os espaços no final da String
		String s04 = original.substring(2); // Gera uma nova String usando somente depois da posição indicada
		String s05 = original.substring(2, 9); // Gera uma nova String que fica entre os índices propostos
		String s06 = original.replace('a', 'x'); // Troca todos os primeiros caracteres pelo segundo indicado
		String s07 = original.replace("abc", "xy"); // Também funciona com substrings
		int a = original.indexOf("bc"); // Guarda a posição da primeira vez em que a string indicada aparece
		int b = original.lastIndexOf("bc"); // Guarda a posição da última vez em que a string indicada aparece
		
		System.out.printf("Original: -%s-\n\n",original);
		System.out.printf("toLowerCase: -%s-\n",s01);
		System.out.printf("toUpperCase: -%s-\n",s02);
		System.out.printf("trim: -%s-\n",s03);
		System.out.printf("substring(2): -%s-\n",s04);
		System.out.printf("substring(2, 9): -%s-\n",s05);
		System.out.printf("replace('a', 'x'): -%s-\n",s06);
		System.out.printf("replace('abc', 'xy'): -%s-\n",s07);
		System.out.printf("indexOf('bc'): -%s-\n",a);
		System.out.printf("lastIndexOf('bc'): -%s-\n",b);
	}

}
