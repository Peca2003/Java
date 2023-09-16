public class Main
{
	public static void main(String[] args)
	{
		// Задание 5
		//***************************************************************
		System.out.println("\n\n\nЗадание 5");
		int arraySize = 10, sum = 0;
		float result = 0;
		int[] array4 = new int[arraySize];
		for (int i = 0; i < arraySize; i ++)
		{
			array4[i] = (int)Math.round(Math.random() * 100);
		    System.out.print(array4[i] + " ");
		}
		for (int i = 0; i < arraySize; i++)
		{
			sum += array4[i];
		}
		result = sum / arraySize;
		System.out.println("\nСреднее арифметическое = " + result);
	}
}
