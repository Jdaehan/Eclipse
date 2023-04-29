import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import java.util.Calendar;
import java.util.EventObject;
 
public class JDHPEPClock extends JFrame {
    private Calendar c; 
    private int year, month, date, hour, min, second; // 년, 달, 날, 시, 분, 초
    private JLabel time;
    private JTextField aa = new JTextField(10);
    private JTextArea bb = new JTextArea(31, 120); // 이것이 시간에 관한 사이즈 설정에 관련되어 있습니다.
    public JDHPEPClock() {
        this.setTitle("시간");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(getOwner());
        setLayout(null);
        
        
    
        
        time = new JLabel();
        time.setFont(new Font("맑은고딕", Font.PLAIN, 20));
        
        time.setBounds(120,120,300,120);
        add(time);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Thread t = new Thread(new thread());
        t.start();
        this.setSize(240, 65);   
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocation(1120, 0); 
        EventObject e;
            	   }
    
    private class thread implements Runnable {
        public void run() {
            while(true) {
                c = Calendar.getInstance();
                year = c.get(Calendar.YEAR);
                month = (c.get(Calendar.MONTH)+1); // MONTH에 1을 더하는 이유는 MONTH가 0부터 시작하기 때문입니다.
                date = c.get(Calendar.DATE);
                hour = c.get(Calendar.HOUR);
                min = c.get(Calendar.MINUTE);
                second = c.get(Calendar.SECOND);
                String clock = Integer.toString(year); // clock 이라는 스트링으로 한번에 묶어서 표시했습니다.
                clock = clock.concat("-");
                clock = clock.concat(Integer.toString(month));
                clock = clock.concat("-");
                clock = clock.concat(Integer.toString(date));
                clock = clock.concat(" ");
                clock = clock.concat(Integer.toString(hour));
                clock = clock.concat(":");
                clock = clock.concat(Integer.toString(min));
                clock = clock.concat(":");
                clock = clock.concat(Integer.toString(second));
                
                time.setText(clock); 
                time.setBounds( 30, 0, 400,25);
            }
        }
    }
    /* LogIn.java 소스와 연결할 수 있도록 따로 설정해놓은 클래스 입니다. 원래는 어떻게 연결하지 고민했는데, 가능하더라고요!. 물론  프레임 안에 넣진 않았지만
    오히려 이것이 더욱 보기 편할 수 있게다는 생각에 오른쪽 위에 위치해 놓은 상태로 현재 시각을 알려주는 프레임을 설정해놓았습니다. */
    public static void main(String[] args) { //현재 연도+월+날짜+시간(초심도 포함)을 나타내는 프로그램 제작
    	JFrame.setDefaultLookAndFeelDecorated(true);
        new JDHPEPClock();
        try{

            Thread.sleep(1000); //1초마다 멈추기

}catch(InterruptedException e){

e.printStackTrace(); }

    }
}