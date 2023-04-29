package four;
import java.util.Scanner;
public class play3 {
	public static void main(String[] args) {
		String eng[] = { "student", "love", "java", "happy", "future" };
		String kor[] = { "학생", "사랑", "자바", "행복한", "미래" };
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("영어 단어를 입럭하세요>>");
			String s = scanner.next();
			if (s.equals("student"))
				System.out.println("학생");
			else if (s.equals("love"))
				System.out.println("사랑");
			else if (s.equals("java"))
				System.out.println("자바");
			else if (s.equals("happy"))
				System.out.println("행복한");
			else if (s.equals("future"))
				System.out.println("미래");
			else if (s.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			} else
				System.out.println("그런 영어 단어가 없습니다");
		}

	}

}
