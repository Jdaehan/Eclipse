/* import java. util.Scanner; 
public class ex01 {

	public static void main(String[] args) {
		// 5개의 값을 입력받고 양수 합을 구하는 프로그램
		
		Scanner in = new Scanner(System.in);
		int sum=0;
		System.out.println("5개의 정수를 입력하세요");
		
		for(int i=0;i<5;i++)
		{	
		int n = in.nextInt();
		if(n<0) continue; // 0또는 음수인 경우에는 더하지 않고 다음 반복으로 진행
		else sum = sum + n; // 양수인 경우의 데이터만 합
		System.out.println("sum="+sum+",n="+n);			
		}
		System.out.println("양수의 합의 결과 : "+sum);
		
		in.close();
		
	}

}
*/