package ex;

public class Calculations
{
	public void areaСalculation(double side1, double side2)
	{
		System.out.println(side1 * side2);
	}
	
	public void areaСalculation(double side1, double side2, double side3)
	{
		double p = 0.5 * (side1 + side2 + side3);
		System.out.println(Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)));
	}
	
	public void perimeterСalculation(double side1, double side2)
	{
		System.out.println(2 * (side1 + side2));
	}
	
	public void perimeterСalculation(double side1, double side2, double side3)
	{
		System.out.println(side1 + side2 + side3);
	}
}