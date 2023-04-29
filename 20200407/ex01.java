/* import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// 예외 처리 프로그램
		Scanner input = new Scanner(System.in);
		
		int n1, n2; //나뉨수와 나눗수
		int res;
		
		System.out.println("니눔수와 나눗수를 입력하세요. 순서대로 입력:");
		n1 =input.nextInt(); n2 = input.nextInt();
		try {
		res =n1/n2;
		System.out.println(n1+"/"+n2+"="+res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌수 없습니다.");
		}
		finally
		{
			System.out.println("프로그램 종료!");
		}

	}

}
*/
