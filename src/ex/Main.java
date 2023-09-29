package ex;

public class Main
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(5, 4, 6);

        Calculations calculations = new Calculations();

        System.out.println("Площадь прямоугольника = " + calculations.areaСalculation(rectangle.getFirstSide(), rectangle.getSecondSide()));
        System.out.println("Площадь треугольника = " + calculations.areaСalculation(triangle.getFirstSide(), triangle.getSecondSide(), triangle.getThirdSide()));
        System.out.println("\nПериметр прямоугольника = " + calculations.perimeterСalculation(rectangle.getFirstSide(), rectangle.getSecondSide()));
        System.out.println("Периметр треугольника = " + calculations.perimeterСalculation(triangle.getFirstSide(), triangle.getSecondSide(), triangle.getThirdSide()));
    }
}
