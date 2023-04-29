import java.util.Scanner; // Scanner 만 가져오게 된다.
interface StackInterface{
	int length(); // 스택에 들어 있는 문자열 개수 리턴
	String pop(); // 스택의 톱에 있는 문자열 팝
	boolean push(String ob); // 스택의 톱에 문자열 ob 푸시 삽입
}
class StringStack implements StackInterface { // 인터페이스 구현
// StackInterface의 모든 추상 메소드 구현
	public StringStack() {}
	String [] s = new String[5];
	int i = 0;
	public int length() {return i+1;}
	public String pop() {return s[--i];}
	public boolean push(String ob){
		if(i==5)
			return false;
		else
			s[i++] = ob;
		    return true;
	}
}
public class StackManager {

	public static void main(String[] args) {
		/* StringStack 객체를 생성하고, 사용자로부터 문자열을 5개 읽어 스택 객체를 저장하고
		 다시 팝하여 읽은 반대순으로 출력하는 프로그램  */
		Scanner scanner = new Scanner(System.in);
		StringStack stack = new StringStack();
		System.out.print(">>");
		for(int i=0; i<5; i++) {
			String ob = scanner.next();
			stack.push(ob); }
		for(int i=0; i<5; i++) {
			System.out.print(stack.pop()+" "); }
		scanner.close();
			
		}

	}

