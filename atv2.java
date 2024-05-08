package estruturaPosCondicionada;

public class atv2 {

	public static void main(String[] args) {
		int i = 0;
		int sm = 0, vl;
		
		while (i<=15) {
		System.out.println(i);
		
		vl = i++;
		sm += vl;
		
		}
		System.out.println("Resultado: "+ sm);	
	}

}
