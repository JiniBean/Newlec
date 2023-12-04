package com.newlecture.study.scenario;

public class sss {
	public static void main(String[] args) {

		int target = 30;

		int perHitTriple = (100 - (target * 3));
		int perHitDouble = (100 - (target * 2));
		int perHitSingle = (100 - (target * 1));
		int perHitMiss = (100 - (target * 0));
		
		System.out.println(perHitTriple);
		System.out.println(perHitDouble);
		System.out.println(perHitSingle);
		System.out.println(perHitMiss);

	}
}
