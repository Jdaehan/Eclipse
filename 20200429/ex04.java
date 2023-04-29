package pro20191450;
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		// 카페 메뉴 선택 후 계산 프로그램
		Scanner cho = new Scanner(System.in);
		//if-else 구문으로 제작
		//메뉴라는 인터페이스 - user가 선택을 도와주도록 하는 부분
		System.out.println("----- 메뉴 -----");
		System.out.println("1.에스프레소(2000원) 2.아메리카노(2500원)");
		System.out.println("3.카푸치노(3000원) 4.카페라떼(3500원)");
		System.out.println("메뉴 중 선택해 주세요: ");
		int menu = cho.nextInt();
		System.out.println("개수를 입력하세요:");
		int num = cho.nextInt();
		if(menu==1)
	    {System.out.println("주문 가격: "+2000*num+"원 입니다");
		System.out.println("에스프레소 맛나게 드세요");}
		else if(menu==2)
		{System.out.println("주문 가격: "+2500*num+"원 입니다");
	    System.out.println("아메리카노 맛나게 드세요");}
		else if(menu==2)
		{System.out.println("주문 가격: "+2500*num+"원 입니다");
		System.out.println("아메리카노 맛나게 드세요");}
		else if(menu==3)
	    {System.out.println("주문 가격: "+3000*num+"원 입니다");
	    System.out.println("카푸치노 맛나게 드세요");}
		else if(menu==4)
	    {System.out.println("주문 가격: "+3500*num+"원 입니다");
	    System.out.println("카페라떼 맛나게 드세요");}
		
		/*switch(menu)
		{
		case 1:{System.out.println("주문 가격: "+2000*num+"원 입니다");
		System.out.println("에스프레소 맛나게 드세요");} break;
		case 2:{System.out.println("주문 가격: "+2500*num+"원 입니다");
	    System.out.println("아메리카노 맛나게 드세요");} break;
		case 3:{System.out.println("주문 가격: "+3000*num+"원 입니다");
	    System.out.println("카푸치노 맛나게 드세요");} break;
		case 4:{System.out.println("주문 가격: "+3500*num+"원 입니다");
	    System.out.println("카페라떼 맛나게 드세요");} break;
	    default:System.out.println("메뉴 잘못 선택하셨습니다");
		}*/
	    
	}

}
