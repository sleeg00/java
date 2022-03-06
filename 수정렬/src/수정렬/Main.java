package ¼öÁ¤·Ä;
import java.util.Scanner;
public class Main
{
	public static int[] b;
	public static int [] a;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
	
		a=new int[n];
		b = new int[n];
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
			sc.nextLine();
		}
		
		sc.close();
		
		
		msort(0,a.length-1);
		pr(a);
		
	}
	public static void msort(int left, int right)
	{
		if(left<right)
		{
			int mid=(left+right)/2;
			msort(left,mid);
			msort(mid+1, right);
			
			int p=left;
			int q=mid+1;
			int idx=p;
			
			while(p<=mid || q<=right)
			{
				if(q>right || (p<=mid && a[p]<a[q]))
						b[idx++]=a[p++];
				else
					b[idx++]=a[q++];
			}
			for(int i=left; i<=right; i++)
				a[i]=b[i];
		}
	}
	public static void pr(int[] a)
	{
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);
	}
}
