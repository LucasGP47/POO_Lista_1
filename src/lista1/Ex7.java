package lista1;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Informe o lado: ");
		
		float lado = ent.nextFloat();
		
		float area = (float) lado * lado;
		
		System.out.println("Area do circulo: " + area);
		
		ent.close();

	}

}
