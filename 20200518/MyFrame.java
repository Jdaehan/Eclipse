import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame()//생성자 - 객체 초기화
		{
			setTitle("300x300 스윙 프레임 만들기");
			setSize(300,300);
			setVisible(true);
		}
	    //추가 메소드, 생성자, 그밖에 것들을 만듦	
	 public static void main(String[] args) {
		// 객체 생성
    MyFrame f1 = new MyFrame();

	 }

}

