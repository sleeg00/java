package ����;
import java.util.Scanner;

public class ����
{
	public static void main(String[] args)
	{
		int cnt=0;
		int sum=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���");
		
		int n= scanner.nextInt();
		while(n!=-1)
		{
			sum+=n;
			cnt++;
			n=scanner.nextInt();
		}
		if(cnt==0)
			System.out.println("�Էµ� ���� �����ϴ�");
		else
		{
			System.out.print("������ ������ " + cnt + "���̸�");
			System.out.println("����� "+ (double)sum/cnt + "�Դϴ�");
		}
	}
}
