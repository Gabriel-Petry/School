
public class Sal {

	String Nome;
	double SB, IMP;
	
	public double SL()
	{
		return SB - IMP;
	}
	
	public void AS(double porc)
	{
		SB += SB * porc / 100;
	}
	
	public String toString()
	{
		return Nome + ", $ " + String.format("%.2f", SL());
	}
	
}
