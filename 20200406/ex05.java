
public class ex05 {
	public static void main(String[] args) {
		// 4�� ��ü ���� ���� ����ϴ� ���α׷� ����
		double score[][] = {{4.02, 4.12},{4.13, 4.15},{4.2,4.25},{4.3,4.5} };
		double sum=0;
		for(int year=0; year<score.length; year++) // �� �г⺰�� �ݺ�
			for(int term=0; term<score[year].length; term++) //��ü ���� ��
				sum += score[year][term]; // ��ü ���� ��
		
	int n=score.length; //�迭�� �� ����, 4
	int m=score[0].length; //�迭�� �� ����, 2
	System.out.println("4�� ��ü ���� ����� " + sum/(n*m));
	
		
	}

}
