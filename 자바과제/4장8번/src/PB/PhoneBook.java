package PB;
import java.util.Scanner;
class Phone
{
	private String name;
	private String tel;
	Phone(String na, String tl){
		name=na;
		tel=tl;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}
public class PhoneBook 
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Phone phone[];
		int cnt=0;
		System.out.print("인원수>> ");
		int person = sc.nextInt();
		phone = new Phone[person];
		
		sc.nextLine();
		
		for(int i=0; i<phone.length; i++){
			System.out.print("이름과 전화번호(이름과 번호는 "
					+ "빈 칸없이 입력)>>");
			
			String name = sc.next();
			String tel = sc.next();
			phone[i] = new Phone(name, tel);
			
			sc.nextLine();
		}
		System.out.println("저장되었습니다...");
		while(true) {
			System.out.print("검색할 이름>>");
			String name=sc.nextLine();
			if(name.equals("그만"))
				break;
			for(int i=0; i<person; i++) {
				cnt=0;
				if(name.equals(phone[i].getName())) {
					System.out.println(name+"의 번호는 "
						+ phone[i].getTel()+" 입니다.");
					cnt++;
					break;
				}
			}
			if(cnt==0)
				System.out.println(name+" 이 없습니다.");
		}
	}
}
