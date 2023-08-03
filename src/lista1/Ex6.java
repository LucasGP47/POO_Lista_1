package lista1;
import java.util.Scanner;

public class Ex6 {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Informe o raio do circulo: ");
		
		float raio = ent.nextFloat();
		
		float area = (float) ((raio * raio) * 3.14);
		
		System.out.println("Area do circulo: " + area);
		
		ent.close();
		
	}

}
