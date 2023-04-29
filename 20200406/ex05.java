
public class ex05 {
	public static void main(String[] args) {
		// 4년 전체 평점 평을 출력하는 프로그램 제작
		double score[][] = {{4.02, 4.12},{4.13, 4.15},{4.2,4.25},{4.3,4.5} };
		double sum=0;
		for(int year=0; year<score.length; year++) // 각 학년별로 반복
			for(int term=0; term<score[year].length; term++) //전체 평점 합
				sum += score[year][term]; // 전체 평점 합
		
	int n=score.length; //배열의 행 개수, 4
	int m=score[0].length; //배열의 열 개수, 2
	System.out.println("4년 전체 평점 평균은 " + sum/(n*m));
	
		
	}

}
