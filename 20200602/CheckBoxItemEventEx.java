//���� p.403
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxItemEventEx extends JFrame{
	
	private JCheckBox [] fruits = new JCheckBox[3];
	private String [] names = {"���", "��", "ü��"};
	private JLabel sumLabel; //����� ���� ����ϴ� ���̺�
	
	public CheckBoxItemEventEx()
	{
		setTitle("üũ�ڽ��� ItemEvent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("��� 100��, �� 500��, ü���ѻ��� 20000��"));
		
		//üũ�ڽ� ���� ��
		MyItemL Listener = new MyItemL();
		
		for(int i=0;i<fruits.length;i++)
		{
		fruits[i] = new JCheckBox(names[i]);
		fruits[i].setBorderPainted(true); //üũ�ڽ� �ܰ��� ���̵��� ����
		c.add(fruits[i]);
		fruits[i].addItemListener(Listener); //üũ�ڽ��� Item �����ʸ� ���
		
		}
		
		sumLabel = new JLabel("���� 0�� �Դϴ�. ");
		c.add(sumLabel);
		//������ ������� �����ֱ� ����
		
		setSize(300,200);
		setVisible(true);
		
	}//MyItemL Ŭ���� �����
	class MyItemL implements ItemListener
	{
		private int sum = 0;

		@Override
		public void itemStateChanged(ItemEvent e) {
			// üũ�ڽ��� üũ������ ������ ó�� ������ ���弼��
			if(e.getStateChange()==ItemEvent.SELECTED)
			{
				if(e.getItem() == fruits[0]) //��� üũ�ڽ�
					sum = sum + 100;
				else if(e.getItem() == fruits[1]) //�� üũ�ڽ�
					sum = sum + 500;
				else 
					sum = sum + 20000; //üũ �ѻ��۰� üũ�ڽ�
					
			}
			else	
			{
				if(e.getItem() == fruits[0]) //��� üũ�ڽ�
					sum = sum - 100;
				else if(e.getItem() == fruits[1]) //�� üũ�ڽ�
					sum = sum - 500;
				else 
					sum = sum - 20000; //üũ �ѻ��۰� üũ�ڽ�
			}
			
			sumLabel.setText("���� "+sum+"�� �Դϴ�."); //���� ���̺� ���
		}
		
	}
    
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxItemEventEx();

	}

}
