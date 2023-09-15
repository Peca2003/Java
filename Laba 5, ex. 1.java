public class Main
{
	public static void main(String[] args)
	{
		int[] array = new int[20];
		for (int i = 0; i < array.length; i++)
		{
		    array[i] = (int)Math.round(Math.random() * 1000);
		    System.out.print(array[i] + " ");
		}
		System.out.println("");
		for (int i = array.length - 1; i > 0; i--)
		{
		    for (int j = 0; j < i; j++)
		    {
		        if (array[j] < array[j + 1])
		        {
		            int temp = array[j];
		            array[j] = array[j + 1];
		            array[j + 1] = temp;
		        }
		    }
		}
		for (int i = 0; i < array.length; i++)
		{
		    System.out.print(array[i] + " ");
		}
	}
}
