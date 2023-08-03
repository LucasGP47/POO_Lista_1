package lista1;

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Informe dois numeros para soma:");
		
		int aux = ent.nextInt();
		int aux2 = ent.nextInt();
		
		System.out.println("Soma: " + (aux + aux2));
		
		ent.close();

	}

}
