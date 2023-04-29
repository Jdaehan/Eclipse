//교재 p.403
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxItemEventEx extends JFrame{
	
	private JCheckBox [] fruits = new JCheckBox[3];
	private String [] names = {"사과", "배", "체리"};
	private JLabel sumLabel; //계산한 합을 출력하는 레이블
	
	public CheckBoxItemEventEx()
	{
		setTitle("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("사과 100원, 배 500원, 체리한상자 20000원"));
		
		//체크박스 생성 등
		MyItemL Listener = new MyItemL();
		
		for(int i=0;i<fruits.length;i++)
		{
		fruits[i] = new JCheckBox(names[i]);
		fruits[i].setBorderPainted(true); //체크박스 외곽시 보이도록 설정
		c.add(fruits[i]);
		fruits[i].addItemListener(Listener); //체크박스에 Item 리스너를 등록
		
		}
		
		sumLabel = new JLabel("현재 0원 입니다. ");
		c.add(sumLabel);
		//프레임 사이즈와 보여주기 설정
		
		setSize(300,200);
		setVisible(true);
		
	}//MyItemL 클래스 만들기
	class MyItemL implements ItemListener
	{
		private int sum = 0;

		@Override
		public void itemStateChanged(ItemEvent e) {
			// 체크박스를 체크했을때 실행할 처리 구문을 만드세요
			if(e.getStateChange()==ItemEvent.SELECTED)
			{
				if(e.getItem() == fruits[0]) //사과 체크박스
					sum = sum + 100;
				else if(e.getItem() == fruits[1]) //배 체크박스
					sum = sum + 500;
				else 
					sum = sum + 20000; //체크 한상작값 체크박스
					
			}
			else	
			{
				if(e.getItem() == fruits[0]) //사과 체크박스
					sum = sum - 100;
				else if(e.getItem() == fruits[1]) //배 체크박스
					sum = sum - 500;
				else 
					sum = sum - 20000; //체크 한상작값 체크박스
			}
			
			sumLabel.setText("현재 "+sum+"원 입니다."); //합을 레이블레 출력
		}
		
	}
    
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxItemEventEx();

	}

}
