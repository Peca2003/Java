package ex;

public class Rectangle
{
    private double firstSide;
    private double secondSide;

    public Rectangle(double a, double b)
    {
        this.firstSide = a;
        this.secondSide = b;
    }

    public double getFirstSide() { return firstSide; }
    public void setFirstSide(double a) { this.firstSide = a; }

    public double getSecondSide() { return secondSide; }
    public void setSecondSide(double b) { this.secondSide = b; }
}
