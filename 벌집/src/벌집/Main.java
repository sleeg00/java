package ¹úÁı;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int k = sc.nextInt();
		sc.nextLine();
		int cnt=1;
		int hap=1;
		int sw=0;
		if(k==1)
			System.out.println(1);
		else
		{
			while(sw==0)
			{
				hap=hap+cnt*6;
				cnt++;
				if(hap>=k)
				{
					System.out.println(cnt);
					break;
				}
			}
		}
	}
}
