packje µ¿Àü0
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int memo=0;
		sc.nextLine();
		int []a = new int[100000000];
		for(int i=0; i<n; i++)
		{
			String c=sc.nextLine();
			a[i]=Integer.parseInt(c);
		}
		sc.close();
		for(int i=0; i<n; i++)
		{
			if(a[i]>k)
			{
				memo=i;
				break;
			}
		}
		if(memo==0)
			memo=n-1;
		int ch,hap=0,cnt=0;
		for(int i=memo; i>=0; i--)
		{
			ch=k/a[i];
			if(ch>0)
			{
				k-=ch*a[i];
				cnt+=ch;
			}
			
			if(k==0)
			{
				break;
			}
		}
		System.out.println(cnt);
	}
}
