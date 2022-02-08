package 손익분기점;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int start=c-b;
        sc.nextLine();
		if(c-b<=0)
			System.out.println(-1);
		else
			System.out.println(a/start+1);
	}
}