import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Sal func = new Sal();

		System.out.print("Nome:");
		func.Nome = sc.next();
		System.out.println("Salário bruto:");
		func.SB= sc.nextDouble();
		System.out.println("Imposto: ");
		func.IMP = sc.nextDouble();
		
		System.out.println();
		System.out.println("Empregado: " + func);
		
		System.out.println();
		System.out.println("Qual a porcentagem do aumento de salário?");
		double porc = sc.nextDouble();
		
		func.AS(porc);
		
		System.out.println();
		System.out.println("Salário atualizado: " + func);
		
		sc.close();
		
	}

}
