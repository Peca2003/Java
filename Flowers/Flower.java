public class Flower
{
    private String m_Manufacturer;
    private int m_ShelfLife;
    private double m_Price;

    public Flower(String manufacturer, int shelfLife, double price)
    {
        this.m_Manufacturer = manufacturer;
        this.m_ShelfLife = shelfLife;
        this.m_Price = price;
    }

    public double getPrice()
    {
        return m_Price;
    }
}