import java.util.Scanner;

public class StringRotateOnEnter {
	public static void main(String[] args) {
		// String 클래스 활용 Bonus 3
		System.out.println("문자열을 입력하세요. 빈 칸이나 있어도 되고 영어 한글 모두 됩니다.");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		System.out.println("<Enter>를 입력하면 문자열이 한 글자씩 회전합니다.");
		while(true) { // while 문
			String key = scanner.nextLine();
			if(key.equals("")) { // <Enter> 키 외에 다른 입력된 키가 없는 경우
				String first = text.substring(0, 1); // 첫 번째 문자 알아내기
				String last = text.substring(1); // 나머지 문자열
				text = last.concat(first); // 나머지 문자열 뒤에 첫 번째 문자 연결
				System.out.print(text + " >> "); // 완성된 문자열과 ">>" 화면 출력
			}
			else if(key.equals("q")) // q를 입력한 경우
				   break;  // 회전 종료	   
			else // q가 아닌 다른 키를 입력된 경우	
				System.out.print(text + ">>"); // 현재 문자열 출력
			}
			System.out.println("종료합니다...");
			scanner.close();
	}
}
