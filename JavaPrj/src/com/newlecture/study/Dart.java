package com.newlecture.study;

public class Dart {
	
	
	
	public void dartArt() {
		
		System.out.println("                         ___     ");      
		System.out.println("                       /\\ _ /\\   ");     
		System.out.println("   >>>----            / /\\ /\\ \\  ");   
		System.out.println(" >>>----             |---(*)---| ");     
		System.out.println("                      \\ \\/_\\/ /  ");      
		System.out.println("          >>>----      \\/___\\/   ");    
		System.out.println("                                 ");
		
	}
		
	public void dartArt1() {

		System.out.println("                                                                     ");
		System.out.println("    /M\\\\M|||M//.                                                    ");
		System.out.println("   /MMM\\\\|||///M:.                                                  "); 
		System.out.println("  /MMMMM\\ | //MMMM:.                                                ");
		System.out.println(" (=========+======<]]]]::::::::::<|||_|||_|||_|||_|||_|||>=========- ");
		System.out.println("  \\#MMMM// | \\MMMM:'                                                ");     
		System.out.println("   \\#MM///|||\\\\M:'                                                  ");
		System.out.println("    \\M///M|||M\\\'                                                    "); 
		System.out.println("                                                                     ");    
		   
	}
	
	
	public void intro() throws InterruptedException {
		
		Thread.sleep(900);
		System.out.println("재밌는 다트 게임!!\n");
		Thread.sleep(900);
		System.out.println("당신에게는 3개의 다트핀이 주어집니다.\n");
		Thread.sleep(1000);
		System.out.println("다트보드에는 1부터 20의 숫자가 있고 각각 싱글존, 더블존, 트리플존, 미스존이 있습니다.\n");
		Thread.sleep(1000);
		System.out.println("미스나면 0점, 더블존을 맞추면 두배, 트리플존을 맞추면 세배의 점수를 가져갑니다\n");
		Thread.sleep(1000);
		System.out.println("타겟이 좋을 수록 맞추기도 어려워지겠죠?? 미스나지 않게 조심하세요!!\n\n");
		Thread.sleep(1000);
		System.out.println("자, 그럼 시작합니다~~!");
		Thread.sleep(1000);
	}
	
	
	
	int miss = 0;
	int single = 1;
	int douBle = 2;
	int TRIPLE = 3;
	
	public int Triple(int target) {
		System.out.println("WOW!! TRIPLE!!");
		int score = target * TRIPLE;
		return score;
	}
		
	public int Double(int target) {
		System.out.println("GOOD!! DOUBLE!!");
		int score = target * douBle;
		return score;
	}
		
	public int Single(int target) {
		System.out.println("SINGLE!!");
		int score = target * single;
		return score;
	}
	
	public int Miss(int target) {
		System.out.println("OH NOOO, MISS!!");
		int score = target * miss;
		return score;
	}
		
		
        
}
