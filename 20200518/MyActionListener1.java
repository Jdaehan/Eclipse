import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b= (JButton)e.getSource();
		if(b.getText().contentEquals("Login"))
			b.setText("�α���");
		else
			b.setText("Login");

	}

}
