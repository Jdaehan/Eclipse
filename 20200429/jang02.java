package pro20191450;
import java.util.Scanner;
public class jang02 {
	public static void main(String[] args) {
		// And�� OR �� ������ �Է¹޾� true, false�� �Ǻ��ϴ� ���α׷� ����
		boolean a,b;
		String log;
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ���>>");
	   a = scanner.nextBoolean(); log = scanner.next(); b= scanner.nextBoolean();
	    switch(log) {
	    case "AND":
	    	System.out.println(a&&b); 
	    	break;  
	   	    case "OR":
	    	System.out.println(a||b);
	    	break;
	    default:
	      System.out.println("�߸��� �� ������ �Է��Դϴ�.");
	}
	    
   }
}
