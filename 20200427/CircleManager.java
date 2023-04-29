class Circle {
	private int x, y, radius;
	public Circle(int x, int y, int radius) {
		this.x = x; this.y = y; this.radius = radius; // �ʵ� �ʱ�ȭ
	}
	public String toString() { // Circle ��ü�� ���ڿ��� ����
		return "(" + x + "," + y + ")" + " ������ " + radius;
	}
	public boolean equals(Object obj) { // equals() �޼ҵ�
		Circle circle = (Circle)obj;
		return this.radius == circle.radius;
	}	
}
public class CircleManager {
	public static void main(String[] args) {
		// Ŭ���� ����� ���� Bonus1 ����
		Circle a = new Circle(1, 2, 10);
		Circle b = new Circle(5, 6, 10);
		System. out. println("�� 1: " + a);
		System. out. println("�� 2: " + b);
		if(a.equals(b)) System.out.println("���� ���Դϴ�.");
		else System.out.println("�ٸ� ���Դϴ�. ");
	}
}
