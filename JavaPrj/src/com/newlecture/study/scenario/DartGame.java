package com.newlecture.study.scenario;

public class DartGame {
	public static void main(String[] args) throws InterruptedException {
		
//		--- 변수 선언 ----------------------------
		
		int target;
		int score = 0; //각 회차 점수
		int totalScore = 0; //총점수
		int n = 3; //라운드 횟수
		
		Dart dar = new Dart();
		
//		--- 인트로 ----------------------------
		
		dar.dartArt();
		dar.intro();
		
//		--- 게임 진행 ----------------------------
		
		int[] roundScore = new int[n];
		
		for(int i=0, j=1; i<n; i++,j++) {
			
			//다트 던지기
			target = dar.throwDart();
			
			//유효성 검사
			if( !(1 <= target && target <=20) ) {
				System.out.println("잘못 입력하셨습니다! 다시 던져주세요!\n");
				j--; //해당 회차 카운트 리셋
				i--;
				continue;
			}
			
			//점수 계산 및 출력
			score = dar.scoreCheck(target);
			Thread.sleep(1000);
			System.out.printf("Round %d. your score = %d\n\n\n", j, score);
			Thread.sleep(900);
			roundScore[i] = score;
		}
		
//		--- 총 점수 출력 ----------------------------
		
		for(int i=0; i<n; i++)
			totalScore += roundScore[i];
		
		System.out.println("계산 중...\n");
		Thread.sleep(1100);
		System.out.printf("당신의 점수는 %d점 입니다", totalScore);
		
	}
}
