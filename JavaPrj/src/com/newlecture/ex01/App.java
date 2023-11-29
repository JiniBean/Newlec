package com.newlecture.ex01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class App {

	public static void main(String[] args) throws IOException {
//		char ch = 'a';
		
		FileOutputStream fos = new FileOutputStream("res/ex01.txt");
		PrintStream fout = new PrintStream(fos);
//		fout.println("abcd");
		
		int nu = 5;
		System.out.println(--nu + 3 + nu++);
		fos.write(65+0);
		fos.write(64+2);
//		fos.write(ch+2);
//		fos.write(ch+3);
		fos.flush();
		fos.close();
		
		
	}

}
