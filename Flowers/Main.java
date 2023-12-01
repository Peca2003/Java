import java.util.Random;

public class Main
{
    private static int numberFlowersSold = 0;
    public static void main(String[] args)
    {
        Flower [] bouquet1 = generateRandomBouquet();
        Flower [] bouquet2 = generateRandomBouquet();
        Flower [] bouquet3 = generateRandomBouquet();

        double totalPriceBouquet1 = calculatePrice(bouquet1);
        double totalPriceBouquet2 = calculatePrice(bouquet2);
        double totalPriceBouquet3 = calculatePrice(bouquet3);

        System.out.println();
        System.out.println("\nСтоимость первого букета = " + totalPriceBouquet1);
        printFlowerName(bouquet1);
        System.out.println("\nСтоимость второго букета = " + totalPriceBouquet2);
        printFlowerName(bouquet2);
        System.out.println("\nСтоимость третьего букета = " + totalPriceBouquet3);
        printFlowerName(bouquet3);

        int flowersSold = bouquet1.length + bouquet2.length + bouquet3.length;
        numberFlowersSold += flowersSold;
        System.out.println("\nКоличество проданных цветов = " + numberFlowersSold);
    }
    public static Flower [] generateRandomBouquet()
    {
        Random random = new Random();
        int bouquetSize = random.nextInt(5) + 1;

        Flower [] bouquet = new Flower[bouquetSize];
        for (int i = 0; i < bouquetSize; ++i)
        {
            int randomFlowerType = random.nextInt(4);

            switch (randomFlowerType)
            {
                case 0:
                    bouquet[i] = new Rose("Нидерланды", 3, 150);
                    break;
                case 1:
                    bouquet[i] = new  Carnation("Франция", 5, 100);
                    break;
                case 2:
                    bouquet[i] = new Tulip("Иран",  5, 70);
                    break;
                case 3:
                    bouquet[i] = new Lily("Нидерланды",  7, 200);
                    break;
            }
        }
        return bouquet;
    }

    public static void printFlowerName(Flower [] flowers)
    {
        System.out.println("Состав букета: ");
        for (Flower flower : flowers)
        {
            if (flower instanceof Rose) {
                System.out.print("Роза ");
            }
            else if (flower instanceof Carnation) {
                System.out.print("Гвоздика ");
            }
            else if (flower instanceof Tulip) {
                System.out.print("Тюльпан ");
            }
            else {
                System.out.print("Лилия ");
            }
        }
        System.out.println();
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