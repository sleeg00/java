package 그룹단어체커_;
import java.util.Scanner;
import java.util.Arrays;
public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		int sw=0;
		for(int j=0; j<n; j++)
		{
			String k =sc.nextLine();
			sw+=checker(k);
		}
		
		System.out.println(sw);
	}
	public static int checker(String w)
	{
		char[] ch=w.toCharArray();
		char cnt;
		int [] dap;
		dap = new int[1000000];
		int i=0;
		int count=99;
		while(i<w.length())
		{
			
			cnt=ch[i];
			dap[cnt-48]++;
			if(dap[cnt-48]>=1)
			{
				if(dap[cnt-48]>1 && ch[i-1]!=ch[i])
				{
					count=0;
					break;
				}
			}
			i++;
		
		}
		if(count!=0)
			return 1;
		else
			return 0;
	}
}
