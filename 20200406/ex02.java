import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// break;���� ���� ����
Scanner in = new Scanner(System.in);
System.out.println("exit�� �Է��ϸ� ����!");
for(;;) // �׻� ���̴�... �׷��Ƿ� ���� �ݺ��ȴ�.
{	
System.out.print(">>");
String text = in.nextLine();
if(text.equals("exit"))
	break;
}
System.out.println("���α׷� ����!");

		

	}

}
