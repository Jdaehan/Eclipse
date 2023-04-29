package gogo;
import java.util.Scanner;

public class JangDaeHan {

	public static void main(String[] args) {
		// 점수 하나를 입력하여 학점을 출력하는 프로그램
		Scanner jd1=new Scanner(System.in);
		
		int Score; //자바프로그래밍 점수
		
		System.out.print("자바 프로그래밍 점수 입력:");
		Score = jd1.nextInt();
		
		if(Score>=90)
			System.out.println("자바 프로그래밍 점수 :" + Score + ",학점: A");
		else if(Score>=80)
			System.out.println("자바 프로그래밍 점수 :" + Score + ",학점: B");
		else if(Score>=70)
			System.out.println("자바 프로그래밍 점수 :" + Score + ",학점: c");
		else
			System.out.println("자바 프로그래밍 점수 :" + Score + ",학점: F");
	}
}
	
