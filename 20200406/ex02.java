import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// break;문에 대한 예제
Scanner in = new Scanner(System.in);
System.out.println("exit를 입력하면 종료!");
for(;;) // 항상 참이다... 그러므로 무한 반복된다.
{	
System.out.print(">>");
String text = in.nextLine();
if(text.equals("exit"))
	break;
}
System.out.println("프로그램 종료!");

		

	}

}
