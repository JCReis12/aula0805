package estruturaPosCondicionada;

import java.util.Scanner;
public class atv6 {

	public static void main(String[] args) {
		Scanner jc = new Scanner (System.in);
		int i = 0;
		int v;
		String nome;
		
		
		System.out.print("Qual seu nome: ");
		nome = jc.nextLine();
		
		System.out.print("Digite um numero de 1 a 10: ");
		v = jc.nextInt();
		
		while (i < v) {
			System.out.println(nome);
			i++;
		}
	}

}
