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
		System.out.println("������ ȣ��");
	}
	public this_(String title)
	{
		this(title,"���ڹ̻�");
	}
	public this_(String title,String author)
	{
		this.title=title;
		this.author=author;
	}
	public static void main(String[] args)
	{
		this_ a = new this_("�����", "����");
		this_ b = new this_("������");WW
		this_ c= new this_();
		b.show();
	}
}
