package com.newlecture.study.scenario;

public class DartGame {
	
	public static void main(String[] args) throws InterruptedException {
		
//		--- 변수 선언 ----------------------------
		
		int target;
		int score = 0; 
		boolean isRun = true;
		
		Dart dar = new Dart();
		
////		--- 인트로 ----------------------------
		
		dar.dartArt();
		dar.intro();
		
//		--- 게임 진행 ----------------------------
		while(isRun) {
			
			//게임 세팅 
			String[][] players = dar.setting();
			int num = players.length;
			int n = players[0].length-2; //라운드 횟수
			
			for(int i=0, j=1; i<n; i++,j++) {
				for(int k=0 ; k<num; k++) {
					
					//다트 던지기
					System.out.println("      R1       R2       R3 ");
					
					for(int p=0 ; p<num; p++) {
						if(i==0) {
							System.out.println("   ┌───────┐┌───────┐┌───────┐");
							System.out.printf("   │  %s  ││      ││      │\n", players[k][1]);
							System.out.println("   └───────┘└───────┘└───────┘\n");
						}
						
						else if(i==1) {
							System.out.println("   ┌───────┐┌───────┐┌───────┐");
							System.out.printf("   │  %s  ││  %s  ││      │\n", players[k][1], players[k][2]);
							System.out.println("   └───────┘└───────┘└───────┘\n");
						}
						else {
							System.out.println("   ┌──────┐┌──────┐┌──────┐");
							System.out.printf("   │  %s  ││  %s  ││  %s  │\n", players[k][1], players[k][2], players[k][3]);
							System.out.printf("   └───────┘└───────┘└───────┘\n");
						}
							
					}
					
					System.out.printf("\nRound%d %s\n\n",j, players[k][0] );
					target = dar.throwDart();
					
					//유효성 검사
					if( !(1 <= target && target <=20) ) {
						System.out.println("잘못 입력하셨습니다! 다시 던져주세요!\n");
						k--;
						continue;
					}
					dar.throwAffect();
					
					//점수 계산 및 출력
					score = dar.scoreCheck(target);
					Thread.sleep(1000);
					System.out.printf("%s. your score = %d\n\n\n", players[k][0], score);
					Thread.sleep(900);
					players[k][j] = String.valueOf(score);
					players[k][n+1] += String.valueOf(score);
				}
			}
		
//		--- 총 점수 출력 ----------------------------
			System.out.println("계산 중...\n");
			Thread.sleep(1100);
			
			players = dar.scoreCalculate(players);
			
//		--- 게임 반복 여부 ---------------------------
			isRun = dar.repeatGame();
		
		}
	}
}
