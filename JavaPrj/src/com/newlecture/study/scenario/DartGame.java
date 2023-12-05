package com.newlecture.study.scenario;

import java.util.Random;
import java.util.Scanner;

public class DartGame {

    public static void main(String[] args) throws InterruptedException {
        
//    ----------- 변수선언 --------------------------
        
        int per;
        int target;
        int score=0;
        int totalScore=0;
        int n = 3;
        
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        Dart dar = new Dart();
        
    
//        ----------- 인트로 ---------------------------
        
        dar.dartArt1();
        dar.intro();
        dar.dartArt();
        
        
        
//        ---------- 3회 반복---------------------------
        int[] roundScore = new int[n];
        
        for( int i=0, x=1; i<n ; i++, x++ ) {
            
           target = dar.Throw();
            
            /*유효성 검사*/
            if( !( 1 <= target && target <= 20 ) ) {
            	
            	System.out.println("잘못 입력하셨습니다! 다시 입력해주세요\n");
            	i--;
            	x--;
            	continue;
            }
            
            System.out.println("\n쓔우우웅\n\n");
			Thread.sleep(600);
			
			
			int perHitTriple=40;
			int perHitDouble=40;
			int perHitSingle=20;

			
			int a;
			int y;
			int z;
			
			if(target>15) {
				perHitTriple /=2;
				perHitSingle /=2;
			}
			else if(target>10) 
				perHitDouble /=2;
			
				
			x=100-perHitTriple;
			y=(x-1)-perHitDouble;
			z=(y-1)-perHitSingle;
			
			
			switch(per) {
			case(100 <= per && per <=x) :{
				score = dar.Triple(target);
				break;
			}
			case(x< per && per <=y):{
				score = dar.Double(target);
				break;
			}
			case(y< per && per <=z):{
				score = dar.Single(target);
				break;
			}
    		default:{
				score = dar.Miss(target);
				break;
    			
    		}
    		
//    		per = dar.Percent();
//    		
////    		System.out.println("current random number is... " + num);
////    		System.out.println("ratio is... " + per);
//            
//            if(target < 10) {
//            	switch (per) {
//					case 5:{
//						score = dar.Miss(target);
//						break;
//					}
//					case 10:{
//						score = dar.Single(target);
//						break;
//					}
//					case 35:{
//						score = dar.Double(target);
//						break;
//					}
//					case 50:{
//						score = dar.Triple(target);
//						break;
//					}
//            	}
//            }
//            else if(target < 15) {
//            	switch (per) {
//					case 5:{
//						score = dar.Triple(target);
//						break;
//					}
//					case 10:{
//						score = dar.Double(target);
//						break;
//					}
//					case 35:{
//						score = dar.Miss(target);
//						break;
//					}
//					case 50:{
//						
//						score = dar.Single(target);
//						break;
//					}
//            	}
//            }
//            else {
//            	switch (per) {
//	            	case 5:{
//	            		score = dar.Triple(target); // ?
//	            		break;
//	            	}
//	            	case 10:{
//	            		score = dar.Double(target);
//	            		break;
//	            	}
//	            	case 35:{
//	            		score = dar.Single(target);
//	            		break;
//	            	}
//	            	case 50:{
//	            		score = dar.Miss(target);
//	            	}
//            	}
//            }
            
          
//            각 라운드 별 점수 출력 및 저장
            
            System.out.println("Round" + x + ". your score = " + score );
            System.out.println();
            
            roundScore[i] = score;
            
        }
        
        
//        -------반복 끝, 총 점수 출력  ------------------------

        for(int i=0; i<n; i++)
        	totalScore += roundScore[i];
        
        System.out.println("계산 중...");
        Thread.sleep(1200);
        System.out.println("당신의 점수는 " + totalScore + "점 입니다" );
        
        
        sc.close();

    }
}
