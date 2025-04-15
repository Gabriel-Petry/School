import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
	Scanner sc = new Scanner (System.in);
	int  cod1, cod2;
	int quantidade1, quantidade2;
	double preco1, preco2, precototal;
	
	cod1 = sc.nextInt();
	quantidade1 = sc.nextInt();
	preco1 = sc.nextDouble();
	
	cod2 = sc.nextInt();
	quantidade2 = sc.nextInt();
	preco2  = sc.nextDouble();
	
	precototal = (quantidade1 * preco1 ) + (quantidade2 * preco2);
	
	System.out.printf("valor: R$ %.2f", precototal);
	
	sc.close();
	}

}
