import java.util.Scanner;
class Circle
{
	//�������
	int radius;
	//������ - ��ü�� �ʱ�ȭ�ϴ� Ư���� �޼ҵ�
	public Circle(int radius) { this.radius = radius; }
	//����Լ�(�޼ҵ�)
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
		
		// book ��ü�迭 �����ؼ� ����ϴ� ���α׷�
		Scanner input = new Scanner(System.in);
		
		Book [] book = new Book [2]; //��ü�迭 ����
		
		for(int i=0;i<book.length;i++)
		{
			System.out.print("����>>");
			String title = input.nextLine();
			System.out.print("����>>");
			String author = input.nextLine();
			book[i] = new Book(title, author); //�迭 ���� ��ü ����
		}
		
		for(int i=0;i<book.length;i++)
		{
			System.out.println(i + "��° å���� : " + book[i].title + ",����:"+book[i].author);		
	    }
		
		
		
		// ��ü �迭�� �����Ͽ� ���
		//Circle [] c; 
		//c= new Circle[5]; //��ü �迭 ����
		
	    //for(int i=0;i<c.length; i++)
	    //	c[i] = new Circle(i);
	    
	    //for(int i=0; i<c.length; i++) //�迭�� ��� Circle ��ü�� ���� ���
	    //	System.out.print((int)(c[i].getArea()) + " "); 

	}

}
