import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame {
 public IndepClassListener() //생성자- 객체 초기화하는 특별한 메소드
 {
	setTitle("Action 이벤트 리스너 예제 프로그램");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	JButton btn1 = new JButton("Action");
	JButton btn2 = new JButton("Login");
	btn1.addActionListener(new MyActionListener());
	btn2.addActionListener(new MyActionListener1());
	c.add(btn1);
	c.add(btn2);
	
	setSize(250,120);
	setVisible(true);
	
	
	 
	 
	 
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IndepClassListener ob = new IndepClassListener();

	}

}
