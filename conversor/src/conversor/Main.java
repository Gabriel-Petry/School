package conversor;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		conversor cv = new conversor();
		
		System.out.println("Qual o valor do dólar?");
		cv.PD = sc.nextDouble();
		System.out.println();
		System.out.println("Quantas cédulas serão compradas?");
		cv.qnt = sc.nextDouble();
		System.out.println();
		System.out.printf("Valor a ser pago: %.2f%n", cv.CV());
		
		sc.close();

	}

}
