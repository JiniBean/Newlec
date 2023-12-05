package com.newlecture.study.string;


public class StringAndReference {
	public static void main(String[] args) {
		
		String up1 = "┌";
		String up2 = "┬";
		String up3 = "┐";
		
		String middle1 = "├";
		String middle2 = "┼";
		String middle3 = "┤";
				
		String douwn1 = "└";
		String douwn2 = "┴";
		String douwn3 = "┘";
		
		
		for(int i=0; i<9; i++) {
			for(int j=0;j< 9;j++) {
				
				if (i==0 && j==0 )
					System.out.print(up1);
				else if(i==0&&j==8)
					System.out.print(up3);
				else if(i==0)
					System.out.print(up2);
				else if(i==8&&j==0)
					System.out.print(douwn1);
				else if(i==8&&j==8)
					System.out.print(douwn3);
				else if(i==8)
					System.out.print(douwn2);
				else if(j==0)
					System.out.print(middle1);
				else if(j==8)
					System.out.print(middle3);
				else
					System.out.print(middle2);
			}
			System.out.println();
		}
				
		
	}
}
