package questions;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {

		int num[] = new int[10];
		int i;
		Scanner scanner = new Scanner(System.in);

		System.out.println("���� ���� 10���� �Է��Ͻÿ� >>");
		for (i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}
		System.out.print("3�� ����� ");

		for (i = 0; i < num.length; i++) {
			if (num[i] % 3 == 0) {
				if (num[i] == 0)
					continue;

				System.out.print(num[i] + " ");
			}
			scanner.close();
		}

	}
}