import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//������ Ŭ������ �̺�Ʈ �����ʸ� �ۼ��ϵ��� �ϸ�ȴ�.
public class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		//��ư�� Ŭ�������� ó���� ������ �̰��� �����ϸ� �ȴ�.
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("�׼�");
		else
			b.setText("Action");

	}

}
