package 과제제출;
import java.awt.*;
import javax.swing. *;
public class CPtest {
	public class CPtest extends JFrame{
		public CPtest() //  생성자
		{
			setTitle("GUI 제작 첫 프로그램 - 20191450");
			setSize(500,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//컴포넌트를 배치
			//컨텐트팬
			Container con = getContentPane();
			con.setBackground(Color.darkGray);
			con.setLayout(new FlowLayout());
			
			con.add(new JButton("OK"));
			con.add(new JButton("Cancel"));
			con.add(new JButton("Ignore"));
			con.add(new JButton("Login"));	
			setVisible(true);	
	public static void main(String[] args) {
		
	}
		CPtest cp = new CPtest();

	}

}
