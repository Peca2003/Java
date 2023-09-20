package package1;

public class Main
{
    public static void main(String[] args)
    {
        int [] array = new int[10];
        squarestable(array);
        System.out.println("\n\n");
        cubestable(array);
    }
    public static int[] squarestable(int [] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int)Math.pow(i, 2);
        }
        System.out.println("-----------------------------------------");
        System.out.println("|\tЗначение индекса\t|\tРезультат\t|");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("|\t\t\t" + i + "\t\t\t|\t\t" + array[i] + "\t\t|");
        }
        System.out.println("-----------------------------------------");
        return array;
    }

    public static int[] cubestable(int [] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int)Math.pow(i, 3);
        }
        System.out.println("-----------------------------------------");
        System.out.println("|\tЗначение индекса\t|\tРезультат\t|");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("|\t\t\t" + i + "\t\t\t|\t\t" + array[i] + "\t\t|");
        }
        System.out.println("-----------------------------------------");
        return array;
    }
}
