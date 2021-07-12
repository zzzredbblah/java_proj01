package questions;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str[] = { "가위", "바위", "보" };
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while (true) {
			int n = (int) (Math.random() * 3);
			System.out.print("가위 바위 보! >> ");
			
			String word = scanner.next();
			if (word.equals("그만")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			System.out.print("사용자는 " + word + ", 컴퓨터 = " + str[n] + ", ");
			if (word.equals("가위")) {
				if (str[n].equals("가위"))
					System.out.println("비겼습니다.");
				
				else if (str[n].equals("바위"))
					System.out.println("컴퓨터가 이겼습니다.");
				
				else if (str[n].equals("보"))
					System.out.println("사용자가 이겼습니다.");
				
			} else if (word.equals("바위")) {
				if (str[n].equals("가위"))
					System.out.println("사용자가 이겼습니다.");
				
				else if (str[n].equals("바위"))
					System.out.println("비겼습니다.");
				
				else if (str[n].equals("보"))
					System.out.println("컴퓨터가 이겼습니다.");
				
			} else if (word.equals("보")) {
				if (str[n].equals("가위"))
					System.out.println("컴퓨터가 이겼습니다.");
				
				else if (str[n].equals("바위"))
					System.out.println("사용자가 이겼습니다.");
				
				else if (str[n].equals("보"))
					System.out.println("비겼습니다.");
			} else
				System.out.println("가위, 바위, 보 중에 입력하세요.");
		}
		scanner.close();

	}

}
