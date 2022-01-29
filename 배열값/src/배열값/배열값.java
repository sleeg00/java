package 배열값;
import java.util.Scanner;
public class 배열값 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int gap=0;
		int [][] start;
		int [][] end;
		start = new int[n][n];
		end = new int[n][n];
		
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
			{
				gap=scanner.nextInt();
				start[i][j]= gap;
			}
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				
				if(start[i][j]!=0)
					end[i][j]=start[i][j]*start[i][j-1];
			}
		}
	}
}
