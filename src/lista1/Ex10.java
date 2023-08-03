package lista1;
import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Informe 2 numeros inteiros e um real");
		
		int n1, n2;
		float r;
		double p, s, c;
		
		n1 = ent.nextInt();
		n2 = ent.nextInt();
		r = ent.nextFloat();
		
		p = (n1 * 2) * (n2 / 2);
		
		s = (n1 * 3) + r;
		
		c = (r * r * r);
		
		System.out.println("o produto e: " + p);
		
		System.out.println("a soma e: " + s);
		
		System.out.println("o cubo e: " + c);
		
		ent.close();

	}

}
