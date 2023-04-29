import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.JTextComponent;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.StringTokenizer;
import java.awt.Graphics;




public class JDHPEP extends JFrame{
    protected static final JMenuBar MenuBar = null;
	private JTextArea bb = new JTextArea(32,70);
	private JLabel imgLabel = new JLabel(); 
	 private Calendar c;
	    private int year, month, date, hour, min, second; //JDHPEPClock.java ������ ���� private ����
	    private JLabel time;
	    private JTextField ab = new JTextField(10);
	    private JTextArea cd = new JTextArea(31, 120);
	    private static int size;
		private JLabel imgLabel1 = new JLabel();
		private String [] animal = {"�����","������", "���� ���α׷� ���� ����"}; /* ����  �޸��� ó�� �̹��� ������ �ҷ��ͼ� �Ϸ��� ������ 
		�ؽ�Ʈ�� �� �� �־ �̹����� ������� �־ �޺��ڽ��� �ִ� �̹������� �����Ϸ��� ������, �װ͵� ������� �־ �ϳ��� ������ �ΰ� �����ϴ� �������
		�ٲپ����ϴ�. �ϳ��� ������ �ƽ����� �־ �����ڿ� ���α׷� ���� Ű���带 ����Ʈ�� ���� �־����ϴ�. ������ɿ��� "������"�� "���� ���α׷� ���� ����"
		�� ������ ��Ȱ���� ������, �ڵ������� �������� �ٲ� ���¿��� �޺��ڽ��� ������ �������� �ٲ� ���¿��� ��Ÿ���� �̹����� �����Ͻ� �� ���� ���Դϴ�.*/
		private ImageIcon [] images = {new ImageIcon("image/pc2.jpg"), new ImageIcon("image/img3.jpg"), 
				new ImageIcon("image/img2.jpg")};
		private JLabel imgLabel2 = new JLabel(images[0]);

	 static String content = "";
	    static int flag = 0; // ����  ��  �ٸ� �̸����� ���忡 ��
	    static int pos = 0;
	    static int fromindex = 0; // �޸����� ���� static ����
	
