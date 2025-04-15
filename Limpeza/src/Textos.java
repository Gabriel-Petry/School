import java.util.Scanner;

public class Textos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		sc.nextLine();
		String t1 = sc.nextLine();
		String t2 = sc.nextLine();
		String t3 = sc.nextLine();
		
		System.out.println(idade);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		sc.close();

	}

}
