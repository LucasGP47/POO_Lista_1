package lista1;
import java.util.Scanner;

public class Ex13 {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Informe o peso dos peixes pescados: ");
		
		float p, pesot, m;
		
		p = ent.nextFloat();
		
		pesot = p - 50;
		
		if (pesot <= 0) {
			
			System.out.println("Nao tem multa, peso dentro do estabelecido");
			
		} else {
			
			m = 4 * pesot;
			
			System.out.println("Devera pagar " + m + " de multa.");
			
		}
		
		ent.close();
		
	}

}
