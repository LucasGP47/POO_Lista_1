package lista1;
import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Informe o tamanho em metros: ");
		
		float metros = ent.nextFloat();
		
		float centímetros = metros * 100;
		
		System.out.println("Tamanho em centímetros: " + centímetros);
		
		ent.close();
		
	}

}
