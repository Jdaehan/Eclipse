package gogo;
import java.util.Scanner;

public class JangDaeHan {

	public static void main(String[] args) {
		// ���� �ϳ��� �Է��Ͽ� ������ ����ϴ� ���α׷�
		Scanner jd1=new Scanner(System.in);
		
		int Score; //�ڹ����α׷��� ����
		
		System.out.print("�ڹ� ���α׷��� ���� �Է�:");
		Score = jd1.nextInt();
		
		if(Score>=90)
			System.out.println("�ڹ� ���α׷��� ���� :" + Score + ",����: A");
		else if(Score>=80)
			System.out.println("�ڹ� ���α׷��� ���� :" + Score + ",����: B");
		else if(Score>=70)
			System.out.println("�ڹ� ���α׷��� ���� :" + Score + ",����: c");
		else
			System.out.println("�ڹ� ���α׷��� ���� :" + Score + ",����: F");
	}
}
	