	public JDHPEP() {
		setTitle("��JDHPEP��"); 
		setSize(800,200); setVisible(true); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JOptionPane.showMessageDialog(null, "JDHPEP�� �湮�� ���ּż� �������� ȯ���մϴ�.", "�ݰ����ϴ�.",JOptionPane.INFORMATION_MESSAGE); 
		// ������ �� ���� �ߴ� �˸�? ��������? �̷� �������� �����.
		
		Container contentPane = getContentPane();
		getContentPane().add(imgLabel, BorderLayout.CENTER); //�߾ӿ� �α�.
		contentPane.setLayout(new FlowLayout());

		imgLabel.setIcon(new ImageIcon("image/img1.jpg")); // �̰͵� ��� �ؽ�Ʈ ���̺��� �������� �ߴµ�, �̹����ε� �� ������ �� �Ͱ��Ƽ� ���ξ����ϴ�.
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		contentPane.setLayout(new FlowLayout());
		
	
		JPanel panel = new JPanel(); //�α��� ���α׷� ����
		JLabel IdLabel = new JLabel("���̵� : ");
		JLabel psJLabel = new JLabel("��й�ȣ : ");
		JTextField ID = new JTextField(10);
		JPasswordField PW = new JPasswordField(10); 
		PW.setEchoChar('*');
	
		JButton longBtn = new JButton("�α���");		
		longBtn.setBackground(Color.cyan);
		
				

		contentPane.add(longBtn);
		 Panel panel12up = new Panel();
		  Checkbox cb1 = new Checkbox("���̵� ����"); 
		  // ������ ���̵� �ڵ����� ������ �ʽ��ϴ�. �׷��� ������� ������ ������ ������ ���� �־��� ���� ��ȭ������ ���� ����� ������ �� ���� �� ���Ƽ� �־����ϴ�.. 
		panel.add(cb1);
		panel.add(panel12up);
	
		panel.add(IdLabel);
		panel.add(ID);
	
		panel.add(psJLabel);
		panel.add(PW);
		
		panel.add(longBtn);
		JButton btn1 = new JButton("�޸�");
		c.add(btn1);
		setSize(100, 120);
		setVisible(true);
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "ȭ���� ���� �ʴ� �ٸ� �� ���� ���ֽñ� �ٶ��ϴ�. ������ ����Ű�� �����ּ���","���� �Ҿ���",JOptionPane.WARNING_MESSAGE);
	    /* ���Ⱑ �� ������ ������ �־����ϴ�. �޸� ��ư�� ������ �� showMessageDialog�� �� ���ķ� ���ڱ� �ð��� �����ϰ� �޸��� �������� �����Ǹ鼭 �ٷ� ������� ������ ������������. 
	     �̰��� ���ݵ� ���� �߻��ϹǷ� Ȥ�ö� �̷��� ��Ȳ�� �߻��� ���� �𸣴� �����س��ҽ��ϴ�. */
        setVisible(false); // ���� �α��� ������ �����.
        imgLabel.setVisible(false);
        btn1.setVisible(false);
        PW.setVisible(false);
        ID.setVisible(false);
        IdLabel.setVisible(false);
        psJLabel.setVisible(false);
        longBtn.setVisible(false);
        cb1.setVisible(false); // ������ ���̺�, ������ ������. ó������ ���ο� �������� �����ؾ� ���� �����ؼ� ���� �ð��� ��������� ������ �� ã�ҽ��ϴ�.
        JFrame frame = new JFrame("�޸�"); // �޸� ��ư�� ������ �� �޸��� ������ ����
        frame.setVisible(true);
        frame.setSize(850,700); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel textPanel = new JPanel();  
        JPanel alarmPanel = new JPanel();
        frame.getContentPane().add(textPanel, "North");
        frame.getContentPane().add(alarmPanel, "So"+ "uth");
        bb.setLineWrap(true); // �ڵ������� �ٹٲ����� ���� �Ʒ��� �ؽ�Ʈ�� ��µǵ��� �����س��ҽ��ϴ�.
    	bb.setWrapStyleWord(true);
    	 bb.setToolTipText("�ؽ�Ʈ�� �Է��ϼ���"); //�޸��� ����â�� ���콺�� ��� �ڵ������� �޽����� �ߵ��� �����س��ҽ��ϴ�.
   	        Border lineBorder = BorderFactory.createLineBorder(Color.black, 1); //������ 1�β��� �����ְ� ����
    	    Border emptyBorder = BorderFactory.createEmptyBorder(7, 7, 7, 7);
    	    bb.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
    	    textPanel.add(new JScrollPane(bb)); //��ũ���� ������ �ش� ������ �Ѱ�ġ�� �Ѿ�� ©���� ��ũ�ѹٸ� �־����ϴ�.
    	    JMenuBar menuBar = new JMenuBar();
    	    
    	    // �޴�
    	    JMenu fileMenu = new JMenu("����"); // ��¥ �޸��� �������� �޴��� �־����ϴ�.
    	    // �޴� ������ ������ �غ�
    	    JMenuItem newItem = new JMenuItem("�� â");
    	    JMenuItem openItem = new JMenuItem("����");
    	    JMenuItem saveItem = new JMenuItem("����");
    	    JMenuItem saveasItem = new JMenuItem("�ٸ� �̸����� ����");
    	    JMenuItem closeItem = new JMenuItem("������");
    	 
    	    frame.setJMenuBar(menuBar);
    	 
    	    menuBar.add(fileMenu); // ����
    	    fileMenu.add(newItem); // �� â
    	    fileMenu.add(openItem); // ����
    	    fileMenu.add(saveItem); // ����
    	    fileMenu.add(saveasItem); // �ٸ� �̸����� ����
    	    fileMenu.add(closeItem); // ������

