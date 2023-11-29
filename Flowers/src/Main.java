public class Main
{
    private static int numberFlowersSold = 0;
    public static void main(String[] args)
    {
        Flower rose = new Rose("Нидерланды", 3, 150);
        Flower carnation = new  Carnation("Франция", 5, 100);
        Flower tulip = new Tulip("Иран", 5, 70);
        Flower lily = new Lily("Нидерланды", 7, 200);

        Flower [] bouquetRoses = { rose, rose, rose, rose, rose };
        Flower [] bouquetLiliesTulips = { lily,  lily, tulip, lily, lily };
        Flower [] bouquet = { rose, carnation, tulip, lily, tulip, carnation, rose };

        int priceBouquet;
    }
    public static int calculatePrice(Flower [] flowers)
    {

    }
}
