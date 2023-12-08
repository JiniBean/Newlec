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
				for(int k=0, p=1 ; k<num; k++, p++) {
					
					//다트 던지기
					System.out.printf("\nRound%d %s\n\n",j, players[k][0] );
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
					System.out.printf("%s. your score = %d\n\n\n", players[k][0], score);
					Thread.sleep(900);
					players[k][j] = String.valueOf(score);
				}
			}
		
//		--- 총 점수 출력 ----------------------------
			
			for(int p=0; p<num; p++) {
				int temp = 0;
				for(int i=0, j=1; i<n; i++,j++)
					temp += Integer.parseInt(players[p][j]);
				players[p][n+1] = String.valueOf(temp);
			}
			
			System.out.println("계산 중...\n");
			Thread.sleep(1100);
			
			for(int p=0; p<num; p++)
				System.out.printf("%s : %s점  ", players[p][0], players[p][n+1]);
			
			if(num==2) {
				
				boolean same = Integer.parseInt(players[0][n+1])==Integer.parseInt(players[1][n+1]);
				boolean whoWin = Integer.parseInt(players[0][n+1])>Integer.parseInt(players[1][n+1]);
			
				if(same)
					System.out.println("MATCH Tied!");
				else
					System.out.printf(whoWin? "\n\n%s WIN!" : "\n\n%s WIN!" , players[0][0], players[1][0]);
			}
			else if(num>2) {
				
				String[] rank = new String[2];
				for(int p=0; p<num-1; p++)
					for(int i=0; i<num-(1+p); i++) {
						int player1 = Integer.parseInt(players[i][n+1]);
						int player2 =Integer.parseInt(players[i+1][n+1]);
						
						if( player1<player2 ) {
							
							rank[0] = players[i][0];
							players[i][0] = players[i+1][0];
							players[i+1][0] = rank[0];
							
							rank[1] = players[i][n+1];
							players[i][n+1] = players[i+1][n+1];
							players[i+1][n+1] = rank[1];
							
						}
					}
				
				for(int p=0, i=1; p<num; p++, i++)
					System.out.printf("\n\n\n%d등 : %s\n", i, players[p][0]);
			}
				
				
			
//		--- 게임 반복 여부 ---------------------------
			isRun = dar.repeatGame();
		
		}
	}
}
