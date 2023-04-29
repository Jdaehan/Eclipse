package four;
import java.util.Scanner;
public class play2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 10개 입력 >>");
		int [] n = new int [10];
		int i;
		for(i=0;i<n.length; i++){
			n[i] = scanner.nextInt();
			if(n[i] % 3 == 0)
				System.out.print(n[i] + " ");
		}
		System.out.println();

	}

}
