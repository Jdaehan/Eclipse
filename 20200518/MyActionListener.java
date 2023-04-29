import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//독립된 클래스로 이벤트 리스너를 작성하도록 하면된다.
public class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		//버튼을 클릭했을때 처리할 내용을 이곳에 정의하면 된다.
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");

	}

}
