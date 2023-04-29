package pro20191450;
import java.util.Scanner;
public class jang02 {
	public static void main(String[] args) {
		// And와 OR 논리 연산을 입력받아 true, false를 판별하는 프로그램 제작
		boolean a,b;
		String log;
		Scanner scanner = new Scanner(System.in);
		System.out.println("논리연산을 입력하세요>>");
	   a = scanner.nextBoolean(); log = scanner.next(); b= scanner.nextBoolean();
	    switch(log) {
	    case "AND":
	    	System.out.println(a&&b); 
	    	break;  
	   	    case "OR":
	    	System.out.println(a||b);
	    	break;
	    default:
	      System.out.println("잘못된 논리 연산자 입력입니다.");
	}
	    
   }
}
