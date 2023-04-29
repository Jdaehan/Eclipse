import java.util.Scanner;
class Circle
{
	//멤버변수
	int radius;
	//생성자 - 객체를 초기화하는 특별한 메소드
	public Circle(int radius) { this.radius = radius; }
	//멤버함수(메소드)
	public double getArea() { return 3.14*radius*radius; }
}

class Book
{
	String title, author;
	public Book(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
}
public class CircleArray {

	public static void main(String[] args) {
		
		// book 객체배열 선언해서 출력하는 프로그램
		Scanner input = new Scanner(System.in);
		
		Book [] book = new Book [2]; //객체배열 선언
		
		for(int i=0;i<book.length;i++)
		{
			System.out.print("제목>>");
			String title = input.nextLine();
			System.out.print("저자>>");
			String author = input.nextLine();
			book[i] = new Book(title, author); //배열 원소 객체 생성
		}
		
		for(int i=0;i<book.length;i++)
		{
			System.out.println(i + "번째 책제목 : " + book[i].title + ",저자:"+book[i].author);		
	    }
		
		
		
		// 객체 배열을 선언하여 출력
		//Circle [] c; 
		//c= new Circle[5]; //객체 배열 선언
		
	    //for(int i=0;i<c.length; i++)
	    //	c[i] = new Circle(i);
	    
	    //for(int i=0; i<c.length; i++) //배열의 모든 Circle 객체의 면적 출력
	    //	System.out.print((int)(c[i].getArea()) + " "); 

	}

}
