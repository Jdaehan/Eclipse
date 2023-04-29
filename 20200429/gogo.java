package pro20191450;
import java.util.Scanner;
public class gogo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

		System.out.print("논리 연산을 입력하세요>>"); 

		boolean a = scanner.nextBoolean(); // 첫 번째 논리 값 일기 

		String op = scanner.next(); // 논리 연산자를 문자열로 읽기 

		boolean b = scanner.nextBoolean(); // 두 번째 논리 값 일기 

		//boolean은 true와 false를 값으로 가집니다. 

		//메서드 안에서는 반드시 초기화가 이루어져야합니다. 

		boolean res=false; // 단순히 초기화한 것임 

		switch(op) { // JDK 1.7이상 
		case "AND": res = a && b; break; 
		case "OR" : res = a || b; break; 
        default: 

		System.out.println("잘못된 논리 연산자입니다"); 
		} 
		System.out.println(res); 
        scanner.close(); 


	}
}
