package questions;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		int money[] = new int[8];
		int i;

		System.out.println("�ݾ��� �Է��Ͻÿ� >> ");
		int num = scanner.nextInt();

		for (i = 0; i < unit.length; i++) {
			money[i] = num / unit[i];
			num = num % unit[i];
			System.out.println(unit[i] + "�� ¥�� : " + money[i] + "��");
		}
	}

}
