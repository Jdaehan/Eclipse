import javax.swing. *;
import java.awt. *;

public class FlowLayoutEx extends JFrame {
	
	public FlowLayoutEx() //객체를 생성할때 초기화 시키는 특별한 메소드 - 생성자
	{
		setTitle("GUI 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		
		cp.setLayout(new GridLayout(5,4));
		
		cp.add(new JButton("C"));
		cp.add(new JButton("()"));
		cp.add(new JButton("%"));
		cp.add(new JButton("/"));
		cp.add(new JButton("7"));
		cp.add(new JButton("8"));
		cp.add(new JButton("9"));
		cp.add(new JButton("*"));
		cp.add(new JButton("4"));
		cp.add(new JButton("5"));
		cp.add(new JButton("6"));
		cp.add(new JButton("-"));
		cp.add(new JButton("1"));
		cp.add(new JButton("2"));
		cp.add(new JButton("3"));
		cp.add(new JButton("+"));
		cp.add(new JButton("+/-"));
		cp.add(new JButton("0"));
		cp.add(new JButton("."));
		cp.add(new JButton("="));


		setSize(300,200);
		setVisible(true);
		
		
		
		
		
		
		setSize(300, 200);
		setVisible(true);		
	}

	public static void main(String[] args) {
		
		FlowLayoutEx ob = new FlowLayoutEx();
		

	}

}
