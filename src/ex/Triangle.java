package ex;

public class Triangle
{
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double a, double b, double c)
    {
        this.firstSide = a;
        this.secondSide = b;
        this.thirdSide = c;
    }

    public double getFirstSide() { return firstSide; }
    public void setFirstSide(double a) { this.firstSide = a; }

    public double getSecondSide() { return secondSide; }
    public void setSecondSide(double b) { this.secondSide = b; }

    public double getThirdSide() { return thirdSide; }
    public void setThirdSide(double c) { this.thirdSide = c; }
}
