package ����������;
import java.util.Scanner;
public class �������ǰ��������� {

	public static void main(String[] args) 
		// �ݺ����� ���ǹ��� Ȱ���� ���������� ���� ���α׷� �����Ӱ� ������
	{
		System.out.println("�����̿� ¥���� ����������!!");
		Scanner scanner = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
		while(true) {
			System.out.println("����..����..��!!>>");
			String attacker =scanner.next();
			int ra = (int)(Math.random()*3);
			int hitnum = 0;
			if(attacker.equals("�������"))	
			{	
				System.out.println("������ �����մϴ�.");
				break;
			}
			if(attacker.equals("����")) {hitnum = 0;}
			if(attacker.equals("����")) {hitnum = 1;}
			if(attacker.equals("��")) {hitnum = 2;}
			System.out.print("���� = " + attacker + ", " + "���� = " +str[ra] + ", ");
			if((hitnum + 2) % 3 == ra)
				System.out.println("���� ������.������ ���������� ��⸦ �̰���ϴ�.");
			else if(hitnum == ra)
				System.out.println("�ƽ��Ե� �����ϴ�. ���� �ؾ߰ڱ���.");
			else
				System.out.println("�ұ��� ����� �ɵ�����. �����̰� �̰���ϴ�.");			
			}
	        scanner.close();
	}	
}
