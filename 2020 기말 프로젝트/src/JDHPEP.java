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
	    private int year, month, date, hour, min, second; //JDHPEPClock.java 연결을 위해 private 선언
	    private JLabel time;
	    private JTextField ab = new JTextField(10);
	    private JTextArea cd = new JTextArea(31, 120);
	    private static int size;
		private JLabel imgLabel1 = new JLabel();
		private String [] animal = {"고양이","제작자", "만든 프로그램 간단 설명"}; /* 원래  메모장 처럼 이미지 파일을 불러와서 하려고 했지만 
		텍스트는 할 수 있어도 이미지는 어려움이 있어서 콤보박스에 있는 이미지마다 편집하려고 했지만, 그것도 어려움이 있어서 하나의 사진을 두고 편집하는 방식으로
		바꾸었습니다. 하나로 끝내긴 아쉬움이 있어서 제작자와 프로그램 간단 키워드를 리스트에 같이 넣었습니다. 편집기능에서 "제작자"와 "만든 프로그램 간단 설명"
		은 편집이 원활하지 않지만, 자동적으로 프레임이 바뀐 상태에서 콤보박스를 누르면 프레임이 바뀐 상태에서 나타나는 이미지를 이해하실 수 있을 것입니다.*/
		private ImageIcon [] images = {new ImageIcon("image/pc2.jpg"), new ImageIcon("image/img3.jpg"), 
				new ImageIcon("image/img2.jpg")};
		private JLabel imgLabel2 = new JLabel(images[0]);

	 static String content = "";
	    static int flag = 0; // 저장  및  다른 이름으로 저장에 이
	    static int pos = 0;
	    static int fromindex = 0; // 메모장을 위한 static 선언
	
	public JDHPEP() {
		setTitle("★JDHPEP★"); 
		setSize(800,200); setVisible(true); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JOptionPane.showMessageDialog(null, "JDHPEP에 방문해 해주셔서 진심으로 환영합니다.", "반갑습니다.",JOptionPane.INFORMATION_MESSAGE); 
		// 접속할 때 마다 뜨는 알림? 공지사항? 이런 느낌으로 사용함.
		
		Container contentPane = getContentPane();
		getContentPane().add(imgLabel, BorderLayout.CENTER); //중앙에 두기.
		contentPane.setLayout(new FlowLayout());

		imgLabel.setIcon(new ImageIcon("image/img1.jpg")); // 이것도 사실 텍스트 레이블을 넣으려고 했는데, 이미지로도 잘 디자인 된 것같아서 냅두었습니다.
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		contentPane.setLayout(new FlowLayout());
		
	
		JPanel panel = new JPanel(); //로그인 프로그램 제작
		JLabel IdLabel = new JLabel("아이디 : ");
		JLabel psJLabel = new JLabel("비밀번호 : ");
		JTextField ID = new JTextField(10);
		JPasswordField PW = new JPasswordField(10); 
		PW.setEchoChar('*');
	
		JButton longBtn = new JButton("로그인");		
		longBtn.setBackground(Color.cyan);
		
				

		contentPane.add(longBtn);
		 Panel panel12up = new Panel();
		  Checkbox cb1 = new Checkbox("아이디 저장"); 
		  // 실제로 아이디 자동저장 되지는 않습니다. 그래서 지우려고 했지만 디자인 상으로 느낌 있었고 더욱 심화적으로 배우면 충분히 가능할 수 있을 것 같아서 넣었습니다.. 
		panel.add(cb1);
		panel.add(panel12up);
	
		panel.add(IdLabel);
		panel.add(ID);
	
		panel.add(psJLabel);
		panel.add(PW);
		
		panel.add(longBtn);
		JButton btn1 = new JButton("메모");
		c.add(btn1);
		setSize(100, 120);
		setVisible(true);
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "화면이 뜨지 않는 다면 재 접속 해주시길 바랍니다. 가급적 엔터키를 눌러주세요","서버 불안정",JOptionPane.WARNING_MESSAGE);
	    /* 여기가 참 난감한 문제가 있었습니다. 메모 버튼을 눌르고 저 showMessageDialog가 뜬 이후로 갑자기 시간을 제외하고 메모장 프레임이 생성되면서 바로 사라지는 식으로 없어지더라고요. 
	     이것이 지금도 가끔 발생하므로 혹시라도 이러한 상황이 발생할 지도 모르니 설정해놓았습니다. */
        setVisible(false); // 이전 로그인 프레임 지우기.
        imgLabel.setVisible(false);
        btn1.setVisible(false);
        PW.setVisible(false);
        ID.setVisible(false);
        IdLabel.setVisible(false);
        psJLabel.setVisible(false);
        longBtn.setVisible(false);
        cb1.setVisible(false); // 나머지 레이블, 프레임 가리기. 처음에는 새로운 프레임을 생성해야 할지 난감해서 많은 시간을 허비했지만 가리는 걸 찾았습니다.
        JFrame frame = new JFrame("메모"); // 메모 버튼을 눌렀을 때 메모장 프레임 생성
        frame.setVisible(true);
        frame.setSize(850,700); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel textPanel = new JPanel();  
        JPanel alarmPanel = new JPanel();
        frame.getContentPane().add(textPanel, "North");
        frame.getContentPane().add(alarmPanel, "So"+ "uth");
        bb.setLineWrap(true); // 자동적으로 줄바뀜으로 왼쪽 아래에 텍스트가 출력되도록 설정해놓았습니다.
    	bb.setWrapStyleWord(true);
    	 bb.setToolTipText("텍스트를 입력하세요"); //메모장 내용창에 마우스를 대면 자동적으로 메시지가 뜨도록 설정해놓았습니다.
   	        Border lineBorder = BorderFactory.createLineBorder(Color.black, 1); //테투리 1두께로 느낌있게 설정
    	    Border emptyBorder = BorderFactory.createEmptyBorder(7, 7, 7, 7);
    	    bb.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
    	    textPanel.add(new JScrollPane(bb)); //스크롤이 없으면 해당 내용의 한계치를 넘어가면 짤리니 스크롤바를 넣었습니다.
    	    JMenuBar menuBar = new JMenuBar();
    	    
    	    // 메뉴
    	    JMenu fileMenu = new JMenu("파일"); // 진짜 메모장 느낌으로 메뉴를 넣었습니다.
    	    // 메뉴 아이템 순서로 준비
    	    JMenuItem newItem = new JMenuItem("새 창");
    	    JMenuItem openItem = new JMenuItem("열기");
    	    JMenuItem saveItem = new JMenuItem("저장");
    	    JMenuItem saveasItem = new JMenuItem("다른 이름으로 저장");
    	    JMenuItem closeItem = new JMenuItem("끝내기");
    	 
    	    frame.setJMenuBar(menuBar);
    	 
    	    menuBar.add(fileMenu); // 파일
    	    fileMenu.add(newItem); // 새 창
    	    fileMenu.add(openItem); // 열기
    	    fileMenu.add(saveItem); // 저장
    	    fileMenu.add(saveasItem); // 다른 이름으로 저장
    	    fileMenu.add(closeItem); // 끝내기

    	    FileDialog mSave = new FileDialog(frame,"저장",FileDialog.SAVE);  
    	    FileDialog mOpen = new FileDialog(frame,"열기",FileDialog.LOAD); 
    	    
    	    
    	    newItem.addActionListener(new ActionListener(){
    	    
    	        public void actionPerformed(ActionEvent e){
    	            bb.setText(content);
    	            frame.setTitle("메모");
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
    	            
    	            
    	             bb.setText("");  // 입력하지 않은 상태에서 시작하므로  초기화 시켰습니다.
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
    	                    FileWriter fw = new FileWriter(data+".txt"); // 직접 .txt로 치는 게 귀찮을 수 있으니 txt로 자동저장 되는 식으로 설정했습니다.  
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
    	                    frame.setTitle(Filename + ".txt");  // 프레임 명을 파일명으로 이름을 변경합니다. 물론 .txt형식으로요.
    	                }catch(Exception e1){
    	 
    	                }
    	                flag = 1;
    	            }
    	            
    	            else if(flag == 1)
    	            {
    	                String data = mSave.getDirectory()+ mSave.getFile();  
    	            
    	                try{
    	                FileWriter fw = new FileWriter(data+".txt"); // txt파일로 저장합니다.
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
    	             String data = mSave.getDirectory()+ mSave.getFile();  // 기존 savaItem과 약간 유사합니다. 파일의 디렉토리 정보와 파일명을 얻는다.
    	             try{
    	              FileWriter fw = new FileWriter(data+".txt"); // txt파일로 저장한다.  
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
    	              frame.setTitle(Filename + ".txt");  // 마찬가지로 프레임 명을 파일명으로 바꿉니다.
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
				
				if(id.equals(ID.getText())&& pw.equals(PW.getText())) { //로그인 버튼을 누르면서 아이디와 비밀번호가 일치할 때
					// 여기부터 else if 가 나오기 전 까지 상당히 깁니다. 어쩌면 메인 프로그램으로 이동하기 위한 경로를 위한 소스가 되기도 합니다. 
		    btn1.setVisible(false);
            PW.setVisible(false);
            ID.setVisible(false);
            IdLabel.setVisible(false);
            psJLabel.setVisible(false);
            longBtn.setVisible(false);
            cb1.setVisible(false);
            imgLabel.setVisible(false); //기존에 있던 메인 로그인 레이블 및 프레임은 모두 가리기
            
            JLabel imgLabel =  new JLabel();
            setTitle("★JDHPEP 프로그램★"); // 메모장이 끝나고 본격적으로 메인 프로그램이라 할까요? 왼쪽은 사진 편집 프로그램 프레임의 타이틀(제목)을 설정하였습니다. 
            setSize(800,550); setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JOptionPane.showMessageDialog(null, "이미지 관련 저장, 가져오기 기능에는 한계가 있어서 편집 기능이라도 이용해주세요!", "참고해주세요!",JOptionPane.INFORMATION_MESSAGE); 
            /* 이미지는.. 도저히 업로드하고 저장하고 열고 하는 기능의 알고리즘을 세우기 한계가 있었습니다. 그래서 한계를 제외하더라도 중요한 편집기능에 대한 연결구조? 의 느낌으로 만들었고, 저장과 열기 기능이 
                     없는 프로그램에 혼란이 생길 수도 있으니 showMessaageDialog 메시지를 띄웠습니다.*/
          
            Container pc =getContentPane();
    	    pc.setLayout(new FlowLayout());
    	    JComboBox<String> combo = new JComboBox<String>(animal);
    	    pc.add(combo); pc.add(imgLabel2);
    	    Container c= getContentPane();
    	    c.setLayout(new FlowLayout());
            ImageIcon normalIcon = new ImageIcon("C:\\Users\\HOME\\eclipse-workspace\\전자정보통신공학과 20191450 장대한 기말\\image/dju1.jpg"); // 평소에
    	    ImageIcon rolloverIcon = new ImageIcon("C:\\Users\\HOME\\eclipse-workspace\\전자정보통신공학과 20191450 장대한 기말\\image/dju2.jpg"); // 마우스를 가져가 댔을 때
    	    ImageIcon pressedIcon = new ImageIcon("C:\\Users\\HOME\\eclipse-workspace\\전자정보통신공학과 20191450 장대한 기말\\image/dju3.jpg"); // 마우스로 클릭했을 때
    	    // JButton을 이용한 이미지 버튼을 만들기 위해 경로를 적은 이미지들 입니다.
    	    
    	    JButton dju = new JButton("재학중인 학교",normalIcon); // 어떤 이미지를 넣어서 표현할까 생각하다가 모교인 대전대학교 로고를 표현해보았습니다.
    	    dju.setPressedIcon(pressedIcon);
    	    dju.setRolloverIcon(rolloverIcon);
    	    c.add(dju);
    	    setSize(150,100);
    	    setVisible(true);
    	    
    	    createMenu();
    		getContentPane().add(imgLabel2, BorderLayout.CENTER);
    		setSize(800,550); setVisible(true);
    		setLocationRelativeTo(null); // 레이블이 아닌, 프레임을 중앙에 위치하게 한 중요한 소스입니다.
    		setResizable(false); // 어쩌면 중요할 수도 있는 소스죠. 프레임의 크기를 조절할 수 없도록 고정해놓은 상태입니다.
    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 메인 프레임이 닫을 때 프로그램도 안정적으로 종료될 수 있도록 하는 소스입니다.
    		combo.addActionListener(new ActionListener() { // ActionListener 가 없으면 이미지나 메뉴 등 어떤걸 해봐도 이벤트가 발생하지 않습니다.

				@Override
				public void actionPerformed(ActionEvent e) {
						JComboBox<String> cb = (JComboBox<String>)e.getSource();
						int index = cb.getSelectedIndex();
						imgLabel2.setIcon(images[index]);
					
				}
    			
    		});
    		
    
				}else {
					JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 다시 입력해주세요.","로그인 오류", JOptionPane.WARNING_MESSAGE
);        //원래는 아이디 또는 비밀번호가 일치하지 않으면 각각 뜨는 걸 생각할까 했는데 해킹 문제의 염려가 있으니 둘중 어느것이 틀렸는지 알 수 없게 표현했습니다.
					int result = JOptionPane.showConfirmDialog(null,  "재로그인 하시겠습니까", "프로그램 종료 재확인", JOptionPane.YES_NO_OPTION);
					if(result == JOptionPane.CLOSED_OPTION) {	
					}
					else if(result == JOptionPane.YES_OPTION) {
						// 재로그인을 할 지의 여부도 넣었습니다. 확인을 누르면 다시 로그인을 하는 창으로 돌아오게 됩니다.
					}
					else {
						JOptionPane.showMessageDialog(null, "모든 프로그램이 종료됩니다.","프로그램 종료",JOptionPane.ERROR_MESSAGE);
						System.exit(0); // 하지만 재로그인이 원치 않는다면 해당 메시지를 지워지는 것을 뿐더러 모든 프로그램이 함께 종료됩니다.
					}
			   }   
			}

			private void createMenu() {
				JMenuBar mb = new JMenuBar();
				JMenuItem [] menuItem = new JMenuItem [7];
				String[] itemTitle = { "밝기 +50" , "밝기 -50", "채도 0%", "채도 100%", "선명하게", "모자이크", "스케치", "흐리게", "흑백처리"};
				JMenu colorMenu = new JMenu("색감"); // 본격적인 편집 기능을 도울 메뉴들입니다. 여기는 색감에 해당하는 item들이 있습니다.
				
		JMenu fileMenu = new JMenu("파일");		
		mb.add(fileMenu); // 필수적인 파일의 메뉴의 이벤트들입니다. 저장과 불러오기, 다른이름으로 저장 기능이 없는 것이 참 아쉽네요. 하지만 최선을 다했다고 생각합니다.
		JMenuItem [] menuItem1 = new JMenuItem [4];
		MenuActionListener listener1 = new MenuActionListener(); //Action 리스너 생성
		//Screen 메뉴에 메뉴아이템 생성 삽입
		fileMenu.add(new JMenuItem("원래대로")).addActionListener(listener1);
		fileMenu.addSeparator();//분리선 삽입
		fileMenu.add(new JMenuItem("숨기기")).addActionListener(listener1);
		fileMenu.addSeparator();//분리선 삽입
		fileMenu.add(new JMenuItem("다시보이기")).addActionListener(listener1);
		fileMenu.addSeparator();//분리선 삽입
		fileMenu.add(new JMenuItem("종료")).addActionListener(listener1);
		
		JMenu moMenu = new JMenu("형태");	 // 원래 편집에 다 넣으려고 했는데 리스트가 너무 많아져서 지루할 수도 있겠더라고요. 그래서 '형태'로 분류해서 메뉴를 하나 더 추가했습니다. 	
		mb.add(moMenu);
		JMenuItem [] menuItem2 = new JMenuItem [4];
		MenuActionListener listener2 = new MenuActionListener(); //Action 리스너 생성
		//Screen 메뉴에 메뉴아이템 생성 삽입
		moMenu.add(new JMenuItem("왼쪽으로 90° 회전")).addActionListener(listener2); // 역시 한 이미지로 하므로 한계가 있더라고요  90도만 이동 되고, 더 눌러도 그 이상 증가하지는 않습니다.
		moMenu.addSeparator();//분리선 삽입
		moMenu.add(new JMenuItem("180° 회전")).addActionListener(listener2);
		moMenu.addSeparator();//분리선 삽입
		moMenu.add(new JMenuItem("오른쪽으로 90° 회전")).addActionListener(listener2);// 마찬가지로  90도만 이동 되고, 더 눌러도 그 이상 증가하지는 않습니다.
		moMenu.addSeparator();//분리선 삽입
		moMenu.add(new JMenuItem("세로 대칭")).addActionListener(listener2);
		moMenu.addSeparator();//분리선 삽입
		moMenu.add(new JMenuItem("가로 대칭")).addActionListener(listener2);
		moMenu.addSeparator();//분리선 삽입
		moMenu.add(new JMenuItem("50% 작게")).addActionListener(listener2);
		moMenu.addSeparator();//분리선 삽입
		moMenu.add(new JMenuItem("50% 크게")).addActionListener(listener2);
		moMenu.addSeparator();//분리선 삽입
		moMenu.add(new JMenuItem("배경 제거")).addActionListener(listener2); // 직접 배경을 제거한 사진도 따로 저장해놨습니다.



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
									
					case "채도 0%" :	
						imgLabel2.setIcon(new ImageIcon("image/pc2.3.jpg"));  
						// 채도 0%의 상태인 이미지를 따로 저장해놨습니다. 바로 출력할 수 있게 말입니다. switch 문이 편리했습니다. case로 복잡하지 않게 하나씩 이벤트 리스너를 설정할 수 있으니까요.
					
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;
					case "채도 100%" :	
						imgLabel2.setIcon(new ImageIcon("image/pc2.9.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;
					case "선명하게" :
						imgLabel2.setIcon(new ImageIcon("image/pc2.7.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;
					case "모자이크" :
						imgLabel2.setIcon(new ImageIcon("image/pc2.8.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;
					case "원래대로" :
						imgLabel2.setIcon(new ImageIcon("image/pc2.jpg")); 
						imgLabel2.setVisible(true); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;
					case "숨기기" :  // 숨기기를 누른상태에서 다시보이기를 누르지 않으면 어떤 메뉴-아이템을 눌러도 화면에 출력되지 않도록 설정했습니다.
						imgLabel2.setVisible(false); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;
					case "다시보이기" :
						imgLabel2.setVisible(true);
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null); break;
					case "종료" :
						System.exit(0); break;	
					case "180° 회전" :
						imgLabel2.setIcon(new ImageIcon("image/pc2.1.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;
					case "세로 대칭" :
						imgLabel2.setIcon(new ImageIcon("image/pc2-3.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;	
					case "가로 대칭" :
						imgLabel2.setIcon(new ImageIcon("image/pc2.2.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;
					case "50% 작게" :
						imgLabel2.setIcon(new ImageIcon("image/pc2.5.jpg")); 
						setSize(400,380); 
						setResizable(false);
						setLocationRelativeTo(null);  break;
					case "50% 크게" :
						imgLabel2.setIcon(new ImageIcon("image/pc2.6.jpg")); 
						setSize(1240,800); 
						setResizable(false);
						setLocationRelativeTo(null);  break;	
					case "왼쪽으로 90° 회전" : 
						// 사진이 짤려서 프레임의 크기를 새롭게 설정해놨지만, 왼쪽->오른쪽 90도 회전을 누르시면 갑작스럽게 프레임 사이즈가 바뀌어서 멈춤 현상이 생겨서 180도와 한칸 더 아래로 놓았습니다. 주의하시길 바랍니다.
						imgLabel2.setIcon(new ImageIcon("image/pc2-1.jpg")); 
						setSize(500,800); 
						setResizable(false);
						setLocationRelativeTo(null);  break;	
					case "오른쪽으로 90° 회전" :
						imgLabel2.setIcon(new ImageIcon("image/pc2-2.jpg")); 
						setSize(500,800); 
						setResizable(false);
						setLocationRelativeTo(null);  break;	
						// 마찬가지로 오른쪽->왼쪽 90도 회전을 누르시면 갑작스럽게 프레임 사이즈가 바뀌어서 멈춤 현상이 생기니 유의하시길 바랍니다.
					case "배경 제거" :
						imgLabel2.setIcon(new ImageIcon("image/pc2-4.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;	
					case "스케치" :
						imgLabel2.setIcon(new ImageIcon("image/pc3.0.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;	
					case "흐리게" :
						imgLabel2.setIcon(new ImageIcon("image/pc3.1.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;		
					case "흑백처리" :
						imgLabel2.setIcon(new ImageIcon("image/pc3.2.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;		
					case "밝기 +50" :
						imgLabel2.setIcon(new ImageIcon("image/pc3.3.jpg")); 
						setSize(800,550); 
						setResizable(false);
						setLocationRelativeTo(null);  break;		
					case "밝기 -50" :
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
// 기본적으로 시작할 때 설정하는 프레임입니다. 맨 처음에는 뒤죽박죽 이었는데 이것 또한 기초였습니다.
	}
	

	public static void main(String[] args) {
		//JDHPEP 로그인+메뉴에 사진 불러오기, 사진편집 가능, 저장, 현재 시각 함께 나타내는 심화 프로그램 제작
		new JDHPEP();        
    	JFrame.setDefaultLookAndFeelDecorated(true);
        try{
        	new JDHPEPClock();
            Thread.sleep(1000); //1초마다 멈추기, JDHPEPClock.java의 디자인과 시간 요소에 오류가 발생하지 않도록 함께 설정해놓았습니다.

}catch(InterruptedException e){
e.printStackTrace(); } //try,catch문이 없으면 JDHPEPClock.java 소스가 정상적으로 작동하지 않을 가능성이 있습니다. 꼭 선언해야 합니다.
        
	}
	
}
