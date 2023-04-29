import javax.swing. *;
import java.awt. *;

class NorthPanel extends JPanel { //NORTH에 붙일 패널
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
	}
}
class CenterPanel extends JPanel{ //CENTER에 붙일 패널
	public CenterPanel() {
		
	}
}
public class JangDaeHan extends JFrame {
	JangDaeHan()
	{
		setTitle("Open Challenge 8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new BorderLayout());
		String [] a = {"Open", "Read", "Close"};
		
		NorthPanel np = new NorthPanel();
		for(int i=0; i<3; i++)
		{
			JButton button = new JButton(a[i]);
			button.setSize(10, 10);
			np.add(button);
		}
		contentPane.add(np, BorderLayout.NORTH);
		
		CenterPanel cp = new CenterPanel();
		cp.setLayout(null);
		JLabel label = new JLabel("Hello Java!");
		label.setSize(100, 20);
		label.setLocation(100, 50);
		cp.add(label);
		
		contentPane.add(cp, BorderLayout.CENTER);
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JangDaeHan();

	}

}
