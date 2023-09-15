package ex1;

public class Main
{
	public static void main(String[] args)
	{
		// Задание 3
		//***************************************************************
		System.out.println("\n\nЗадание 3");
		int size = 10;
		int[] array2 = new int[size];
		for (int i = 0; i < size; i++)
		{
			array2[i] = (int)Math.round(Math.random() * 100);
		    System.out.print(array2[i] + " ");
		}
		int max = array2[0];
		for (int i = 0; i < size; i++)
		{
		    if (array2[i] > max)
		    {
		    	max = array2[i];
		    }
		}
		System.out.println("\nМаксимальное значение: ");
		for (int i = 0; i < size; i++)
		{
			if (max == array2[i])
			{
				System.out.println(max);
			}
		}
		//***************************************************************
	}
}
