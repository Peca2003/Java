public class Apple extends Fruits
{
    private double m_Price;

    public Apple(double m_Weight, double m_Price) {
        super(m_Weight);
        this.m_Price = m_Price;
    }

    @Override
    public double priceFruit() {
        return m_Weight * m_Price;
    }
}
