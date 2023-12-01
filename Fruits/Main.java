public class Main
{
    public static void main(String[] args)
    {
        Fruits apple = new Apple(23, 95);
        Fruits apricot = new Apricot(55, 100);
        Fruits pear = new Pear(32, 110);

        double sumSoldFruits = apple.priceFruit() + apricot.priceFruit() + pear.priceFruit();
        System.out.println("Общая стоимость проданных фруктов = " + sumSoldFruits);

        System.out.println("Стоимость проданных яблок = " + apple.priceFruit());
        System.out.println("Стоимость проданных абрикос = " + apricot.priceFruit());
        System.out.println("Стоимость проданных груш = " + pear.priceFruit());
    }
}