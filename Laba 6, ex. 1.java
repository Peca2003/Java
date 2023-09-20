public class Main
{
	public static void main(String[] args)
	{
		int [][] matrix;
		matrix = new int[5][6];
		for (int i = 0; i < array.length; i++)
		{
		    for (int j = 0; j < array[i].length; j++)
		    {
		        matrix[i][j] = (int)Math.round(Math.random() * 99);
		        System.out.print(matrix[i][j] + " ");
		    }
		    System.out.println();
		}
		System.out.println("\nТретья строка матрицы: ");
		for (int i = 2; i < 3; i++)
		{
		    for (int j = 0; j < array[i].length; j++)
		    {
		        System.out.print(matrix[i][j] + " ");
		    }
		}
	}
}
