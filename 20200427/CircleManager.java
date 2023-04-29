class Circle {
	private int x, y, radius;
	public Circle(int x, int y, int radius) {
		this.x = x; this.y = y; this.radius = radius; // 필드 초기화
	}
	public String toString() { // Circle 객체를 문자열로 리턴
		return "(" + x + "," + y + ")" + " 반지름 " + radius;
	}
	public boolean equals(Object obj) { // equals() 메소드
		Circle circle = (Circle)obj;
		return this.radius == circle.radius;
	}	
}
public class CircleManager {
	public static void main(String[] args) {
		// 클래스 만들기 응용 Bonus1 문제
		Circle a = new Circle(1, 2, 10);
		Circle b = new Circle(5, 6, 10);
		System. out. println("원 1: " + a);
		System. out. println("원 2: " + b);
		if(a.equals(b)) System.out.println("같은 원입니다.");
		else System.out.println("다른 원입니다. ");
	}
}
