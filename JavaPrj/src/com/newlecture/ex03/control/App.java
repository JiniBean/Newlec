package com.newlecture.ex03.control;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {
		
//		------ 성적 로드 ------------------------------------
		int kor1, kor2, kor3 = 0;
		
//		{
			FileInputStream fis = new FileInputStream("res/ex03.txt");
			
			Scanner scan = new Scanner(fis);
			kor1 = scan.nextInt();
			kor2 = scan.nextInt();
			kor3 = scan.nextInt();
			
			
			System.out.println(kor1);
			System.out.println(kor2);
			System.out.println(kor3);
//	
//			{
//				int b = fis.read();
//				System.out.println(b);
//			}
//			
//			{
//				int b = fis.read();
//				System.out.println(b);
//			}
//			
//			{
//				int b = fis.read();
//				System.out.println(b);
//			}
//			
			scan.close();
			fis.close();
			
//		}
		
//		----- 성적 출력 ------------------------------------------- 
//		{
//			
//			float avg;
//			int total;
//			total = kor1 + kor2 + kor3;
//			avg =  total/3.0f;
//			
//			System.out.println("┌─────────────────────────────┐");
//			System.out.println("│          성적 출력          │");
//			System.out.println("└─────────────────────────────┘");
//			System.out.printf("국어1 : %d\n", kor1);
//			System.out.printf("국어2 : %d\n", kor2);
//			System.out.printf("국어3 : %d\n", kor3);
//			System.out.println();
//			System.out.printf("total : %d\n", total);
//			System.out.printf("avg : %f\n", avg);//평균값 출력
//			System.out.println();
//			System.out.println("123456789123\b56789123");
//			System.out.println("────────────\n───────────────────");
//			
//		}
		
//	 	----- 성적 입력 -----------------------------------------
//		{
			
			Scanner scan1 = new Scanner(System.in);
			
			System.out.println("┌─────────────────────────────┐");
			System.out.println("│          성적 입력          │");
			System.out.println("└─────────────────────────────┘");
			
			System.out.print("국어1 : ");
//			kor1 = System.in.read();
			kor1 = scan1.nextInt();
			
			if ( kor1 < 0 || 100 < kor1 ) {
				System.out.println("성적 범위를 초과하셨습니다.(0~100)");
			}
	
			
			System.out.print("국어2 : ");
//			kor2 = System.in.read();
			kor2 = scan1.nextInt();
			
			
			System.out.print("국어3 : ");
//			kor3 = System.in.read();
			kor3 = scan1.nextInt();
			
//			scan1.close(); // 닫으면 콘솔입력스트림까지 닫혀버림 근데 우리는 생성할 수가 없음
		
//		}
		
//    	------ 성적 저장 -----------------------------------------
		{
//		  	
//			int kor1, kor2, kor3;
//		  	kor1 = 50;
//		  	kor2 = 60;
//		  	kor3 = 80;
//		  	
//		  	FileOutputStream fos = new FileOutputStream("res/ex03.txt");
		  	PrintStream fout = new PrintStream("res/ex03.txt");
		  	fout.printf("%d %d %d" , kor1, kor2, kor3);
		   	System.out.println("작업 완료");
		   	
		  	fout.close();
		  	
		}	
		
//		Scanner sc = new Scanner(System.in); //위에서 Scanner(system.in) 닫으면 system.in도 같이 닫힘
//		kor1 = sc.nextInt();
//		System.out.println(kor1);
		
	}
}