import java.util.Scanner;
abstract class shape { // abstract로 추상 메소드  선언, shape는 추상 클래스
	abstract void crate(); // draw(모두보기) 대신에 crate로 선언했습니다.
}
class Editor extends shape{
	Scanner scanner = new Scanner(System.in);
	static int i = 0; // 클래스 변수
	private String[] Shape = new String[10];
	public void into() { // insert(삽입) 대신에 저만의 언어로 into로 선언했습니다.
		System.out.print("도형 종류 Line(1), Rect(2), Circle(3) >> ");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			Shape [i] = "Line";
			i++;
			break;
		case 2:
			Shape [i] = "Rect";
			i++;
			break;
		case 3:
			Shape [i] = "Circle";
			i++;
			break;
		}
	}
	public void Delete() { // delete의 첫번째 철자를 대문자로 선언해보았습니다. 이상은 없었어요.
		System.out.print("삭제할 도형의 위치 >> ");
		int location = scanner.nextInt();
		if(i < location) {
			System.out.println("삭제할 수 없습니다."); }
		else {
			(Shape[location-1]) = null;
		}
	} 
	public void crate() {
		for(int j = 0; j < i; j++) {
			System.out.println(Shape[j]);
		}
	}
	
}

public class 실습문제6번 {

	public static void main(String[] args) {
		// 난이도가 매우 높은 Line, Rect, Circle 클래스 상속 종합 응용 프로그램
		Scanner scanner = new Scanner(System.in);
		Editor e = new Editor();
		boolean f = true;
		while(f == true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
			int into = scanner.nextInt();
			switch(into) {
			case 1 : // 삽입
				e.into();
				break;
			case 2 : // 삭제
				e.Delete();
				break;
			case 3 : // 모두 보기
				e.crate();
				break;
			case 4 : // 프로그램 종료 
				System.out.println("프로그램을 종료합니다...");
				f = false;
				break;
				
			}
		}

	}

}
