package gogo;
import java.util.Scanner;
public class ScannerEx {

	public static void main(String[] args) {
		// Sysytem.in�� system.out.�� �̿��� �Է� ��� ���α׷� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� �̸���? ");
        String name = sc.next();
        System.out.println("����� �а�? ");
        String h = sc.next();
        System.out.println("����� ���̴�? ");
        int age = sc.nextInt();
        
        System.out.println("�ڱ�Ұ� ����");
        System.out.println("�̸�:"+name+" �а�:"+h+" ����:"+age);
	}
}

