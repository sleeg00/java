package ºĞÇØÇÕ;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int cnt=0;
		int m=n;
		int nmg;
		int hap=0;
		int sw=0;
		while(n>0)
		{
			if(n/10!=0)
			{
				cnt++;
				n=n/10;
			}
			else
				break;
		}
		n=m;
		cnt++;
		for(int i=n-cnt*9; i<=n; i++)
		{
			m=i;
			for(int j=1; j<=cnt; j++)
			{
				nmg=m%10;
				m=m/10;
				hap+=nmg;
			}
			hap+=i;
			if(hap==n)
			{
				System.out.println(i);
				sw=1;
				break;
			}
			else
				hap=0;
			
		}
		if(sw==0)
		System.out.println(0);
	}
}
