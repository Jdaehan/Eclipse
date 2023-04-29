import java.util.Scanner;
abstract class Calculator {
	protected int a, b;
	abstract protected int calc(); // 추상 메소드
	protected void input() { // 두 정수를 입력받는 메소드
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요>>");
		a = scanner.nextInt();
		b = scanner.nextInt();	
	}
	public void run() { // 두 정수를 입력받아 계산하고 결과를 출력하는 메소드
		input();
		int res = calc();
		System.out.println("계산된 값은 " + res);
	}
} // 여기 까지는 교재에서 제시한 내용을 그대로 옮긴 것임.
class Adder extends Calculator{ //Adder 클래스로 상속할때 사용한 extends 키워드
	protected int calc() {return a + b;}  
} // 첫번째 결과값은  덧셈을 이용해서 결과값을 리턴함
class Subtracter extends Calculator{ //Subtracter 클래스로 상속할때 사용한 extends 키워드	
	protected int calc() {return a - b;} 
} // 두번째 결과값은 뺄셈을 이용해서 결과값을 리턴함 
public class App{
	public static void main(String[] args) {
		Adder adder = new Adder();
		Subtracter sub = new Subtracter();
		
		adder.run();
		sub.run();
	}	
	
}
