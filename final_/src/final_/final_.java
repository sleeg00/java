package final_;
import java.util.Scanner;
public class final_ 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("나눔수 입력:");
			int div = scanner.nextInt();
			System.out.print("나눗수를 입력:");
			
			int div2 = scanner.nextInt();
			try
			{
				System.out.println(div + "를 "+div2 +"로 나누면 몫은 "+div/div2+"입니다");
				break;
			}
			catch(ArithmeticException e)
			{
				System.out.println("0으로는 나눌 수 없습니다!");
			}
			scanner.close();
		}
	}
}
