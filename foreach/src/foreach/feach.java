package foreach;

public class feach 
{
	enum Week {��, ȭ, ��, ��, ��, ��, ��}
	///enum�� Ÿ���̴� ���� Ÿ��
	public static void main(String[] args)
	{
		int [] n = {1,2,3,4,5};
		String name [] = {"���", "��", "�ٳ���", "ü��", "�ޱ�", "����"};
		
		int sum=0;
		for (int k : n) ///k�� n.length��ŭ �ݺ�
		{
			System.out.print(k+ " ");
			sum+=k;
		}
		System.out.println("���� "+sum);
		
		for(String s : name)
		{
			System.out.print(s+ " ");
			System.out.println();
		}
		
		for(Week day : Week.values())
		{
			System.out.print(day + "����");
			System.out.println();
		}
	}
}
