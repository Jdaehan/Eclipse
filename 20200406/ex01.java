/* import java. util.Scanner; 
public class ex01 {

	public static void main(String[] args) {
		// 5���� ���� �Է¹ް� ��� ���� ���ϴ� ���α׷�
		
		Scanner in = new Scanner(System.in);
		int sum=0;
		System.out.println("5���� ������ �Է��ϼ���");
		
		for(int i=0;i<5;i++)
		{	
		int n = in.nextInt();
		if(n<0) continue; // 0�Ǵ� ������ ��쿡�� ������ �ʰ� ���� �ݺ����� ����
		else sum = sum + n; // ����� ����� �����͸� ��
		System.out.println("sum="+sum+",n="+n);			
		}
		System.out.println("����� ���� ��� : "+sum);
		
		in.close();
		
	}

}
*/