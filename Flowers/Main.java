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

        double totalPriceBouquetRoses = calculatePrice(bouquetRoses);
        double totalPriceBouquetLiliesTulips = calculatePrice(bouquetLiliesTulips);
        double totalPriceBouquet = calculatePrice(bouquet);
        System.out.println();
        System.out.println("Стоимость букета роз = " + totalPriceBouquetRoses);
        System.out.println("Стоимость букета лилий и тюпьпанов  " + totalPriceBouquetLiliesTulips);
        System.out.println("Стоимость букета ассорти = " + totalPriceBouquet);

        int flowersSold = bouquetRoses.length + bouquetLiliesTulips.length + bouquet.length;
        numberFlowersSold += flowersSold;
        System.out.println("\nКоличество проданных цветов = " + numberFlowersSold);
    }
    public static double calculatePrice(Flower [] flowers)
    {
        double flowersPrice = 0;
        for (Flower flower : flowers)
        {
            flowersPrice += flower.getPrice();
        }
        return flowersPrice;
    }
}