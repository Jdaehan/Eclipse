import java.util.Scanner;

public class StringRotateOnEnter {
	public static void main(String[] args) {
		// String Ŭ���� Ȱ�� Bonus 3
		System.out.println("���ڿ��� �Է��ϼ���. �� ĭ�̳� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		System.out.println("<Enter>�� �Է��ϸ� ���ڿ��� �� ���ھ� ȸ���մϴ�.");
		while(true) { // while ��
			String key = scanner.nextLine();
			if(key.equals("")) { // <Enter> Ű �ܿ� �ٸ� �Էµ� Ű�� ���� ���
				String first = text.substring(0, 1); // ù ��° ���� �˾Ƴ���
				String last = text.substring(1); // ������ ���ڿ�
				text = last.concat(first); // ������ ���ڿ� �ڿ� ù ��° ���� ����
				System.out.print(text + " >> "); // �ϼ��� ���ڿ��� ">>" ȭ�� ���
			}
			else if(key.equals("q")) // q�� �Է��� ���
				   break;  // ȸ�� ����	   
			else // q�� �ƴ� �ٸ� Ű�� �Էµ� ���	
				System.out.print(text + ">>"); // ���� ���ڿ� ���
			}
			System.out.println("�����մϴ�...");
			scanner.close();
	}
}
