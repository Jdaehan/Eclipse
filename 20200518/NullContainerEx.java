import javax.swing. *;
import java.awt.*;

public class NullContainerEx extends JFrame{
	
	public NullContainerEx()
	{
		setTitle("배치관리자없는 GUI example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		
		//배치관리자 제거한 컨테이너
		cp.setLayout(null);
		
		JLabel la = new JLabel("버튼을 눌러주세요");
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
