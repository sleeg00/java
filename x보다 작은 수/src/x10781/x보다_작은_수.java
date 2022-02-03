package x10781;
import java.util.Scanner;
public class x보다_작은_수 
{
	public static void main(String[] args)
	{
		Scanner n1 = new Scanner(System.in);
		int n=n1.nextInt();
		int a=n1.nextInt();
		n1.nextLine();
		int b[] = new int[100000];
		int im=0;
		int cnt=0;
		int end_[] = new int[100000];
		for(int i=0; i<n; i++)
		{
			int x = n1.nextInt();
			b[i]=x;
			if(b[i]<a)
			{
				end_[cnt++]=b[i];
			}
		}
		for(int i=0; i<cnt; i++)
			System.out.print(end_[i]+" ");
	}
}
