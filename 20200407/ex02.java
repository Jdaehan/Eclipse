//���� - 20191450 �����
import java.util.InputMismatchException;
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// ���� 3���� ���� �Է¹޾� ����ϴ� ���α׷�
		// ���� �����ƴ� ���� ������ ������ ���� ���ܰ� �߻��ϰ� �ȴ�
		Scanner in = new Scanner(System.in);
		
		System.out.println("������ 3���� �Է�: "); //�Է¿� �ʿ��� �������̽�
		int sum=0, n=0;
		for(int i=0; i<3;i++) {
			   System.out.println(i+">>");
	           try{
	    	         n = in.nextInt();
	              }
	           catch(InputMismatchException e) {
			        System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
			        in.next(); //�Է� ��Ʈ���� �ִ� ������ �ƴ� ���� ������.
		            i--;
		            continue;		    
		       }
	                sum = sum + n;
         	}          
		System.out.println("3���� ���� ��: " + sum);
	}
}
