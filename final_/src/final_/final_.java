package final_;
import java.util.Scanner;
public class final_ 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("������ �Է�:");
			int div = scanner.nextInt();
			System.out.print("�������� �Է�:");
			
			int div2 = scanner.nextInt();
			try
			{
				System.out.println(div + "�� "+div2 +"�� ������ ���� "+div/div2+"�Դϴ�");
				break;
			}
			catch(ArithmeticException e)
			{
				System.out.println("0���δ� ���� �� �����ϴ�!");
			}
			scanner.close();
		}
	}
}
