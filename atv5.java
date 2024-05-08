package estruturaPosCondicionada;

import java.util.Scanner;
public class atv5 {

	public static void main(String[] args) {
		Scanner jc = new Scanner (System.in);
		int i = 0;
		int soma = 0, val;
		
		while (i < 10) {
			i++;
		System.out.println("Digite um valor: ");
		val = jc.nextInt();
		
		soma += val;
		
	}
		System.out.println(" ");
		System.out.println("O resultado para a soma é: "+soma);
}
		

}
