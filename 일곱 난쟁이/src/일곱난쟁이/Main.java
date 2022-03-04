package ÀÏ°ö³­ÀïÀÌ;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int []a=new int[10000];
		int hap=0;
		
		
		for(int i=0; i<9; i++)
		{
			a[i]=sc.nextInt();
			hap+=a[i];
		}
		
		
		sc.nextLine();
		int im,sw=0;
		
		
		for(int i=0; i<9; i++)
			for(int j=i+1; j<9; j++)
				if(a[i]>a[j])
				{
					im=a[i];
					a[i]=a[j];
					a[j]=im;
				}
		
		
		for(int i=0; i<9; i++)
			for(int j=i+1; j<9; j++)
				if((a[i]+a[j])==(hap-100) && sw==0)
				{
					a[i]=0;
					a[j]=0;
					sw=1;
				}
		
		
		for(int i=0; i<9; i++)
			if(a[i]>0)
				System.out.println(a[i]);
		
		
	}
}
