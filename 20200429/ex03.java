/*
package pro20191450;
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// ���� �Է��Ͽ� ~~ 1������ ������ ���ϴ� ���α׷� - 5������, ������, õ����, 500����, 100��, 10�� 1�� ����)
		Scanner in = new Scanner(System.in);
		System.out.print("���� �׼��� �Է��ϼ���: ");
		int money = in.nextInt();
		
		int n50000, n10000, n1000, n500, n100, n10, n1; //���� ����
		
		n50000 = money /50000; //5������ ����
		money = money % 50000; //5�������� ���� ������ ���� ���� ���� �׼��� ����
		n10000= money / 10000; //������ ������ ����
		money = money % 10000;
		n1000 = money / 1000; //õ���� ������ ����
		money = money % 1000;
		n500 = money / 500; //����� ������ ����
		money = money % 500;
		n100 = money / 100; //��� ������ ����
		money = money % 100;
		n10 = money/10; //�ʿ� ������ ����
		money = money % 10;
		n1 = money/1; //1�� ������ ����
		
		//������
		System.out.println("��������: " + n50000 + "��");
		System.out.println("������: " + n10000 + "��");
		System.out.println("õ����: " + n1000 + "��");
		System.out.println("�����: " + n100 + "��");
		System.out.println("�ʿ���: " + n10 + "��");
		System.out.println("�Ͽ���: " + n1 + "��");
	}

}
*/
