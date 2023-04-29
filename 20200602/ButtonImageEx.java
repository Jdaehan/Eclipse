//이미지 버튼 만들기 프로그램

import javax.swing.*;
import java.awt.*;

public class ButtonImageEx extends JFrame{

	public ButtonImageEx()
	{
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//3개의 이미지
		ImageIcon a1 = new ImageIcon("C:\\Users\\HOME\\eclipse-workspace\\연습\\img/call01.jpg");
		ImageIcon a2 = new ImageIcon("C:\\Users\\HOME\\eclipse-workspace\\연습\\img/call04.jpg");
		ImageIcon a3 = new ImageIcon("C:\\Users\\HOME\\eclipse-workspace\\연습\\img/call05.jpg");
		
		//3개의 아이콘을 가진 버튼 생성
		JButton btn = new JButton("call~~ ",a1);
		btn.setRolloverIcon(a2);
		btn.setPressedIcon(a3);
		


		setSize(400,350);
		setVisible(true);
				
	}
	
	
	public static void main(String[] args) {
		// 객체 실행
		new ButtonImageEx();

	}

}
