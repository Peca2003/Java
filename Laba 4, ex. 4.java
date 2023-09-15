package ex1;

public class Main
{
	public static void main(String[] args)
	{
		// Задание 4
		//***************************************************************
		System.out.println("\n\nЗадание 4");
		int sizeArray = 10;
		int[] array3 = new int[sizeArray];
		for (int i = 0; i < sizeArray; i++)
		{
			array3[i] = (int)Math.round(Math.random() * 100);
		    System.out.print(array3[i] + " ");
		}
		int maxValue = array3[0];
		int minValue = array3[0];
		int indexMax = 0;
		int indexMin = 0;
		for (int i = 0; i < sizeArray; i++)
		{
			if (maxValue > array3[i])
			{
				maxValue = array3[i];
				indexMax = i;
			}
			if (minValue < array3[i])
			{
				minValue = array3[i];
				indexMin = i;
			}
		}
		System.out.print("\n");
		int temp = array3[indexMin];
		array3[indexMin] = array3[indexMax];
		array3[indexMax] = temp;
		for (int i = 0; i < sizeArray; i++)
		{
		    System.out.print(array3[i] + " ");
		}
	}
}
