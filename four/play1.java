package four;
import java.util.Scanner;
public class play1 {
	public static void main(String[] args) {
		System.out.print("알파벳 한 문자를 입력하세요>>");
		Scanner scanner= new Scanner(System.in);
		String s=scanner.next();
		char c= s.charAt(0);
		int n =(int)c;
		for(int i= 97;i<=n;i++){
			for(int j=i;j<n;j++) {
				char eW=(char)j;
				System.out.print(eW);
			}
			System.out.println();
		}
		
	}

}
