public class Main
{
	public static void main(String[] args)
	{
		int [][] array;
		array = new int[3][4];
		for (int i = 0; i < array.length; i++)
		{
		    for (int j = 0; j < array[i].length; j++)
		    {
		        array[i][j] = (int)Math.round(Math.random() * 99 + -49);
		    }
		}
		System.out.println("Двумерный массив:");
		for (int i = 0; i < array.length; i++)
		{
		    for (int j = 0; j < array[i].length; j++)
		    {
		        System.out.print(array[i][j] + " ");
		    }
		    System.out.println();
		}
		System.out.println("Номера ячеек массива с отрицательными числами: ");
		for (int i = 0; i < array.length; i++)
		{
		    for (int j = 0; j < array[i].length; j++)
		    {
		        if (array[i][j] < 0)
		        {
		            System.out.print(i);
		            System.out.print(j + " ");
		        }
		    }
		    System.out.println();
		}
	}
}
