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
        
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        Dart dar = new Dart();
        
    
//        ----------- 인트로 ---------------------------
//        
        dar.dartArt1();
        dar.intro();
        dar.dartArt();
        
        
        
//        ---------- 3회 반복---------------------------
        
        for( int i=0, x=1; i<3 ; i++, x++ ) {
            
           target = dar.Throw();
            
            /*거르기*/
            if( !( 1 <= target && target <= 20 ) ) {
            	
            	System.out.println("잘못 입력하셨습니다! 다시 입력해주세요");
            	i--;
            	x--;
            	continue;
            }
            
            System.out.println("\n쓔우우웅\n");
    		Thread.sleep(600);
    		
    		
    		int num;
    		
    		num = ran.nextInt(100)+1;
    		
    		if (num <= 5) 
    			per = 5;
    		else if (num <= 15) 
    			per = 10;
    		else if (num <= 50) 
    			per = 35;
    		else 
    			per = 50;
    		
    		System.out.println("current random number is... " + num);
    		System.out.println("ratio is... " + per);
            
            if(target < 10) {
            	switch (per) {
					case 5:{
						score = dar.Miss(target);
						break;
					}
					case 10:{
						score = dar.Single(target);
						break;
					}
					case 35:{
						score = dar.Double(target);
						break;
					}
					case 50:{
						score = dar.Triple(target);
						break;
					}
            	}
            }
            else if(target < 15) {
            	switch (per) {
					case 5:{
						score = dar.Triple(target);
						break;
					}
					case 10:{
						score = dar.Double(target);
						break;
					}
					case 35:{
						score = dar.Miss(target);
						break;
					}
					case 50:{
						
						score = dar.Single(target);
						break;
					}
            	}
            }
            else {
            	switch (per) {
	            	case 5:{
	            		score = dar.Triple(target); // ?
	            		break;
	            	}
	            	case 10:{
	            		score = dar.Double(target);
	            		break;
	            	}
	            	case 35:{
	            		score = dar.Single(target);
	            		break;
	            	}
	            	case 50:{
	            		score = dar.Miss(target);
	            	}
            	}
            }
            
          
//            각 라운드 별 점수 출력 및 저장
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
        
        
//        -------반복 끝, 총 점수 출력  ------------------------
        totalScore = firstScore + secondScore + thirdScore;
        
        System.out.println("계산 중...");
        Thread.sleep(1200);
        System.out.println("당신의 점수는 " + totalScore + "점 입니다" );
        
        
        sc.close();

    }
}
