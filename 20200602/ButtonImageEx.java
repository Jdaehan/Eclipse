//�̹��� ��ư ����� ���α׷�

import javax.swing.*;
import java.awt.*;

public class ButtonImageEx extends JFrame{

	public ButtonImageEx()
	{
		setTitle("�̹��� ��ư ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//3���� �̹���
		ImageIcon a1 = new ImageIcon("C:\\Users\\HOME\\eclipse-workspace\\����\\img/call01.jpg");
		ImageIcon a2 = new ImageIcon("C:\\Users\\HOME\\eclipse-workspace\\����\\img/call04.jpg");
		ImageIcon a3 = new ImageIcon("C:\\Users\\HOME\\eclipse-workspace\\����\\img/call05.jpg");
		
		//3���� �������� ���� ��ư ����
		JButton btn = new JButton("call~~ ",a1);
		btn.setRolloverIcon(a2);
		btn.setPressedIcon(a3);
		


		setSize(400,350);
		setVisible(true);
				
	}
	
	
	public static void main(String[] args) {
		// ��ü ����
		new ButtonImageEx();

	}

}