    	    FileDialog mSave = new FileDialog(frame,"����",FileDialog.SAVE);  
    	    FileDialog mOpen = new FileDialog(frame,"����",FileDialog.LOAD); 
    	    
    	    
    	    newItem.addActionListener(new ActionListener(){
    	    
    	        public void actionPerformed(ActionEvent e){
    	            bb.setText(content);
    	            frame.setTitle("�޸�");
    	            flag = 0;
    	            frame.setSize(850,700);
    	        }
    	    });  
    	    openItem.addActionListener(new ActionListener(){
    	        
    	        @Override
    	        public void actionPerformed(ActionEvent e){
    	            mOpen.setVisible(true); 
    	            String data = mOpen.getDirectory()+ mOpen.getFile();
    	            try{
    	             String str="";
    	             FileReader fr = new FileReader(data);
    	             BufferedReader br = new BufferedReader(fr);
    	            
    	            
    	             bb.setText("");  // �Է����� ���� ���¿��� �����ϹǷ�  �ʱ�ȭ ���׽��ϴ�.
    	             while((str=br.readLine()) != null){   
    	                
    	                 bb.append(str);  // 
    	                 bb.append("\r\n"); // 
    	             }
    	            
    	             br.close();
    	             String Filename = mOpen.getFile();
    	             frame.setTitle(Filename);
    	             flag = 1;
    	            } catch(Exception e1){
    	            }
    	        }

    	    }); 
    	    saveItem.addActionListener(new ActionListener(){
    	        
    	        @Override
    	        public void actionPerformed(ActionEvent e){
    	            
    	            if(flag == 0)
    	            {
    	                mSave.setVisible(true);
    	                String data = mSave.getDirectory()+ mSave.getFile();  
    	                try{
    	                    FileWriter fw = new FileWriter(data+".txt"); // ���� .txt�� ġ�� �� ������ �� ������ txt�� �ڵ����� �Ǵ� ������ �����߽��ϴ�.  
    	                    BufferedWriter bw = new BufferedWriter(fw);
    	             
    	                    String str = bb.getText();
    	                    for(int i = 0 ; i < str.length(); i++)
    	                    {
    	                        if(str.charAt(i) == '\n')
    	                        {
    	                            System.out.println("find");
    	                            bw.newLine();
    	                        }
    	                        else
    	                            bw.write(str.charAt(i));  
    	                    }
    	                    
    	                    bw.close();
    	                    String Filename = mSave.getFile();  
    	                    frame.setTitle(Filename + ".txt");  // ������ ���� ���ϸ����� �̸��� �����մϴ�. ���� .txt�������ο�.
    	                }catch(Exception e1){
    	 
    	                }
    	                flag = 1;
    	            }
    	            
    	            else if(flag == 1)
    	            {
    	                String data = mSave.getDirectory()+ mSave.getFile();  
    	            
    	                try{
    	                FileWriter fw = new FileWriter(data+".txt"); // txt���Ϸ� �����մϴ�.
    	                BufferedWriter bw = new BufferedWriter(fw);
    	 
    	                String str = bb.getText();
    	                for(int i = 0 ; i < str.length(); i++)
    	                {
    	                    if(str.charAt(i) == '\n')
    	                    {
    	                        System.out.println("find");
    	                        bw.newLine();
    	                    }
    	                    else
    	                        bw.write(str.charAt(i)); 
    	                }
    	                            bw.close();            
    	                }catch(Exception e2){
    	                    
    	                }
    	                
    	            }
    	 
    	        }
    	    });   saveasItem.addActionListener(new ActionListener(){
    	        
    	           @Override
    	        public void actionPerformed(ActionEvent e){
    	             mSave.setVisible(true);
    	             String data = mSave.getDirectory()+ mSave.getFile();  // ���� savaItem�� �ణ �����մϴ�. ������ ���丮 ������ ���ϸ��� ��´�.
    	             try{
    	              FileWriter fw = new FileWriter(data+".txt"); // txt���Ϸ� �����Ѵ�.  
    	              BufferedWriter bw = new BufferedWriter(fw);
    	             
    	                String str = bb.getText();
    	                for(int i = 0 ; i < str.length(); i++)
    	                {
    	                    if(str.charAt(i) == '\n')
    	                    {
    	                        System.out.println("find");
    	                        bw.newLine();
    	                    
    	                    }
    	                    else
    	                        bw.write(str.charAt(i));  
    	                }
    	                
    	              bw.close();
    	              String Filename = mSave.getFile();  
    	              frame.setTitle(Filename + ".txt");  // ���������� ������ ���� ���ϸ����� �ٲߴϴ�.
    	             }catch(Exception e1){
    	 
    	             }

    	        }
    	    });  
    	        
