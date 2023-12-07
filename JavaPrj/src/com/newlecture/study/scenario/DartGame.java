package com.newlecture.study.scenario;

public class DartGame {
	public static void main(String[] args) throws InterruptedException {
		
//		--- 변수 선언 ----------------------------
		
		int target;
		int score = 0; 
		int n = 3; //라운드 횟수
		boolean isRun = true;
		
		Dart dar = new Dart();
		
////		--- 인트로 ----------------------------
//		
//		dar.dartArt();
//		dar.intro();
		
//		--- 게임 진행 ----------------------------
		while(isRun) {
			
			int num = dar.howMuchPlayers();
			String[] players = dar.whatIsName();
			int[][] playerScore = new int[num][n];
			int[] totalScore = new int[num];
			
			for(int i=0, j=1; i<n; i++,j++) {
				for(int k=0, p=1 ; k<num; k++, p++) {
					
					//다트 던지기
					System.out.printf("Round%d %s\n\n",j, players[k] );
					target = dar.throwDart();
					
					//유효성 검사
					if( !(1 <= target && target <=20) ) {
						System.out.println("잘못 입력하셨습니다! 다시 던져주세요!\n");
						k--;
						p--;
						continue;
					}
					dar.throwAffect();
					
					//점수 계산 및 출력
					score = dar.scoreCheck(target);
					Thread.sleep(1000);
					System.out.printf("%s. your score = %d\n\n\n", players[k], score);
					Thread.sleep(900);
					playerScore[k][i] = score;
				}
			}
		
//		--- 총 점수 출력 ----------------------------
		
			for(int p=0; p<num; p++)
				for(int i=0; i<n; i++)
					totalScore[p] += playerScore[p][i];
			
			System.out.println("계산 중...\n");
			Thread.sleep(1100);
			
			for(int p=0; p<num; p++)
				System.out.printf("Player%d : %d점\t", p+1, totalScore[p]);
		
//		--- 게임 반복 여부 ---------------------------
			isRun = dar.repeatGame();
		
		}
	}
}
