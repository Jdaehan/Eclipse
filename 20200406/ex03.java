import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
//�迭 �����ϰ� 5�� �Է¹��� ��(�Է�)�߿� ���� ū ��(��)�� ���
		Scanner input = new Scanner(System.in);
		int num[] = new int[5]; //�迭 ����
		int max=0;
		
		System.out.println("5���� ��� ���� �Է�:"); // �Է� �������̽�
		for(int i=0;i<5;i++)
		{
			num[i] = input.nextInt();
			if(num[i]>max) max=num[i];
			//System.out.print(num[i]+" ");
		}
		System.out.println("\n���� ū��: " + max );

			

	}

}
