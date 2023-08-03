package lista1;
import java.util.Scanner;

public class Ex16 {
	
public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Informe a area a ser pintada: ");
		
		int cont = 1;
		float area,  litros;
		double preco,m, m1,preco1;
		area = ent.nextFloat();
		
		litros = area / 6;

		switch (cont) {

		case 1:
		if (litros % 18 != 0) {
			m = (int) litros / 18;
			m = m+1;
		} else {
			m = litros / 18;
			}
		preco = m * 80;
		System.out.println("Sao necessarios " + m + " latas de tinta que irao custar " + preco + " reais.");
		cont = cont + 1;
				
		case 2:
			if (litros % 3.6 != 0) {
				m1 = (int) litros / 3.6;
				m1 = m1 +1;
				System.out.println(m1);
			} else {
				m1 = (int) litros / 3.6;
				}
			preco1 = m1 * 25;
			
			System.out.println("Sao necessarios " + m1 + " galoes de tinta que irao custar " + preco1 + " reais.");

			}
		
		ent.close();
			
	}

}
