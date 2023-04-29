package pro20191450;
import java.util.Scanner;
public class jang03 {
	public static void main(String[] args) {
		// 학점을 switch문을 활용해 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		String score;
		
		System.out.print("학점을 입력하세요>>");
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
			System.out.print("학점을 잘못입력 하셨습니다.");
		
		}
		
	}

}
