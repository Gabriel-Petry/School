import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		A tri = new A();
		
		System.out.println("Entre a largura e a altura do retângulo: ");
		
		tri.la = sc.nextDouble();
		tri.al = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n ", tri.CArea());
		System.out.printf("Perimetro = %.2f%n ", tri.CPer());
		System.out.printf("Diagonal = %.2f%n ", tri.CDia());
		
		sc.close();
	}

}
