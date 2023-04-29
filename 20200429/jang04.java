package pro20191450;
import java.util.Scanner;
public class jang04 {

	public static void main(String[] args) {
		// 369 게임 프로그램 제작
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하세요>>");
		num = scanner.nextInt();
		int first = num/10;
		int second = num%10;
		System.out.print("박수");
		if(first % 3 == 0 || second % 3 == 0) {
			if(first % 3 == 0 && first != 0) {
				System.out.print("짝");
				if(second % 3 == 0 && second != 0)
					System.out.print("짝");			
			}
			else if(second % 3 == 0 && second != 0)
			    System.out.print("짝");  
		}    
			else
			    System.out.println("없음");
			
	
	}

}
