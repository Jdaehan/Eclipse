import java.util.Scanner;
abstract class shape { // abstract�� �߻� �޼ҵ�  ����, shape�� �߻� Ŭ����
	abstract void crate(); // draw(��κ���) ��ſ� crate�� �����߽��ϴ�.
}
class Editor extends shape{
	Scanner scanner = new Scanner(System.in);
	static int i = 0; // Ŭ���� ����
	private String[] Shape = new String[10];
	public void into() { // insert(����) ��ſ� ������ ���� into�� �����߽��ϴ�.
		System.out.print("���� ���� Line(1), Rect(2), Circle(3) >> ");
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
	public void Delete() { // delete�� ù��° ö�ڸ� �빮�ڷ� �����غ��ҽ��ϴ�. �̻��� �������.
		System.out.print("������ ������ ��ġ >> ");
		int location = scanner.nextInt();
		if(i < location) {
			System.out.println("������ �� �����ϴ�."); }
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

public class �ǽ�����6�� {

	public static void main(String[] args) {
		// ���̵��� �ſ� ���� Line, Rect, Circle Ŭ���� ��� ���� ���� ���α׷�
		Scanner scanner = new Scanner(System.in);
		Editor e = new Editor();
		boolean f = true;
		while(f == true) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4) >> ");
			int into = scanner.nextInt();
			switch(into) {
			case 1 : // ����
				e.into();
				break;
			case 2 : // ����
				e.Delete();
				break;
			case 3 : // ��� ����
				e.crate();
				break;
			case 4 : // ���α׷� ���� 
				System.out.println("���α׷��� �����մϴ�...");
				f = false;
				break;
				
			}
		}

	}

}
