public class Main
{
	public static void main(String[] args)
	{
		int [][] matrixC;
		int [][] matrixD;
		matrixC = new int[3][3];
		matrixD = new int [3][3];
		System.out.println("Матрица C: ");
		for (int i = 0; i < 3; i++)
		{
		    for (int j = 0; j < 3; j++)
		    {
		        matrixC[i][j] = (int)Math.round(Math.random() * 99);
		        System.out.print(matrixC[i][j] + " ");
		    }
		    System.out.println();
		}
		System.out.println("\nМатрица D: ");
		for (int i = 0; i < 3; i++)
		{
		    for (int j = 0; j < 3; j++)
		    {
		        matrixD[i][j] = (int)Math.round(Math.random() * 99);
		        System.out.print(matrixD[i][j] + " ");
		    }
		    System.out.println();
		}
		System.out.println("\nСумма матриц: ");
		int [][] sumMatrix;
		sumMatrix = new int[3][3];
		for (int i = 0; i < 3; i++)
		{
		    for (int j = 0; j < 3; j++)
		    {
		        sumMatrix[i][j] = matrixC[i][j] + matrixD[i][j];
		        System.out.print(sumMatrix[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}