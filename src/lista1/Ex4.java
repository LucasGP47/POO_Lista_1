package lista1;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Informe as quatro notas do seu bimestre: ");
		
		float nota1 = ent.nextFloat();
		float nota2 = ent.nextFloat();
		float nota3 = ent.nextFloat();
		float nota4 = ent.nextFloat();
		
		float notaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Nota final: " + notaFinal);
		
		ent.close();
		
	}

}
