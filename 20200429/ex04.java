package pro20191450;
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		// ī�� �޴� ���� �� ��� ���α׷�
		Scanner cho = new Scanner(System.in);
		//if-else �������� ����
		//�޴���� �������̽� - user�� ������ �����ֵ��� �ϴ� �κ�
		System.out.println("----- �޴� -----");
		System.out.println("1.����������(2000��) 2.�Ƹ޸�ī��(2500��)");
		System.out.println("3.īǪġ��(3000��) 4.ī���(3500��)");
		System.out.println("�޴� �� ������ �ּ���: ");
		int menu = cho.nextInt();
		System.out.println("������ �Է��ϼ���:");
		int num = cho.nextInt();
		if(menu==1)
	    {System.out.println("�ֹ� ����: "+2000*num+"�� �Դϴ�");
		System.out.println("���������� ������ �弼��");}
		else if(menu==2)
		{System.out.println("�ֹ� ����: "+2500*num+"�� �Դϴ�");
	    System.out.println("�Ƹ޸�ī�� ������ �弼��");}
		else if(menu==2)
		{System.out.println("�ֹ� ����: "+2500*num+"�� �Դϴ�");
		System.out.println("�Ƹ޸�ī�� ������ �弼��");}
		else if(menu==3)
	    {System.out.println("�ֹ� ����: "+3000*num+"�� �Դϴ�");
	    System.out.println("īǪġ�� ������ �弼��");}
		else if(menu==4)
	    {System.out.println("�ֹ� ����: "+3500*num+"�� �Դϴ�");
	    System.out.println("ī��� ������ �弼��");}
		
		/*switch(menu)
		{
		case 1:{System.out.println("�ֹ� ����: "+2000*num+"�� �Դϴ�");
		System.out.println("���������� ������ �弼��");} break;
		case 2:{System.out.println("�ֹ� ����: "+2500*num+"�� �Դϴ�");
	    System.out.println("�Ƹ޸�ī�� ������ �弼��");} break;
		case 3:{System.out.println("�ֹ� ����: "+3000*num+"�� �Դϴ�");
	    System.out.println("īǪġ�� ������ �弼��");} break;
		case 4:{System.out.println("�ֹ� ����: "+3500*num+"�� �Դϴ�");
	    System.out.println("ī��� ������ �弼��");} break;
	    default:System.out.println("�޴� �߸� �����ϼ̽��ϴ�");
		}*/
	    
	}

}
