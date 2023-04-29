package gogo;
import java.util.Scanner;
public class ScannerEx {

	public static void main(String[] args) {
		// Sysytem.in과 system.out.을 이용한 입력 출력 프로그램 예제
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 이름은? ");
        String name = sc.next();
        System.out.println("당신의 학과? ");
        String h = sc.next();
        System.out.println("당신의 나이는? ");
        int age = sc.nextInt();
        
        System.out.println("자기소개 내용");
        System.out.println("이름:"+name+" 학과:"+h+" 나이:"+age);
	}
}

