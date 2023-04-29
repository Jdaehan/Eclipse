package pro0608;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ComboActionEx extends JFrame {
	private String [] fruits = {"apple", "banana", "mango"};
	private ImageIcon [] images = { new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/banana.jpg"),new ImageIcon("images/mango.jpg")
	};
	private JLabel imgLabel = new JLabel(images[0]);
	
	public ComboActionEx()
	{
		setTitle("�޺��ڽ� Ȱ�� ����");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JComboBox<String> combo = new JComboBox<String>(fruits);
		c.add(combo); 
		c.add(imgLabel);
		
		// �޺��ڽ��� Action ������ ���, ���õ� �������� �̹��� ���
		combo.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
				
			}
		});
		
		setSize(800,700);
		setVisible(true);
	}
	
	
	
	
	

	public static void main(String[] args) {
		new ComboActionEx();

	}

}
