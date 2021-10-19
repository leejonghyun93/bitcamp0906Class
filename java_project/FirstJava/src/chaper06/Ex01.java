package chaper06;

public class Ex01 {

//	1.국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 점수를 모두 출력하고, 
//	평균 점수를 출력하는 프로그램을 작성해봅시다.
//
//	각 점수는 랜덤한 값을 생성해서 입력합시다.

	public static void main(String[] args) {
		int[][] score = new int[10][3];


	    System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
	    
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			float avg = 0.0f;
	
			
			for (int j = 0; j < score[i].length; j++) {
				int score1 = (int) (Math.random() * 50) + 50;
				sum += score[i][j];
				System.out.println(score[i][j]);
			}
		}

	}
}
