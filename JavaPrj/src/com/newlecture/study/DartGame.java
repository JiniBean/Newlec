package com.newlecture.study;

import java.util.Random;
import java.util.Scanner;

public class DartGame {

	public static void main(String[] args) throws InterruptedException {
		
//    ----------- 변수선언 --------------------------
		
		int per;
		int target;
		int score = 0;
		int firstScore = 0;
		int secondScore = 0;
		int thirdScore = 0;
		int totalScore = 0;
		
		
		Dart dar = new Dart();
		
	
//	    ----------- 인트로 ---------------------------
		
		dar.dartArt1();
		dar.intro();
		dar.dartArt();
		
		
		
//	    ---------- 3회 반복---------------------------
		
		for( int i=0, x=1; i<=3; i++,x++ ) {
			
			target = dar.Throw();
			if( !(1<= target && target <= 20)) {
				System.out.println("잘못 입력하셨습니다! 다시 입력해주세요");
				x--;
				continue;
			}

			
			
//	    --------- 타겟별 확률 ---------------------------
			
			per = ran.nextInt(100)+1;
//			target = 20~15
			if (15 <= target && target <= 20) {
				
				
				if (per <= 5 ) {
					score = dar.Triple(target);
				
				} else if (5 < per && per <= 15) {
					score = dar.Double(target);
				
				} else if (15 < per && per <= 50) {
					score = dar.Single(target);
					
				} else if (50 < per && per <= 100) {
					score = dar.Miss(target);
				} 
				
				
//			target = 14~10
			} else if (10 <= target && target <= 14) {
				
				if (per <= 10 ) {
					score = dar.Triple(target);
					
				} else if (10 < per && per <= 20) {
					score = dar.Double(target);
				
				} else if (20 < per && per <= 70) {
					score = dar.Single(target);
					
				} else if (70 < per && per <= 100) {
					score = dar.Miss(target);
					
				} 
			
				
//			target = 1~9
			} else if (1 <= target && target <= 9) {
				if (per <= 50 ) {
					score = dar.Triple(target);
				
				} else if (50 < per && per <= 90) {
					score = dar.Double(target);
					
				} else if (90 < per && per <= 95) {
					score = dar.Single(target);
					
					
				} else {
					score = dar.Miss(target);
					
				}
				
//			잘못 입력 했을 떄	
			} else {
				System.out.println("잘못 입력하셨습니다! 다시 입력해주세요");
				x--;
				continue;
			}
			
			
//			각 라운드 별 점수 출력 및 저장
			System.out.println("Round" + x + ". your score = " + score );
			System.out.println();
			
			if (x==1) {
				firstScore = score;
				
			} else if (x==2) {
				secondScore = score;
				
			} else if(x==3) {
				thirdScore = score;
			}
		
		}
		
		
//	    -------반복 끝, 총 점수 출력  ------------------------
		totalScore = firstScore + secondScore + thirdScore;
		
		System.out.println("계산 중...");
		Thread.sleep(1200);
		System.out.println("당신의 점수는 " + totalScore + "점 입니다" );
		
		sc.close();
	}

}
