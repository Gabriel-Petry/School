
public class A {

	double la, al;
	
	public double CArea()
	{
		return la * al;
	}
	
	public double CPer()
	{
		return (la * 2) + (al * 2);
	}
	
	public double CDia()
	{
		return Math.sqrt(Math.pow(la, 2) + Math.pow(al, 2));
	}
}
