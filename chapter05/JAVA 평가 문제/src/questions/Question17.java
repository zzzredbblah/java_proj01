package questions;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str[] = { "����", "����", "��" };
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while (true) {
			int n = (int) (Math.random() * 3);
			System.out.print("���� ���� ��! >> ");
			
			String word = scanner.next();
			if (word.equals("�׸�")) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			System.out.print("����ڴ� " + word + ", ��ǻ�� = " + str[n] + ", ");
			if (word.equals("����")) {
				if (str[n].equals("����"))
					System.out.println("�����ϴ�.");
				
				else if (str[n].equals("����"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				
				else if (str[n].equals("��"))
					System.out.println("����ڰ� �̰���ϴ�.");
				
			} else if (word.equals("����")) {
				if (str[n].equals("����"))
					System.out.println("����ڰ� �̰���ϴ�.");
				
				else if (str[n].equals("����"))
					System.out.println("�����ϴ�.");
				
				else if (str[n].equals("��"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				
			} else if (word.equals("��")) {
				if (str[n].equals("����"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				
				else if (str[n].equals("����"))
					System.out.println("����ڰ� �̰���ϴ�.");
				
				else if (str[n].equals("��"))
					System.out.println("�����ϴ�.");
			} else
				System.out.println("����, ����, �� �߿� �Է��ϼ���.");
		}
		scanner.close();

	}

}
