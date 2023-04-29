import javax.swing. *;
import java.awt.*;

public class NullContainerEx extends JFrame{
	
	public NullContainerEx()
	{
		setTitle("��ġ�����ھ��� GUI example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		
		//��ġ������ ������ �����̳�
		cp.setLayout(null);
		
		JLabel la = new JLabel("��ư�� �����ּ���");
		la.setLocation(130,20);
		la.setSize(200,20);
		cp.add(la);
		
		for(int i=1;i<=9;i++)
		{
		JButton b = new JButton(Integer.toString(i));
		b.setLocation(i*15, i*20);
		b.setSize(100,20);
		cp.add(b);
		}
		
		
	
		setSize(400,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		NullContainerEx ob = new NullContainerEx();
	}

}
