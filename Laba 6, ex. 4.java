public class Main
{
	public static void main(String[] args)
	{
		int [][] array;
		array = new int[3][4];
		int sum = 0;
		for (int i = 0; i < 3; i++)
		{
		    for (int j = 0; j < 4; j++)
		    {
		        array[i][j] = (int)Math.round(Math.random() * 99 + -49);
		    }
		}
		System.out.println("Двумерный массив:");
		for (int i = 0; i < 3; i++)
		{
		    for (int j = 0; j < 4; j++)
		    {
		        System.out.print(array[i][j] + " ");
		    }
		    System.out.println();
		}
		System.out.println("Номера ячеек массива с отрицательными числами: ");
		for (int i = 0; i < 3; i++)
		{
		    for (int j = 0; j < 4; j++)
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
