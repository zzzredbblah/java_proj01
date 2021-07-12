package questions;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {

		int num[] = new int[10];
		int i;
		Scanner scanner = new Scanner(System.in);

		System.out.println("양의 정수 10개를 입력하시오 >>");
		for (i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}
		System.out.print("3의 배수는 ");

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