package questions;

public class Question14 {

	public static void main(String[] args) {

		int[] num = new int[10];
		int sum = 0;

		System.out.print("·£´ýÇÑ Á¤¼öµé : ");

		for (int j = 0; j < 10; j++) {
			int i = (int) (Math.random() * 10 + 1);
			num[j] = i;
			System.out.print(num[j] + " ");
		}

		System.out.println();

		for (int j = 0; j < num.length; j++) {
			sum += num[j];
		}
			System.out.println("Æò±ÕÀº " + (double) sum/num.length);

	}
}