package lista1;
import java.util.Scanner;

public class Ex15 {
	
public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Informe a area a ser pintada: ");
		
		float area,  litros;
		float preco;
		float m;
		area = ent.nextFloat();
		
		litros = area / 3;
		
		
		
		if (litros % 18 != 0) {
			m = (int) litros / 18;
			m = m+1;
		}
		
		else {
			m = litros / 18;
			}
		
		preco = m * 80; 

		System.out.println("Sao necessarios " + m + " latas de tinta que irao custar " + preco + " reais.");
		
		ent.close();
		
	}

}
