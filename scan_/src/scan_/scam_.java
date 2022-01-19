package scan_;
import java.util.Scanner;
public class scam_ 
{
	public static void main(String []args)
	{
		System.out.println("이름, 국가, 나이를 빈칸으로 분리하여 입력");
		Scanner scanner =new Scanner(System.in);
		
		
		String Name = scanner.next();
		System.out.print("이름은 "+ Name +", ");
		
		String city = scanner.next();
		System.out.print("국가는 "+ city +", ");
		
		int Age = scanner.nextInt();
		System.out.print("나이는" + Age +", ");
		scanner.close();
		
		///nextline()은 엔터를 치기전까지 모든것을 리턴
		///netxline()하고 엔터값은 남아있다 후에 next,nextline을 쓸 거면 엔터값을 비워줌 = nextline한번 더 쓰기 
	}
}
