package pro20191450;
import java.util.Scanner;
public class jang01 {

	public static void main(String[] args) {
		// Scanner 객체선언을 응용한 2번 문제
		Scanner hi = new Scanner(System.in);
		//입력할 층수의 값이 될 값 한개의 입력
		int n1, mul;
		//인터페이스, 곱셈
		System.out.print("몇 층인지 입력하세요");
		n1 = hi.nextInt();
		mul = n1 * 5;
		
		System.out.println(mul+"m"+ " 입니다");
	}
}
