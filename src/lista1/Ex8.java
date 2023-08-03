package lista1;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		
		System.out.print("Informe o valor da hora trabalhada: ");
		
		float hora = ent.nextFloat();
		
		System.out.print("Informe o numero de horas trabalhadas no mes: ");
		
		float horasTrab = ent.nextFloat();
		
		float total = hora * horasTrab;
		
		System.out.println("Area do circulo: " + total);
		
		ent.close();

	}

}
