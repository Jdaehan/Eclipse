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
    private int year, month, date, hour, min, second; // ��, ��, ��, ��, ��, ��
    private JLabel time;
    private JTextField aa = new JTextField(10);
    private JTextArea bb = new JTextArea(31, 120); // �̰��� �ð��� ���� ������ ������ ���õǾ� �ֽ��ϴ�.
    public JDHPEPClock() {
        this.setTitle("�ð�");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(getOwner());
        setLayout(null);
        
        
    
        
        time = new JLabel();
        time.setFont(new Font("�������", Font.PLAIN, 20));
        
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
                month = (c.get(Calendar.MONTH)+1); // MONTH�� 1�� ���ϴ� ������ MONTH�� 0���� �����ϱ� �����Դϴ�.
                date = c.get(Calendar.DATE);
                hour = c.get(Calendar.HOUR);
                min = c.get(Calendar.MINUTE);
                second = c.get(Calendar.SECOND);
                String clock = Integer.toString(year); // clock �̶�� ��Ʈ������ �ѹ��� ��� ǥ���߽��ϴ�.
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
    /* LogIn.java �ҽ��� ������ �� �ֵ��� ���� �����س��� Ŭ���� �Դϴ�. ������ ��� �������� ����ߴµ�, �����ϴ�����!. ����  ������ �ȿ� ���� �ʾ�����
    ������ �̰��� ���� ���� ���� �� �ְԴٴ� ������ ������ ���� ��ġ�� ���� ���·� ���� �ð��� �˷��ִ� �������� �����س��ҽ��ϴ�. */
    public static void main(String[] args) { //���� ����+��+��¥+�ð�(�ʽɵ� ����)�� ��Ÿ���� ���α׷� ����
    	JFrame.setDefaultLookAndFeelDecorated(true);
        new JDHPEPClock();
        try{

            Thread.sleep(1000); //1�ʸ��� ���߱�

}catch(InterruptedException e){

e.printStackTrace(); }

    }
}