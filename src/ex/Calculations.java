package ex;

public class Calculations
{
    public double areaСalculation(double side1, double side2)
    {
        return (side1 * side2);
    }

    public double areaСalculation(double side1, double side2, double side3)
    {
        double p = 0.5 * (side1 + side2 + side3);
        return (Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)));
    }

    public double perimeterСalculation(double side1, double side2)
    {
        return (2 * (side1 + side2));
    }

    public double perimeterСalculation(double side1, double side2, double side3)
    {
        return (side1 + side2 + side3);
    }
}
