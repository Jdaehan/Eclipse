import java.util.Scanner;
public class Modify {
	public static void main(String[] args) {
		// StringBuffer, Math.random() 등을 활용한 종합 응용 Bonus2 문제
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = scanner.nextLine(); // 한 줄 읽기
			StringBuffer sb = new StringBuffer(s); // StringBuffer 객체 생성
			if(s.equals("exit")) { // sb의 문자열이 "exit"이면 종료
				System.out.println("종료합니다...");
				break;
			}
			int index = (int)(Math.random()*s.length()); // 변경할 문자 위치 선택
			while(true) {
				int i = (int)(Math.random()*26); // 알파벳 중에서 선택
				char c = (char)('a' + i); // 삽입할 문자 결정
				if(!sb.equals(c)) { // sb의 문자와 c가 다른 경우
					// sb에서 index에 있는 문자를 문자 c로 변경
					sb.replace(index, index+1, Character.toString(c)); // 문자를 문자열 타입으로 변환
					break;
				}
			}
			System.out.println(sb);
		} // end of while
		scanner.close();
	}
}
