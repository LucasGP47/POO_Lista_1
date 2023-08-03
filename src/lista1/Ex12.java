package lista1;
import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Informe a altura :");
		
		float h, p, p1;
		
		h = ent.nextFloat();
		
		p = (float) ((72.7* h) - 58);
		p1 = (float) ((62.1*h) - 44.7);
		
		System.out.println("O peso ideal para homens e : " + p);
		System.out.println("Ja o peso ideal para mulheres e " + p1);
		
		ent.close();
		
	
}

}
