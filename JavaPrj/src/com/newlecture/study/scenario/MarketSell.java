package com.newlecture.study.scenario;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class MarketSell {

	public static void main(String[] args) throws IOException {
		
//		--- 변수 선언 -------------------
		
		String loadCategory = "상품 분류 : ";
		String loadType = "상품 종류 : ";
		String loadName = "상품 명 : ";
		String loadCost = "판매가 : ";
		String loadStock = "재고 수량 : ";
		
//		--- 데이터 입력 -----------------
		{
			Scanner scan = new Scanner(System.in);
			
			System.out.println("등록할 상품의 갯수를 입력해주세요");
			int num = scan.nextInt();
			scan.nextLine();
			Product temp = new Product();
			
			for(int i=0; i<num; i++) {
				System.out.print(loadCategory);
				temp.category = scan.nextLine();
				
				System.out.print(loadType);
				temp.type = scan.nextLine();
				
				
				System.out.print(loadName);
				temp.name = scan.nextLine();
				
				System.out.print(loadCost);
				temp.cost = Integer.parseInt(scan.nextLine());
				
				if(temp.cost < 100 || 100_000 < temp.cost) {
					
					System.out.println("금액 범위를 벗어났습니다. (금액 범위 : 100원~100,000원)");
					temp.cost = Integer.parseInt(scan.nextLine());
				}
				
				System.out.print(loadStock);
				temp.stock = Integer.parseInt(scan.nextLine());
				
				if(temp.stock < 0 || 1_000 < temp.stock) {
					
					System.out.println("재고 수량 범위를 벗어났습니다. (재고 수량 범위 : 0개~1,000개)");
					temp.stock = Integer.parseInt(scan.nextLine());
				} 
				
				PrintStream fout = new PrintStream("res/market.txt");
				fout.printf("%s %s %s %d %d",temp.category, temp.type, temp.name, temp.cost, temp.stock);
				fout.println("");
			}
		}
		
		System.out.println();
		
		
		
//		--- 데이터 저장 ----------------
		{
			
		}
		
		
//		--- 데이터 로드 ----------------
		int count = 0;
		{
			FileInputStream fis = new FileInputStream("res/market.txt");
			Scanner fscan = new Scanner(fis);
			
			while(fscan.hasNextLine()) {
				count++;
				fscan.nextLine();
			}
			fscan.close();
			fis.close();
		}
		
		{
			Product[] product =  new Product[count];
			Product temp = new Product();
			
			FileInputStream fis = new FileInputStream("res/market.txt");
			Scanner fscan = new Scanner(fis);
			
			for(int i=0; i<count; i++) {
				temp.category = fscan.next();
				temp.type = fscan.next();
				temp.name = fscan.next();
				temp.cost = fscan.nextInt();
				temp.stock = fscan.nextInt();
				product[i] = temp;
			}
			
			for(int i=0; i<count; i++) {
				
				System.out.println(loadCategory + product[i].category);
				System.out.println(loadType + product[i].type);
				System.out.println(loadName + product[i].name);
				System.out.println(loadCost + product[i].cost);
				System.out.println(loadStock + product[i].stock);
			}
			fscan.close();
			fis.close();
		}
			

	}

}
