import java.util.Scanner; // Scanner �� �������� �ȴ�.
interface StackInterface{
	int length(); // ���ÿ� ��� �ִ� ���ڿ� ���� ����
	String pop(); // ������ �鿡 �ִ� ���ڿ� ��
	boolean push(String ob); // ������ �鿡 ���ڿ� ob Ǫ�� ����
}
class StringStack implements StackInterface { // �������̽� ����
// StackInterface�� ��� �߻� �޼ҵ� ����
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
		/* StringStack ��ü�� �����ϰ�, ����ڷκ��� ���ڿ��� 5�� �о� ���� ��ü�� �����ϰ�
		 �ٽ� ���Ͽ� ���� �ݴ������ ����ϴ� ���α׷�  */
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

