import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerEx extends JFrame{
   private JLabel la = new JLabel("Hello");
	public MouseListenerEx()
	{
		
		setTitle("���콺 �̺�Ʈ ó�� ���α׷�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		
		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30,30);
		c.add(la);
		
		setSize(200,200);
		setVisible(true);
		
	}
	class MyMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			//�̺κи� ó���Ϸ��� �Ѵ�.
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
			

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}


	public static void main(String[] args) {
		new MouseListenerEx();

	}

}