    	    closeItem.addActionListener(new ActionListener(){
    	        
    	        public void actionPerformed(ActionEvent e){
    	            System.exit(0);
    	        }
    	    }); 
			}		

		});
		
		
		longBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String id = "20191450";
				String pw = "jangdaehan";
				
				if(id.equals(ID.getText())&& pw.equals(PW.getText())) { //�α��� ��ư�� �����鼭 ���̵�� ��й�ȣ�� ��ġ�� ��
					// ������� else if �� ������ �� ���� ����� ��ϴ�. ��¼�� ���� ���α׷����� �̵��ϱ� ���� ��θ� ���� �ҽ��� �Ǳ⵵ �մϴ�. 
		    btn1.setVisible(false);
            PW.setVisible(false);
            ID.setVisible(false);
            IdLabel.setVisible(false);
            psJLabel.setVisible(false);
            longBtn.setVisible(false);
            cb1.setVisible(false);
            imgLabel.setVisible(false); //������ �ִ� ���� �α��� ���̺� �� �������� ��� ������
            
            JLabel imgLabel =  new JLabel();
            setTitle("��JDHPEP ���α׷���"); // �޸����� ������ ���������� ���� ���α׷��̶� �ұ��? ������ ���� ���� ���α׷� �������� Ÿ��Ʋ(����)�� �����Ͽ����ϴ�. 
            setSize(800,550); setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JOptionPane.showMessageDialog(null, "�̹��� ���� ����, �������� ��ɿ��� �Ѱ谡 �־ ���� ����̶� �̿����ּ���!", "�������ּ���!",JOptionPane.INFORMATION_MESSAGE); 
            /* �̹�����.. ������ ���ε��ϰ� �����ϰ� ���� �ϴ� ����� �˰����� ����� �Ѱ谡 �־����ϴ�. �׷��� �Ѱ踦 �����ϴ��� �߿��� ������ɿ� ���� ���ᱸ��? �� �������� �������, ����� ���� ����� 
                     ���� ���α׷��� ȥ���� ���� ���� ������ showMessaageDialog �޽����� ������ϴ�.*/
          
            Container pc =getContentPane();
    	    pc.setLayout(new FlowLayout());
    	    JComboBox<String> combo = new JComboBox<String>(animal);
    	    pc.add(combo); pc.add(imgLabel2);
    	    Container c= getContentPane();
    	    c.setLayout(new FlowLayout());
            ImageIcon normalIcon = new ImageIcon("C:\\Users\\HOME\\eclipse-workspace\\����������Ű��а� 20191450 ����� �⸻\\image/dju1.jpg"); // ��ҿ�
    	    ImageIcon rolloverIcon = new ImageIcon("C:\\Users\\HOME\\eclipse-workspace\\����������Ű��а� 20191450 ����� �⸻\\image/dju2.jpg"); // ���콺�� ������ ���� ��
    	    ImageIcon pressedIcon = new ImageIcon("C:\\Users\\HOME\\eclipse-workspace\\����������Ű��а� 20191450 ����� �⸻\\image/dju3.jpg"); // ���콺�� Ŭ������ ��
    	    // JButton�� �̿��� �̹��� ��ư�� ����� ���� ��θ� ���� �̹����� �Դϴ�.
    	    
    	    JButton dju = new JButton("�������� �б�",normalIcon); // � �̹����� �־ ǥ���ұ� �����ϴٰ� ���� �������б� �ΰ� ǥ���غ��ҽ��ϴ�.
    	    dju.setPressedIcon(pressedIcon);
    	    dju.setRolloverIcon(rolloverIcon);
    	    c.add(dju);
    	    setSize(150,100);
    	    setVisible(true);
    	    
    	    createMenu();
    		getContentPane().add(imgLabel2, BorderLayout.CENTER);
    		setSize(800,550); setVisible(true);
    		setLocationRelativeTo(null); // ���̺��� �ƴ�, �������� �߾ӿ� ��ġ�ϰ� �� �߿��� �ҽ��Դϴ�.
    		setResizable(false); // ��¼�� �߿��� ���� �ִ� �ҽ���. �������� ũ�⸦ ������ �� ������ �����س��� �����Դϴ�.
    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���� �������� ���� �� ���α׷��� ���������� ����� �� �ֵ��� �ϴ� �ҽ��Դϴ�.
    		combo.addActionListener(new ActionListener() { // ActionListener �� ������ �̹����� �޴� �� ��� �غ��� �̺�Ʈ�� �߻����� �ʽ��ϴ�.

				@Override
				public void actionPerformed(ActionEvent e) {
						JComboBox<String> cb = (JComboBox<String>)e.getSource();
						int index = cb.getSelectedIndex();
						imgLabel2.setIcon(images[index]);
					
				}
    			
    		});
    		
    
				}else {
					JOptionPane.showMessageDialog(null, "���̵�� ��й�ȣ�� �ٽ� �Է����ּ���.","�α��� ����", JOptionPane.WARNING_MESSAGE
);        //������ ���̵� �Ǵ� ��й�ȣ�� ��ġ���� ������ ���� �ߴ� �� �����ұ� �ߴµ� ��ŷ ������ ������ ������ ���� ������� Ʋ�ȴ��� �� �� ���� ǥ���߽��ϴ�.
					int result = JOptionPane.showConfirmDialog(null,  "��α��� �Ͻðڽ��ϱ�", "���α׷� ���� ��Ȯ��", JOptionPane.YES_NO_OPTION);
					if(result == JOptionPane.CLOSED_OPTION) {	
					}
					else if(result == JOptionPane.YES_OPTION) {
						// ��α����� �� ���� ���ε� �־����ϴ�. Ȯ���� ������ �ٽ� �α����� �ϴ� â���� ���ƿ��� �˴ϴ�.
					}
					else {
						JOptionPane.showMessageDialog(null, "��� ���α׷��� ����˴ϴ�.","���α׷� ����",JOptionPane.ERROR_MESSAGE);
						System.exit(0); // ������ ��α����� ��ġ �ʴ´ٸ� �ش� �޽����� �������� ���� �Ӵ��� ��� ���α׷��� �Բ� ����˴ϴ�.
					}
			   }   
			}

			private void createMenu() {
				JMenuBar mb = new JMenuBar();
				JMenuItem [] menuItem = new JMenuItem [7];
				String[] itemTitle = { "��� +50" , "��� -50", "ä�� 0%", "ä�� 100%", "�����ϰ�", "������ũ", "����ġ", "�帮��", "���ó��"};
				JMenu colorMenu = new JMenu("����"); // �������� ���� ����� ���� �޴����Դϴ�. ����� ������ �ش��ϴ� item���� �ֽ��ϴ�.
				
		JMenu fileMenu = new JMenu("����");		
		mb.add(fileMenu); // �ʼ����� ������ �޴��� �̺�Ʈ���Դϴ�. ����� �ҷ�����, �ٸ��̸����� ���� ����� ���� ���� �� �ƽ��׿�. ������ �ּ��� ���ߴٰ� �����մϴ�.
		JMenuItem [] menuItem1 = new JMenuItem [4];
		MenuActionListener listener1 = new MenuActionListener(); //Action ������ ����
		//Screen �޴��� �޴������� ���� ����
		fileMenu.add(new JMenuItem("�������")).addActionListener(listener1);
		fileMenu.addSeparator();//�и��� ����
		fileMenu.add(new JMenuItem("�����")).addActionListener(listener1);
		fileMenu.addSeparator();//�и��� ����
		fileMenu.add(new JMenuItem("�ٽú��̱�")).addActionListener(listener1);
		fileMenu.addSeparator();//�и��� ����
		fileMenu.add(new JMenuItem("����")).addActionListener(listener1);
		
		JMenu moMenu = new JMenu("����");	 // ���� ������ �� �������� �ߴµ� ����Ʈ�� �ʹ� �������� ������ ���� �ְڴ�����. �׷��� '����'�� �з��ؼ� �޴��� �ϳ� �� �߰��߽��ϴ�. 	
		mb.add(moMenu);
		JMenuItem [] menuItem2 = new JMenuItem [4];
		MenuActionListener listener2 = new MenuActionListener(); //Action ������ ����
		//Screen �޴��� �޴������� ���� ����
		moMenu.add(new JMenuItem("�������� 90�� ȸ��")).addActionListener(listener2); // ���� �� �̹����� �ϹǷ� �Ѱ谡 �ִ�����  90���� �̵� �ǰ�, �� ������ �� �̻� ���������� �ʽ��ϴ�.
		moMenu.addSeparator();//�и��� ����
		moMenu.add(new JMenuItem("180�� ȸ��")).addActionListener(listener2);
		moMenu.addSeparator();//�и��� ����
		moMenu.add(new JMenuItem("���������� 90�� ȸ��")).addActionListener(listener2);// ����������  90���� �̵� �ǰ�, �� ������ �� �̻� ���������� �ʽ��ϴ�.
		moMenu.addSeparator();//�и��� ����
		moMenu.add(new JMenuItem("���� ��Ī")).addActionListener(listener2);
		moMenu.addSeparator();//�и��� ����
		moMenu.add(new JMenuItem("���� ��Ī")).addActionListener(listener2);
		moMenu.addSeparator();//�и��� ����
		moMenu.add(new JMenuItem("50% �۰�")).addActionListener(listener2);
		moMenu.addSeparator();//�и��� ����
		moMenu.add(new JMenuItem("50% ũ��")).addActionListener(listener2);
		moMenu.addSeparator();//�и��� ����
		moMenu.add(new JMenuItem("��� ����")).addActionListener(listener2); // ���� ����� ������ ������ ���� �����س����ϴ�.



				MenuActionListener listener = new MenuActionListener();
				for(int i=0; i<menuItem.length; i++) {
					menuItem[i] = new JMenuItem(itemTitle[i]);
					menuItem[i].addActionListener(listener);
					colorMenu.add(menuItem[i]);
				}
				mb.add(colorMenu);
				setJMenuBar(mb);				
			}
			class MenuActionListener implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent e) {
					String cmd = e.getActionCommand();
					switch(cmd) {
									
					case "ä�� 0%" :	
						imgLabel2.setIcon(new ImageIcon("image/pc2.3.jpg"));  
						// ä�� 0%�� ������ �̹����� ���� �����س����ϴ�. �ٷ� ����� �� �ְ� ���Դϴ�. switch ���� ���߽��ϴ�. case�� �������� �ʰ� �ϳ��� �̺�Ʈ �����ʸ� ������ �� �����ϱ��.
					
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;
					case "ä�� 100%" :	
						imgLabel2.setIcon(new ImageIcon("image/pc2.9.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;
					case "�����ϰ�" :
						imgLabel2.setIcon(new ImageIcon("image/pc2.7.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;
					case "������ũ" :
						imgLabel2.setIcon(new ImageIcon("image/pc2.8.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;
					case "�������" :
						imgLabel2.setIcon(new ImageIcon("image/pc2.jpg")); 
						imgLabel2.setVisible(true); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;
					case "�����" :  // ����⸦ �������¿��� �ٽú��̱⸦ ������ ������ � �޴�-�������� ������ ȭ�鿡 ��µ��� �ʵ��� �����߽��ϴ�.
						imgLabel2.setVisible(false); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;
					case "�ٽú��̱�" :
						imgLabel2.setVisible(true);
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null); break;
					case "����" :
						System.exit(0); break;	
					case "180�� ȸ��" :
						imgLabel2.setIcon(new ImageIcon("image/pc2.1.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;
					case "���� ��Ī" :
						imgLabel2.setIcon(new ImageIcon("image/pc2-3.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;	
					case "���� ��Ī" :
						imgLabel2.setIcon(new ImageIcon("image/pc2.2.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;
					case "50% �۰�" :
						imgLabel2.setIcon(new ImageIcon("image/pc2.5.jpg")); 
						setSize(400,380); 
						setResizable(false);
						setLocationRelativeTo(null);  break;
					case "50% ũ��" :
						imgLabel2.setIcon(new ImageIcon("image/pc2.6.jpg")); 
						setSize(1240,800); 
						setResizable(false);
						setLocationRelativeTo(null);  break;	
					case "�������� 90�� ȸ��" : 
						// ������ ©���� �������� ũ�⸦ ���Ӱ� �����س�����, ����->������ 90�� ȸ���� �����ø� ���۽����� ������ ����� �ٲ� ���� ������ ���ܼ� 180���� ��ĭ �� �Ʒ��� ���ҽ��ϴ�. �����Ͻñ� �ٶ��ϴ�.
						imgLabel2.setIcon(new ImageIcon("image/pc2-1.jpg")); 
						setSize(500,800); 
						setResizable(false);
						setLocationRelativeTo(null);  break;	
					case "���������� 90�� ȸ��" :
						imgLabel2.setIcon(new ImageIcon("image/pc2-2.jpg")); 
						setSize(500,800); 
						setResizable(false);
						setLocationRelativeTo(null);  break;	
						// ���������� ������->���� 90�� ȸ���� �����ø� ���۽����� ������ ����� �ٲ� ���� ������ ����� �����Ͻñ� �ٶ��ϴ�.
					case "��� ����" :
						imgLabel2.setIcon(new ImageIcon("image/pc2-4.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;	
					case "����ġ" :
						imgLabel2.setIcon(new ImageIcon("image/pc3.0.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;	
					case "�帮��" :
						imgLabel2.setIcon(new ImageIcon("image/pc3.1.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;		
					case "���ó��" :
						imgLabel2.setIcon(new ImageIcon("image/pc3.2.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;		
					case "��� +50" :
						imgLabel2.setIcon(new ImageIcon("image/pc3.3.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;		
					case "��� -50" :
						imgLabel2.setIcon(new ImageIcon("image/pc3.4.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;		
					} 

				}
			}		       
		});


		add(panel);
		setVisible(true); 	
		setSize(800,550);		
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// �⺻������ ������ �� �����ϴ� �������Դϴ�. �� ó������ ���׹��� �̾��µ� �̰� ���� ���ʿ����ϴ�.
	}
	

	public static void main(String[] args) {
		//JDHPEP �α���+�޴��� ���� �ҷ�����, �������� ����, ����, ���� �ð� �Բ� ��Ÿ���� ��ȭ ���α׷� ����
		new JDHPEP();        
    	JFrame.setDefaultLookAndFeelDecorated(true);
        try{
        	new JDHPEPClock();
            Thread.sleep(1000); //1�ʸ��� ���߱�, JDHPEPClock.java�� �����ΰ� �ð� ��ҿ� ������ �߻����� �ʵ��� �Բ� �����س��ҽ��ϴ�.

}catch(InterruptedException e){
e.printStackTrace(); } //try,catch���� ������ JDHPEPClock.java �ҽ��� ���������� �۵����� ���� ���ɼ��� �ֽ��ϴ�. �� �����ؾ� �մϴ�.
        
	}
	
}
