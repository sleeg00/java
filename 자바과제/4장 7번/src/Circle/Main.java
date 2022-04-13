package Circle;
import java.util.Scanner;
class MS
{
	Scanner sc = new Scanner(System.in);
	
	int dayN;
	Day day[];
	boolean state = true;
	public MS(int x)
	{
		dayN=x;
		day = new Day[dayN];
		for(int i=0; i<day.length; i++)
			day[i]=new Day();
	}
	MS(){}
	void input()
	{
		int i = sc.nextInt();
		String work = sc.next();
		day[i-1].set(work);
	}
	void view()
	{
		int i = sc.nextInt();
		day[i-1].show();
	}
	void finish()
	{
		state=false;
	}
	void run()
	{
		int op;
		while(state)
		{
			op=sc.nextInt();
			if(op==1)
			{
				input();
				break;
			}
			else if(op==2)
			{
				view();
				break;
			}
			else if(op==3)
			{
				finish();
				break;
			}
			System.out.println();
		}
	}
}
class Day
{
	private String work;
	public void set(String work) {this.work=work;}
	public String get() {return work; }
	public void show()
	{
		if(work==null) System.out.println("없습니다.");
		else System.out.println(work+"입니다.");
	}
}
public class Main 
{
	public static void main(String[] args)
	{
		MS april = new MS(30);
		april.run();
	}
}
