package ∫Ì∑¢¿Ë;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		sc.nextLine();
		int []a= new int[1000];
		int hap=0;
		int max=0;
		for(int i=0; i<n; i++)
			a[i]=sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				for(int k=i; k<n; k++)
				{
					if(k!=i && k!=j)
					{
						hap=a[i]+a[j];
						hap=hap+a[k];
						if(hap<m)
						{
							if(max<hap)
								max=hap;
						}
						else if(hap==m)
						{
							max=hap;
							break;
						}
					}
				}
			}
		}
		System.out.println(max);
	}
}

