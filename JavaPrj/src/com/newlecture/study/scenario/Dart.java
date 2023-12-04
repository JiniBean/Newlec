package com.newlecture.study.scenario;

import java.util.Random;
import java.util.Scanner;

public class Dart {

	private final int MISS = 0;
	private final int SINGLE = 1;
	private final int DOUBLE = 2;
	private final int TRIPLE = 3;
	// 👍👍
	
	public void dartArt() {
		
		System.out.println("                          ___     ");      
		System.out.println("          쓔우웅~!!    /\\ _ /\\   ");     
		System.out.println("    >>>----           / /\\ /\\ \\  ");   
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
		System.out.println("다트보드에는 20부터 1까지의 타겟존이 있고\n각각 싱글존, 더블존, 트리플존, 미스존이 있습니다.\n");
		Thread.sleep(1000);
		System.out.println("미스나면 0점, 더블존은 x2, 트리플존 x3의 점수를 가져갑니다\n");
		Thread.sleep(1000);
		System.out.println("타겟이 좋을 수록 맞추기도 어려워지겠죠??\n미스나지 않게 조심하세요!!\n\n");
		Thread.sleep(1000);
		System.out.println("자, 그럼 시작합니다~~!");
		Thread.sleep(1000);
	}
	
	public int Throw() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("타겟을 향해 던지세요! (던지고 싶은 타겟의 숫자를 입력해주세요)\n");
		int target = sc.nextInt();
		return target;
		
	}
	
	public int Percent() {
		Random ran = new Random();
		int per;
		int num;
		
		num = ran.nextInt(100)+1;
		
		if(num <= 5)
			per = 5;
		else if (num <= 15) 
			per = 10;
		else if (num <= 50) 
			per = 35;
		else 
			per = 50;
		return per;
		
			
	}
	
	
	public int Triple(int target) {
		System.out.println("WOW!! TRIPLE!!");
		int score = target * TRIPLE;
		return score;
	}
		
	public int Double(int target) {
		System.out.println("GOOD!! DOUBLE!!");
		int score = target * DOUBLE;
		return score;
	}
		
	public int Single(int target) {
		System.out.println("SINGLE!!");
		int score = target * SINGLE;
		return score;
	}
	
	public int Miss(int target) {
		System.out.println("OH NOOO, MISS!!");
		int score = target * MISS;
		return score;
	}
		
		
        
}
