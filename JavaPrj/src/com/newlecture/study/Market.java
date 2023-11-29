package com.newlecture.study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Market {

	public static void main(String[] args) throws FileNotFoundException {
		
//		--- 변수 선언 -------------------
		String type; // 상품 종류
		String name; // 상품명
		int cost; // 판매가
		int stock; //재고 수량
		String loadType = "상품 종류 : ";
		String loadName = "상품 명 : ";
		String loadCost = "판매가 : ";
		String loadStock = "재고 수량 : ";
		
//		--- 데이터 입력 -----------------
		{
			Scanner scan = new Scanner(System.in);
			
			System.out.print(loadType);
			type = scan.nextLine();
			
			
			System.out.print(loadName);
			name = scan.nextLine();
			
			System.out.print(loadCost);
			cost = scan.nextInt();
			
			if(cost < 100 || 100_000 < cost) {
				
				System.out.println("금액 범위를 벗어났습니다. (금액 범위 : 100원~100,000원)");
				cost = scan.nextInt();
			}
			
			System.out.print(loadStock);
			stock = scan.nextInt();
			
			if(stock < 0 || 1_000 < stock) {
				
				System.out.println("재고 수량 범위를 벗어났습니다. (재고 수량 범위 : 0개~1,000개)");
				stock = scan.nextInt();	
			} 
			System.out.println();
			
		}
		
//		--- 데이터 저장 ----------------
		{
			PrintStream fout = new PrintStream("res/market.txt");
			fout.printf("%s %s %d %d ", type, name, cost, stock);
			
		}
		
		
//		--- 데이터 로드 ----------------
		{
			FileInputStream fis = new FileInputStream("res/market.txt");
			Scanner scan = new Scanner(fis);
			
			type = scan.next();
			name = scan.next();
			cost = scan.nextInt();
			stock = scan.nextInt();
			
			System.out.println(loadType + type);
			System.out.println(loadName + name);
			System.out.println(loadCost + cost);
			System.out.println(loadStock + stock);
			
		}
			

	}

}
