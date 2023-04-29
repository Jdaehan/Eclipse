import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
//배열 선언하고 5개 입력받은 값(입력)중에 가장 큰 값(비교)을 출력
		Scanner input = new Scanner(System.in);
		int num[] = new int[5]; //배열 선언
		int max=0;
		
		System.out.println("5개의 양수 값을 입력:"); // 입력 인터페이스
		for(int i=0;i<5;i++)
		{
			num[i] = input.nextInt();
			if(num[i]>max) max=num[i];
			//System.out.print(num[i]+" ");
		}
		System.out.println("\n가장 큰수: " + max );

			

	}

}
