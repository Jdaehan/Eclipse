import java.util.Scanner;
public class Modify {
	public static void main(String[] args) {
		// StringBuffer, Math.random() ���� Ȱ���� ���� ���� Bonus2 ����
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = scanner.nextLine(); // �� �� �б�
			StringBuffer sb = new StringBuffer(s); // StringBuffer ��ü ����
			if(s.equals("exit")) { // sb�� ���ڿ��� "exit"�̸� ����
				System.out.println("�����մϴ�...");
				break;
			}
			int index = (int)(Math.random()*s.length()); // ������ ���� ��ġ ����
			while(true) {
				int i = (int)(Math.random()*26); // ���ĺ� �߿��� ����
				char c = (char)('a' + i); // ������ ���� ����
				if(!sb.equals(c)) { // sb�� ���ڿ� c�� �ٸ� ���
					// sb���� index�� �ִ� ���ڸ� ���� c�� ����
					sb.replace(index, index+1, Character.toString(c)); // ���ڸ� ���ڿ� Ÿ������ ��ȯ
					break;
				}
			}
			System.out.println(sb);
		} // end of while
		scanner.close();
	}
}
