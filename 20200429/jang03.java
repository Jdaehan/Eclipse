package pro20191450;
import java.util.Scanner;
public class jang03 {
	public static void main(String[] args) {
		// ������ switch���� Ȱ���� ����ϴ� ���α׷�
		Scanner scanner = new Scanner(System.in);
		String score;
		
		System.out.print("������ �Է��ϼ���>>");
		score = scanner.next();
		
		switch(score) {
		case "A":
		case "B":
			System.out.println("Excellent");
			break;
		case "C":
		case "D":
			System.out.println("Good");
		case "F":
			System.out.println("Bye");
			break;
		default:
			System.out.print("������ �߸��Է� �ϼ̽��ϴ�.");
		
		}
		
	}

}
