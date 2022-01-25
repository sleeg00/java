package this_;

public class this_ 
{
	
	String title;
	String author;
	
	void show() 
	{
		System.out.println(title+" " + author);
	}
	public this_()
	{
		this("","");
		System.out.println("생성자 호출");
	}
	public this_(String title)
	{
		this(title,"작자미상");
	}
	public this_(String title,String author)
	{
		this.title=title;
		this.author=author;
	}
	public static void main(String[] args)
	{
		this_ a = new this_("어린왕자", "생쥐");
		this_ b = new this_("춘향전");WW
		this_ c= new this_();
		b.show();
	}
}
