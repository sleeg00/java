package scan_;
import java.util.Scanner;
public class scam_ 
{
	public static void main(String []args)
	{
		System.out.println("�̸�, ����, ���̸� ��ĭ���� �и��Ͽ� �Է�");
		Scanner scanner =new Scanner(System.in);
		
		
		String Name = scanner.next();
		System.out.print("�̸��� "+ Name +", ");
		
		String city = scanner.next();
		System.out.print("������ "+ city +", ");
		
		int Age = scanner.nextInt();
		System.out.print("���̴�" + Age +", ");
		scanner.close();
		
		///nextline()�� ���͸� ġ�������� ������ ����
		///netxline()�ϰ� ���Ͱ��� �����ִ� �Ŀ� next,nextline�� �� �Ÿ� ���Ͱ��� ����� = nextline�ѹ� �� ���� 
	}
}