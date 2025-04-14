import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Cnota nf = new Cnota();
		
		nf.nome = sc.nextLine();
		nf.n1 = sc.nextDouble();
		nf.n2 = sc.nextDouble();
		nf.n3 = sc.nextDouble();
		
		System.out.println("Notal Final: " + nf.NF());
		
		if(nf.NF() >= 60)
		{
			System.out.println("VOCÊ PASSOU!!!!!!!!");
		}
		else
		{
			System.out.println("Você Reprovou!");
			System.out.println("Lhe Faltaram: " + nf.NQF());
		}
		
		sc.close();

	}

}
