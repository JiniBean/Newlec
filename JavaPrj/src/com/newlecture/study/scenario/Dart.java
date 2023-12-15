package com.newlecture.study.scenario;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
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
		System.out.println("다트보드에는 20부터 1까지의 타겟존이 있고\n\n각각 트리플존, 더블존, 싱글존, 미스존이 있습니다.\n");
		Thread.sleep(1000);
		System.out.println("트리플존은 3배, 더블존은 2배, 미스존은 0점입니다\n");
		Thread.sleep(1000);
		System.out.println("높은 점수의 타겟을 노릴 수록 맞추기도 어려워지겠죠??\n\n미스나지 않게 조심하세요!!\n\n");
		Thread.sleep(1000);
		System.out.println("자, 그럼 시작합니다~~!\n");
		Thread.sleep(1000);
	}
	
	//게임 세팅하기
	public SettingInfo setGame() {
		SettingInfo info =  new SettingInfo();
		
		info.numRound = 3; //게임을 3라운드 진행
		
		String str;
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		//플레이어 수 입력받기
		while(run) {
			
			System.out.println("플레이어 수를 정해주세요");
			System.out.print(">>");
			
			//유효성검사
			str =sc.nextLine();
			
			if( !('0' < str.charAt(0) && str.charAt(0) <='9') ) {
				System.out.println("0 이상의 정수만 입력헤주세요\n");
				continue;
			}
			
			info.numPlayers = Integer.parseInt(str);
			run = false;
			}
			
		info.players = new DartPlayer[info.numPlayers];
		
		//입력 받은 수만큼 유저이름 받기
		for(int i=0; i<info.numPlayers; i++) {
			DartPlayer temp = new DartPlayer();
			System.out.printf("\n유저%d의 이름을 정해주세요.\n", i+1);
			System.out.print(">>");
			temp.name = sc.nextLine();
			info.players[i] = temp;
			System.out.println();
		}
	
		return info;
	}
	
	//다트 던지기
	public int throwDart() {
		
		String str;
		int target = 0;
		int temp = 0;
		
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		while (run) {
			
			System.out.println("타겟을 향해 던지세요! (던지고 싶은 타겟의 숫자를 입력해주세요)\n");
			System.out.print(">>");
			
			//유효성 검사
			str =sc.nextLine();
			
			boolean isNum = !Character.isDigit(str.charAt(0));//입력값이 숫자가 아닐때
			
			if(isNum) {
				System.out.println("잘못 입력하셨습니다! 다시 던져주세요! (1부터 20의 정수만 입력해주세요) \n");
				continue;
			}
			
			temp = Integer.parseInt(str);
			
			boolean isRightTarget = !(1<=temp && temp <=20);//1~20이 아닐때
			if(isRightTarget) {
				System.out.println("잘못 입력하셨습니다! 다시 던져주세요! (1부터 20의 정수만 입력해주세요) \n");
				continue;
			}
			
			target = temp;
			run=false;
		}
		System.out.println();
		System.out.println();
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
	
	//다트가 어디에 맞았니?
	public int scoreCheck(int target) {
		//1~100까지의 난수 : 각 타겟 존에 맞을 확률
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
		
		//1~100까지 트리플, 더블, 싱글, 미스존 범위 나누기
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
	
	//총점수 및 등수 출력
	public SettingInfo scoreCalculate(SettingInfo info) {
		
		for(int p=0; p<info.numPlayers; p++)
			System.out.printf("%s : %s점  \n\n", info.players[p].name, info.players[p].totalScore);
		
		if(info.numPlayers==2) {
			
			boolean same = info.players[0].totalScore==info.players[1].totalScore;
			boolean whoWin = info.players[0].totalScore>info.players[1].totalScore;
		
			if(same)
				System.out.println("MATCH Tied!");
			else
				System.out.printf(whoWin? "\n\n%s WIN!" : "\n\n%s WIN!" , info.players[0].name, info.players[1].name);
		}
		else if(info.numPlayers>2) {
			
			DartPlayer rank;
			
			for(int p=0; p<info.numPlayers-1; p++)
				for(int i=0; i<info.numPlayers-(1+p); i++) {
					
					int player1 = info.players[i].totalScore;
					int player2 = info.players[i+1].totalScore;
					
					if( player1 < player2 ) {
						rank = info.players[i];
						info.players[i] = info.players[i+1];
						info.players[i+1] = rank;
					}
				}
			
			for(int p=0, i=1; p<info.numPlayers; p++, i++)
				System.out.printf("\n%d등 : %s\n", i, info.players[p].name);
		}
		return info;
	}
	
	//반복 여부
	public boolean repeatGame() {
		boolean isRun = true;
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("\n재도전 하시겠습니까? (게임을 종료하시려면 1을, 다시 시작하시려면 아무 키나 눌러주세요");
		String refuse = scan.nextLine();
		
		if(refuse.equals("1"))
			isRun = false;
		
		return isRun;
	}
	
	//기록 저장 여부
	public String loadToHall(SettingInfo info) throws IOException {
		FileOutputStream fos = new FileOutputStream("res/HallOfFame.txt", true);
		PrintStream fout = new PrintStream(fos);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("명예의 전당에 올리시겠습니까? (원하지 않는다면 1을 기록을 저장하시려면 아무 키나 눌러주세요");
		String temp = scan.nextLine();
		
		if(temp.equals("1"))
			return temp; //메인 메소드로 돌아감
		
		System.out.println("기록을 등재하고 싶은 유저의 번호을 모두 적어주세요(번호 구분은 스페이스가 기준입니다.");
		
		boolean isRun = true;
		while(isRun) {
			for(int i=0; i<info.numPlayers; i++)
				System.out.printf("%d. %s\n", i+1, info.players[i].name);
			System.out.printf("%d. ALL", info.numPlayers+1);
			
			String line = scan.nextLine();
			
			boolean isNum = !Character.isDigit(line.charAt(0));//입력값이 숫자가 아닐때
			
			if(isNum) {
				System.out.println("잘못 입력하셨습니다! 다시 던져주세요! (1부터 20의 정수만 입력해주세요) \n");
				continue;
			}
			String[] tokens = line.split(" ");
			
			isRun = false;
		}
		
		for(int i=0; i; i++) {
			System.out.printf("%s님이 명예의 전당에 등재되었습니다.", "은진");
			
		}
		
		fout.close();
		fos.close();
		return temp;

	}
}
