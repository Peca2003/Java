public class Main
{
	public static void main(String[] args)
	{
		int [][] array;
		array = new int[3][4];
		int sum = 0;
		System.out.println("Двумерный массив:");
		for (int i = 0; i < array.length; i++)
		{
		    for (int j = 0; j < array[i].length; j++)
		    {
		        array[i][j] = (int)Math.round(Math.random() * 30);
		        sum += array[i][j];
		    }
		}
		for (int i = 0; i < array.length; i++)
		{
		    for (int j = 0; j < array[i].length; j++)
		    {
		        System.out.print(array[i][j] + " ");
		    }
		    System.out.println();
		}
		System.out.println("Сумма элементов двумерного массива = " + sum);
	}
}
