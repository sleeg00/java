package 단어의_개수;
import java.util.Scanner;
public class 단어의_개수 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int cnt=0;
		String[] kk;
		kk = st.split("");
		int i=0;
		int sw=0;
		if(st.length()==1 && kk[0].isBlank())
		{
			System.out.println(cnt);
			System.exit(0);
		}
		while(i<st.length())
		{
						
			if(kk[i].isBlank() && i+1!=st.length())
			{
				if(sw>=1)
				{
					cnt++;
					sw=0;
				}
				
			}
			else if(!kk[i].isBlank())
				sw++;
			i++;
			
		}
		System.out.println(cnt+1);

	}
}


