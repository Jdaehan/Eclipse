package pro20191450;
import java.util.Scanner;
public class jang04 {

	public static void main(String[] args) {
		// 369 ���� ���α׷� ����
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��ϼ���>>");
		num = scanner.nextInt();
		int first = num/10;
		int second = num%10;
		System.out.print("�ڼ�");
		if(first % 3 == 0 || second % 3 == 0) {
			if(first % 3 == 0 && first != 0) {
				System.out.print("¦");
				if(second % 3 == 0 && second != 0)
					System.out.print("¦");			
			}
			else if(second % 3 == 0 && second != 0)
			    System.out.print("¦");  
		}    
			else
			    System.out.println("����");
			
	
	}

}
