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
		System.out.print("�ο���>> ");
		int person = sc.nextInt();
		phone = new Phone[person];
		
		sc.nextLine();
		
		for(int i=0; i<phone.length; i++){
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� "
					+ "�� ĭ���� �Է�)>>");
			
			String name = sc.next();
			String tel = sc.next();
			phone[i] = new Phone(name, tel);
			
			sc.nextLine();
		}
		System.out.println("����Ǿ����ϴ�...");
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String name=sc.nextLine();
			if(name.equals("�׸�"))
				break;
			for(int i=0; i<person; i++) {
				cnt=0;
				if(name.equals(phone[i].getName())) {
					System.out.println(name+"�� ��ȣ�� "
						+ phone[i].getTel()+" �Դϴ�.");
					cnt++;
					break;
				}
			}
			if(cnt==0)
				System.out.println(name+" �� �����ϴ�.");
		}
	}
}
