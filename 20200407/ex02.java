//제작 - 20191450 장대한
import java.util.InputMismatchException;
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// 정수 3개의 값을 입력받아 계산하는 프로그램
		// 만약 정수아닌 값이 들어오면 오류에 대한 예외가 발생하게 된다
		Scanner in = new Scanner(System.in);
		
		System.out.println("정수값 3개를 입력: "); //입력에 필요한 인터페이스
		int sum=0, n=0;
		for(int i=0; i<3;i++) {
			   System.out.println(i+">>");
	           try{
	    	         n = in.nextInt();
	              }
	           catch(InputMismatchException e) {
			        System.out.println("정수가 아닙니다. 다시 입력하세요!");
			        in.next(); //입력 스트림에 있는 정수가 아닌 값을 버린다.
		            i--;
		            continue;		    
		       }
	                sum = sum + n;
         	}          
		System.out.println("3개의 정수 합: " + sum);
	}
}
