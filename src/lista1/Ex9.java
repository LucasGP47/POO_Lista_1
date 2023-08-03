package lista1;
import java.util.Scanner;

public class Ex9 {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em Farenheit: ");
		
		float t, c;
		
		t = ent.nextFloat();
		
		c = (5 * (t - 32) / 9);
		
		System.out.println("A temperatura em celsius e: " + c);
		
		ent.close();
		
	}

}
