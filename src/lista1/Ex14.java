package lista1;
import java.util.Scanner;

public class Ex14 {
	
public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Informe o numero de horas trabalhadas: ");
		
		float horas;
		
		horas = ent.nextFloat();
		
		System.out.println("Informe o quanto voce ganha por hora: ");
		
		float ph, salario_bruto, INSS, sindicato, salario_INSS, salario_sindicato;
		
		ph = ent.nextFloat();
		
		
		salario_bruto = horas * ph;
		
		salario_INSS = (float) (salario_bruto - (salario_bruto * 0.08));
		
		INSS = salario_bruto - salario_INSS;
		
		salario_sindicato = (float) (salario_bruto - (salario_bruto * 0.05));
		
		sindicato = salario_bruto - salario_sindicato;
		
		float salario_ir, ir, descontos, salario_liquido;
		
		salario_ir = (float) (salario_bruto - (salario_bruto * 0.11));
		
		ir = salario_bruto - salario_ir;
		
		descontos = ir + sindicato + INSS;
		
		salario_liquido = salario_bruto - descontos;
		
		System.out.println("Seu salario liquido e: " + salario_liquido);
		
		System.out.println("O total descontado pelo INSS foi: "+ INSS);
		
		System.out.println("O total descontado pelo sindicato foi: "+ sindicato);
		
		System.out.println("O total descontado pelo Imposto de Renda foi: " + ir);
		
		System.out.println("O total descontado foi: " + descontos);
		
		System.out.println("Seu salario bruto foi: " + salario_bruto);
		
		ent.close();
		
	}

}



