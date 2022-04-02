package song;
import java.util.Scanner;
class re
{
	int x,y,width,height;
	re() {}
	re(int x1, int y1, int width1, int height1)
	{
		x=x1;
		y=y1;
		width=width1;
		height=height1;
	}
	int square()
	{
		return width*height;
	}
	void show()
	{
		System.out.println(x+" "+y+" "+width*height);
	}
	boolean contains(re r)
	{
		if((x<r.x) && (y<r.y) && (x+width)>(r.x+r.width) && (y+height)>(r.y+r.height))
			return true;
		else
			return false;
	}
}
public class Main 
{
	public static void main(String[] args)
	{
		re r = new re(2,2,8,7);
		re s = new re(5,5,6,6);
		re t = new re(1,1,10,10);
		r.show();
		System.out.println("s의 면적은 "+s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다");
	}
}
