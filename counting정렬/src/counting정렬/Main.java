package counting정렬;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		
		int k;
		int[]b=new int[n];
		
		for(int i=0; i<n; i++)
		{
			k=sc.nextInt();
			b[k]++;
			sc.nextLine();
		}
		
		
		sc.close();
		

		int cnt=0;
		for(int i=1; i<=10000; i++)
		{
			for(int j=0; j<b[i]; j++)
			{
				System.out.println(i);
				cnt++;
			}
			if(cnt==n)
				break;
		}
	}
}
/*
 * import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N= Integer.parseInt(br.readLine());
        int[] count = new int[10001];
 
        for (int i = 0; i < N; i++) 
            count[Integer.parseInt(br.readLine())] ++;
         
        for(int i = 1; i < 10001; i++){
            while(count[i] > 0){
                sb.append(i).append('\n');
                count[i]--;
            }
        }
        System.out.println(sb);
        br.close();
    }
} 입력문 출력문 메모리최소하 하기
*/
