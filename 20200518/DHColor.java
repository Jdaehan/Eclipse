import java.awt.*;
import javax.swing. *;

public class DHColor extends JFrame {
	DHColor(){
		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK,
				Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY, Color.BLACK,
				Color.ORANGE, Color.BLUE, Color.MAGENTA};
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(4,4));
		
		for(int i= 0; i< 16; i++) {
			String text = Integer.toString(i);
			JLabel la = new JLabel(text);
			la.setOpaque(true);
			la.setBackground(color[i]);
			contentPane.add(la);
			}
		 setSize(500,200);
		 setVisible(true);
	}
	

	public static void main(String[] args) {
		new DHColor();

	}

}
