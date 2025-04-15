import java.util.Scanner;

public class QuartoProjeto {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double x;
		double y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x > 0 && y>0) {
			System.out.println("quadrante1");
		
		}
		if (x<0 && y>0) {
			System.out.println("quadrante2");
			
		}
		if (x<0 && y  <0) {
			System.out.println("quadrante3");
			
		}
		if (x>0 && y<0) {
			System.out.println("quadrante4");
		}
		if (x == 0  && y ==0) {
			System.out.println("origem");
		}
		

		sc.close();
	}

}
