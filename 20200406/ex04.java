import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		int []n= {1,2,3,4,5};
        int sum=0;
		String f[] = {"���","��","�ٳ���","ü��","����","�ڸ�"};
		
		for(int k:n)
		{
			System.out.print(k+" ");
			sum = sum + k;
		}
		System.out.println("��:"+sum);
		
		for(String s:f)
		{
			System.out.print(s+" ");
		}

	}

}
