package foreach;

public class feach 
{
	enum Week {월, 화, 수, 목, 금, 토, 일}
	///enum은 타입이다 나열 타입
	public static void main(String[] args)
	{
		int [] n = {1,2,3,4,5};
		String name [] = {"사과", "배", "바나나", "체리", "달기", "포도"};
		
		int sum=0;
		for (int k : n) ///k는 n.length만큼 반복
		{
			System.out.print(k+ " ");
			sum+=k;
		}
		System.out.println("합은 "+sum);
		
		for(String s : name)
		{
			System.out.print(s+ " ");
			System.out.println();
		}
		
		for(Week day : Week.values())
		{
			System.out.print(day + "요일");
			System.out.println();
		}
	}
}
