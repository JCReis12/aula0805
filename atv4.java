package estruturaPosCondicionada;

import java.util.Scanner;
public class atv4 {

	public static void main(String[] args) {
		Scanner jc = new Scanner (System.in);
		int idade;
		int i = 0;
		int n = 0;
		
		while (i<20) {
		System.out.print("Qual a sua idade: ");
		idade = jc.nextInt();
			i++;
			if (idade >= 18) {
				System.out.println("Essa pessoa é maior de idade");
			n++;
			}
			if (idade < 18) {
				System.out.println("Essa pessoa é menor de idade");
			}
		
		System.out.println(" ");
		System.out.println(n+" pessoas são maiores de idade.");

		}
	}

}
