package 예제;
import java.util.Scanner;

public class 예제
{
	public static void main(String[] args)
	{
		int cnt=0;
		int sum=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요");
		
		int n= scanner.nextInt();
		while(n!=-1)
		{
			sum+=n;
			cnt++;
			n=scanner.nextInt();
		}
		if(cnt==0)
			System.out.println("입력된 수가 없습니다");
		else
		{
			System.out.print("정수의 개수는 " + cnt + "개이며");
			System.out.println("평균은 "+ (double)sum/cnt + "입니다");
		}
	}
}
