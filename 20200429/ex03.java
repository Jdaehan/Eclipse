/*
package pro20191450;
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// 돈을 입력하여 ~~ 1원까지 개수를 구하는 프로그램 - 5만원권, 만원권, 천원권, 500원권, 100원, 10원 1월 개수)
		Scanner in = new Scanner(System.in);
		System.out.print("돈의 액수를 입력하세요: ");
		int money = in.nextInt();
		
		int n50000, n10000, n1000, n500, n100, n10, n1; //변수 선언
		
		n50000 = money /50000; //5만원권 개수
		money = money % 50000; //5만원으로 나눈 나머지 값을 현재 돈의 액수로 저장
		n10000= money / 10000; //만원권 개수가 결정
		money = money % 10000;
		n1000 = money / 1000; //천원권 개수가 결정
		money = money % 1000;
		n500 = money / 500; //오백원 개수가 결정
		money = money % 500;
		n100 = money / 100; //백원 개수가 결정
		money = money % 100;
		n10 = money/10; //십원 개수가 결정
		money = money % 10;
		n1 = money/1; //1원 개수가 결정
		
		//결과출력
		System.out.println("오만원권: " + n50000 + "개");
		System.out.println("만원권: " + n10000 + "개");
		System.out.println("천원권: " + n1000 + "개");
		System.out.println("백원권: " + n100 + "개");
		System.out.println("십원권: " + n10 + "개");
		System.out.println("일원권: " + n1 + "개");
	}

}
*/
