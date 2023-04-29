package pro0405;

public class ex02 {

	/* public static void main(String[] args) {
		// a - z까지 출력, A - Z까지 출력

		
		for(char alpa = 'a';alpa<='z';alpa= (char)(alpa+1))
		{
			System.out.print(alpa+"  ");
		}
*/
	public static void main(String[] args) {
	  //3단 구구단 출력 프로그램
		for(int dan=2;dan<=9;dan++)
		{	
		for(int i=1;i<10;i++)
		{
		System.out.println(dan+"*"+i+"="+dan*i);
	    }
		System.out.println("**********");
		}
    }
	
}
