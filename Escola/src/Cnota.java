
public class Cnota {

	String nome;
	double n1, n2, n3;
	
	public double NF()
	{
		return n1 + n2 + n3;
	}
	
	public double NQF()
	{
		return 60 - NF();
	}
}
