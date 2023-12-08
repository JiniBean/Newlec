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
		System.out.println();
		System.out.println("                                                                                                                                                                           ");
		System.out.println("   DDDDDDDDDDDDD                                                     tttt                       GGGGGGGGGGGGG                                                              ");
		System.out.println("   D::::::::::::DDD                                               ttt:::t                    GGG::::::::::::G                                                              ");
		System.out.println("   D:::::::::::::::DD                                             t:::::t                  GG:::::::::::::::G                                                              ");
		System.out.println("   DDD:::::DDDDD:::::D                                            t:::::t                 G:::::GGGGGGGG::::G                                                              ");
		System.out.println("     D:::::D    D:::::D  aaaaaaaaaaaaa  rrrrr   rrrrrrrrr   ttttttt:::::ttttttt          G:::::G       GGGGGG  aaaaaaaaaaaaa      mmmmmmm    mmmmmmm       eeeeeeeeeeee    ");
		System.out.println("     D:::::D     D:::::D a::::::::::::a r::::rrr:::::::::r  t:::::::::::::::::t         G:::::G                a::::::::::::a   mm:::::::m  m:::::::mm   ee::::::::::::ee  ");
		System.out.println("     D:::::D     D:::::D aaaaaaaaa:::::ar:::::::::::::::::r t:::::::::::::::::t         G:::::G                aaaaaaaaa:::::a m::::::::::mm::::::::::m e::::::eeeee:::::ee");
		System.out.println("     D:::::D     D:::::D          a::::arr::::::rrrrr::::::rtttttt:::::::tttttt         G:::::G    GGGGGGGGGG           a::::a m::::::::::::::::::::::me::::::e     e:::::e");
		System.out.println("     D:::::D     D:::::D   aaaaaaa:::::a r:::::r     r:::::r      t:::::t               G:::::G    G::::::::G    aaaaaaa:::::a m:::::mmm::::::mmm:::::me:::::::eeeee::::::e");
		System.out.println("     D:::::D     D:::::D aa::::::::::::a r:::::r     rrrrrrr      t:::::t               G:::::G    GGGGG::::G  aa::::::::::::a m::::m   m::::m   m::::me:::::::::::::::::e ");
		System.out.println("     D:::::D     D:::::Da::::aaaa::::::a r:::::r                  t:::::t               G:::::G        G::::G a::::aaaa::::::a m::::m   m::::m   m::::me::::::eeeeeeeeeee  ");
		System.out.println("     D:::::D    D:::::Da::::a    a:::::a r:::::r                  t:::::t    tttttt      G:::::G       G::::Ga::::a    a:::::a m::::m   m::::m   m::::me:::::::e           ");
		System.out.println("   DDD:::::DDDDD:::::D a::::a    a:::::a r:::::r                  t::::::tttt:::::t       G:::::GGGGGGGG::::Ga::::a    a:::::a m::::m   m::::m   m::::me::::::::e          ");
		System.out.println("   D:::::::::::::::DD  a:::::aaaa::::::a r:::::r                  tt::::::::::::::t        GG:::::::::::::::Ga:::::aaaa::::::a m::::m   m::::m   m::::m e::::::::eeeeeeee  ");
		System.out.println("   D::::::::::::DDD     a::::::::::aa:::ar:::::r                    tt:::::::::::tt          GGG::::::GGG:::G a::::::::::aa:::am::::m   m::::m   m::::m  ee:::::::::::::e  ");
		System.out.println("   DDDDDDDDDDDDD         aaaaaaaaaa  aaaarrrrrrr                      ttttttttttt               GGGGGG   GGGG  aaaaaaaaaa  aaaammmmmm   mmmmmm   mmmmmm    eeeeeeeeeeeeee  ");
		System.out.println("                                                                                                                                                                           ");
		System.out.println();
		System.out.println();

		System.out.println();
		System.out.println("             ,-'\"\"\"`-,    ,-----.      \r\n"
				+ "           ,' \\ _|_ / `.  | 501 |                           _  \\|/\r\n"
				+ "          /`.,'\\ | /`.,'\\ `-----'  |                  -c/,=<<  ) \\\r\n"
				+ "         (  /`. \\|/ ,'\\  )      |  H                   ( /    < ) |\r\n"
				+ "         |--|--;=@=:--|--|   |  H  U                   //    \"(  _/\r\n"
				+ "         (  \\,' /|\\ `./  )   H  U  |                  //_,___,/-' `\\_\r\n"
				+ "          \\,'`./ | \\,'`./    U  | (|)                 (___|       me \\`\\\r\n"
				+ "           `. / \"\"\" \\ ,'     | (|)                        '--)        \\--\r\n"
				+ "             '-._|_,-`      (|)                              (         ) \\\r\n"
				+ "                                                              \\=(===)==/\\ \\\r\n"
				+ "                                                              |        >>(8\\=\r\n"
				+ "                                                              |    ,    \\ \"\"\r\n"
				+ "                                                              |   / \\    \\\r\n"
				+ "                                                              |  /   \\    \\\r\n"
				+ "                                                              |  \\    \\    \\\r\n"
				+ "                                                              |___\\    \\____\\\r\n"
				+ "                                                               ( )         ( )  ");
	}
	
	
	
	public void intro() throws InterruptedException {
		
		Thread.sleep(900);
		System.out.println("당신에게는 3개의 다트핀이 주어집니다.\n");
		Thread.sleep(1000);
		System.out.println("다트보드에는 20부터 1까지의 타겟존이 있고\n\n각각 싱글존, 더블존, 트리플존, 미스존이 있습니다.\n");
		Thread.sleep(1000);
		System.out.println("미스나면 0점, 더블존은 x2, 트리플존 x3의 점수를 가져갑니다\n");
		Thread.sleep(1000);
		System.out.println("타겟이 좋을 수록 맞추기도 어려워지겠죠??\n\n미스나지 않게 조심하세요!!\n\n");
		Thread.sleep(1000);
		System.out.println("자, 그럼 시작합니다~~!\n");
		Thread.sleep(1000);
	}
	

	public String[][] setting() {
		
		int str = 0;
		int num = 0;
		int n = 3;
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			
		System.out.println("플레이어 수를 정해주세요");
		System.out.print(">>");
		
		try {
			str = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("0 이상의 정수만 입력헤주세요\n");
			str = -1;
		}
		if(str>0)
			run = false;
		}
		
		num = str;
		
		String[][] players = new String[num][n+2];
		for(int i=0; i<num; i++) {
			System.out.printf("\n유저%d의 이름을 정해주세요.\n", i+1);
			System.out.print(">>");
			players[i][0] = sc.nextLine();
			System.out.println();
		}
		
		return players;
	}
	
	public int throwDart() {
		
		int str = 0;
		int target = 0;
		
		Scanner sc = new Scanner(System.in);

		boolean bool = true;
		while (bool) {
			
			System.out.println("타겟을 향해 던지세요! (던지고 싶은 타겟의 숫자를 입력해주세요)\n");
			System.out.print(">>");

			try {
				str = sc.nextInt();

			} catch (Exception e) {
				target = -1;
			}
			if(target>-1)
				target = str;
			
			bool=false;
		}		
		System.out.println("\n\n");
		return target;
	}
	
	
	public void throwAffect() throws InterruptedException {
		
		System.out.println("                          ___     ");      
		System.out.println("          쓔우웅~!!    /\\ _ /\\   ");     
		System.out.println("    >>>----           / /\\ /\\ \\  ");   
		System.out.println(" >>>----             |---(*)---| ");     
		System.out.println("                      \\ \\/_\\/ /  ");      
		System.out.println("          >>>----      \\/___\\/   ");    
		System.out.println("                                 ");
		System.out.println();
		Thread.sleep(500);
	}
	
	
	public int hitTriple(int target) {
		System.out.println("WOW!! TRIPLE!!\n");
		int score = target * TRIPLE;
		return score;
	}
	
	public int hitDouble(int target) {
		System.out.println("GOOD!! DOUBLE!!\n");
		int score = target * DOUBLE;
		return score;
	}
	
	public int hitSingle(int target) {
		System.out.println("SINGLE!!\n");
		int score = target * SINGLE;
		return score;
	}
	
	public int hitMiss(int target) {
		System.out.println("OH NOOO, MISS!!\n");
		int score = target * MISS;
		return score;
	}
	
	
	public int scoreCheck(int target) {
		
		Random ran = new Random();
		int per = ran.nextInt(100)+1;
		
		int perHitTriple=40;
		int perHitDouble=40;
		int perHitSingle=20;
		
		int score;
		int x;
		int y;
		int z;
		
		if(target>15) {
			perHitTriple /=2;
			perHitDouble /=2;
		}
		else if(target>10) 
			perHitDouble /=2;
		
		x=100-perHitTriple;
		y=(x-1)-perHitDouble;
		z=(y-1)-perHitSingle;
		
		if(100 >= per && per >=x)
			score = hitTriple(target);
		else if(x> per && per >=y)
			score = hitDouble(target);
		else if(y> per && per >=z)
			score = hitSingle(target);
		else
			score = hitMiss(target);
		
		return score;
				
	}
	
	public boolean repeatGame() {
		boolean isRun = true;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n재도전 하시겠습니까? (게임을 종료하시려면 1을, 다시 시작하시려면 아무 키나 눌러주세요");
		
		String refuse = scan.nextLine();
		if(refuse.equals("1")) {
			isRun = false;
			System.out.println("게임이 종료되었습니다.");
		}
		
		return isRun;
	}
}
