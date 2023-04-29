package 가위바위보;
import java.util.Scanner;
public class 대한이의가위바위보 {

	public static void main(String[] args) 
		// 반복문과 조건문을 활용한 가위바위보 게임 프로그램 자유롭게 만들어보기
	{
		System.out.println("대한이와 짜릿한 가위바위보!!");
		Scanner scanner = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		while(true) {
			System.out.println("가위..바위..보!!>>");
			String attacker =scanner.next();
			int ra = (int)(Math.random()*3);
			int hitnum = 0;
			if(attacker.equals("여기까지"))	
			{	
				System.out.println("게임을 종료합니다.");
				break;
			}
			if(attacker.equals("가위")) {hitnum = 0;}
			if(attacker.equals("바위")) {hitnum = 1;}
			if(attacker.equals("보")) {hitnum = 2;}
			System.out.print("유저 = " + attacker + ", " + "대한 = " +str[ra] + ", ");
			if((hitnum + 2) % 3 == ra)
				System.out.println("운이 좋군요.유저가 가위바위보 경기를 이겼습니다.");
			else if(hitnum == ra)
				System.out.println("아쉽게도 비겼습니다. 재경기 해야겠군요.");
			else
				System.out.println("불길한 기운이 맴돌군요. 대한이가 이겼습니다.");			
			}
	        scanner.close();
	}	
}
