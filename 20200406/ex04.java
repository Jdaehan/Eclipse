import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		int []n= {1,2,3,4,5};
        int sum=0;
		String f[] = {"사과","배","바나나","체리","딸기","자몽"};
		
		for(int k:n)
		{
			System.out.print(k+" ");
			sum = sum + k;
		}
		System.out.println("합:"+sum);
		
		for(String s:f)
		{
			System.out.print(s+" ");
		}

	}

}
