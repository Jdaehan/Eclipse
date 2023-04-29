import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseAdapterEx extends JFrame {
	
	private JLabel la = new JLabel("안녕하세요(Hello)");
	
	public MouseAdapterEx () //생성자
	{
	setTitle("마우스 이벤트 예제 프로그램");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c= getContentPane();
	c.addMouseListener(new MyMouseAdapter());
	
	c.setLayout(null);
	la.setSize(100, 20);
	la.setLocation(30, 30);
	c.add(la);
	
    setSize(200,200);
    setVisible(true);
	}
	
	class MyMouseAdapter extends MouseAdapter //마우스 어댑터 클래스를 상속받음
	{
		public void mousePressed(MouseEvent e)
		{
		int x = e.getX();
		int y = e.getY();
		la.setLocation(x,y);
		}
	}
	
	public static void main(String[] args) {
		new MouseAdapterEx();
	}

}
