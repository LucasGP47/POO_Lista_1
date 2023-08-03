package lista1;
import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Informe sua altura: ");
		
		float h, p = 0; 
		
		h = ent.nextFloat();
		p = (float) (72.7 * h - 58);
       
        
        System.out.println("Seu peso ideal e " + p);
        
        ent.close();
	
        }

}
