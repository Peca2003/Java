public abstract class Fruits
{
    protected double m_Weight;

    public Fruits(double m_Weight) {
        this.m_Weight = m_Weight;
    }

    final public void printManufacturerInfo()
    {
        System.out.println("Сделано в России");
    }
    public abstract double priceFruit();
}
