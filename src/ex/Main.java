package ex;

public class Main {

	public static void main(String[] args)
	{
		Rectangle rectangle = new Rectangle(4, 6);
		Triangle triangle = new Triangle(5, 4, 6);
		
		Calculations calculations = new Calculations();
		calculations.areaСalculation(rectangle.getFirstSide(), rectangle.getSecondSide());
		calculations.areaСalculation(triangle.getFirstSide(), triangle.getSecondSide(), triangle.getThirdSide());
		
		calculations.perimeterСalculation(rectangle.getFirstSide(), rectangle.getSecondSide());
		calculations.perimeterСalculation(triangle.getFirstSide(), triangle.getSecondSide(), triangle.getThirdSide());
	}
}