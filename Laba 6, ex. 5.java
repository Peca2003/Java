public class Main
{
	public static void main(String[] args)
	{
		int [][] array;
		array = new int[3][4];
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

		for (int i = 0; i < 3; i++)
		{
		    for (int j = 0; j < 4; j++)
		    {
		        for (int k = 0; k < 4; k++)
		        {
		            if (array[i][j] < array[i][k])
		            {
		                int temp = array[i][j];
		                array[i][j] = array[i][k];
		                array[i][k] = temp;
		            }
		        }
		    }
		}
		System.out.println("Отсортированные строки массива по возрастанию: ");
		for (int i = 0; i < 3; i++)
		{
		    for (int j = 0; j < 4; j++)
		    {
		        System.out.print(array[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}
