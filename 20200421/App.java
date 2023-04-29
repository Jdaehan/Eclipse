import java.util.Scanner;
abstract class Calculator {
	protected int a, b;
	abstract protected int calc(); // �߻� �޼ҵ�
	protected void input() { // �� ������ �Է¹޴� �޼ҵ�
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� 2���� �Է��ϼ���>>");
		a = scanner.nextInt();
		b = scanner.nextInt();	
	}
	public void run() { // �� ������ �Է¹޾� ����ϰ� ����� ����ϴ� �޼ҵ�
		input();
		int res = calc();
		System.out.println("���� ���� " + res);
	}
} // ���� ������ ���翡�� ������ ������ �״�� �ű� ����.
class Adder extends Calculator{ //Adder Ŭ������ ����Ҷ� ����� extends Ű����
	protected int calc() {return a + b;}  
} // ù��° �������  ������ �̿��ؼ� ������� ������
class Subtracter extends Calculator{ //Subtracter Ŭ������ ����Ҷ� ����� extends Ű����	
	protected int calc() {return a - b;} 
} // �ι�° ������� ������ �̿��ؼ� ������� ������ 
public class App{
	public static void main(String[] args) {
		Adder adder = new Adder();
		Subtracter sub = new Subtracter();
		
		adder.run();
		sub.run();
	}	
	
}
