package com.newlecture.study.scenario;

import java.io.IOException;

public class DartGame {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
//		--- 변수 선언 ----------------------------
		
		int target;
		int score = 0; 
		boolean isRun = true;
		
		Dart dart = new Dart();
		
////		--- 인트로 ----------------------------
		
//		dar.dartArt();
//		dar.intro();
		
//		--- 게임 진행 ----------------------------
		while(isRun) {
			
			//게임 세팅 
			DartPlayer[] players = dart.setting();
			int num = players.length;//플레이어수
			int n = 2; //라운드 횟수
			
			for(int i=0, j=1; i<n; i++,j++) {
				for(int k=0 ; k<num; k++) {
					
					//다트 던지기
					
					
//					for(int p=0 ; p<num; p++) {
//						if(i==1) {
//							System.out.println("       R1        R2        R3 ");
//							System.out.println("   ┌────────┐┌────────┐┌────────┐");
//							System.out.printf("   │   %s   ││        ││        │\n", string.players[p][1]);
//							System.out.println("   └────────┘└────────┘└────────┘\n");
//						}
//						
//						else if(i==2) {
//							System.out.println("   ┌────────┐┌────────┐┌────────┐");
//							System.out.printf("   │   %s   ││   %s   ││        │\n", players[p][1], players[p][2]);
//							System.out.println("   └────────┘└────────┘└────────┘\n");
//						}
//							
//					}
					
					System.out.printf("\nRound%d %s\n\n",j, players[k].name );
					target = dart.throwDart();
				
					dart.throwAffect(); //쓔우웅
					
					//점수 계산 및 출력
					score = dart.scoreCheck(target);
					Thread.sleep(1000);
					System.out.printf("%s. your score = %d\n\n\n", players[k].name, score);
					Thread.sleep(900);
					
					//각 라운드 별 점수 저장
					switch (j) {
					
					case 1 : 
						players[k].firstScore = score;
					case 2 : 
						players[k].secondScore = score;
					case 3 : 
						players[k].tirdScore = score;
					}
					
					players[k].totalScore += score; // 총점수에 더하기
				}
			}
		
//		--- 총 점수 출력 ----------------------------
			System.out.println("계산 중...\n");
			Thread.sleep(1100);
			
			players = dart.scoreCalculate(players);
			
//		--- 저장 및 반복여부 ---------------------------
			dart.loadToHall(players);
			isRun = dart.repeatGame();
		
		}
	}
}
